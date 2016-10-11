package edu.sjsu.mithai.graphX

import org.apache.log4j.{Level, Logger}
import org.apache.spark.graphx._
import org.apache.spark.{SparkConf, SparkContext}

import scala.collection.mutable.ListBuffer


/**
  * Created by Madhura on 9/26/16.
  */

object GraphProc {

  def main(args: Array[String]) {
    Logger.getLogger("org").setLevel(Level.OFF)
    Logger.getLogger("akka").setLevel(Level.OFF)

    class SomeData extends Serializable {
      var data: Int = _

      override def toString: String = {
        "{ data= " + data + " }"
      }
    }

    var a = new ListBuffer[SomeData]
    for (i <- 0 to 10) {
      val d = new SomeData
      d.data = i
      a += d
    }

    val gp = new GraphProc()

    val conf = new SparkConf()
      .setAppName("GraphCreator")
      .setMaster("local[2]")

    val sc = new SparkContext(conf)

    val gc = new GraphCreator

    gp.process(gc.createGraph(a.toList, sc))
  }

}

class GraphProc {

  var sparkConfig: SparkConf = _

  def setSparkConf(conf: SparkConf): Unit = {

    sparkConfig = conf
  }

  def process[D](graph: Graph[(D), Int]): Unit = {

    println("Vertice Length: ---------->" + graph.vertices.count())
    graph.vertices.collect().foreach(x => println(x + "<------Vertices"))
    graph.edges.collect().foreach(println(_))

  }
}


