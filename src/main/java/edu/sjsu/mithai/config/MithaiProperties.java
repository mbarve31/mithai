package edu.sjsu.mithai.config;

public interface MithaiProperties {

    // Self node properties
    static String IP = "IP";
    static String ID = "ID";
    static String CONNECTED_DEVICE_IDS = "CONNECTED_DEVICE_IDS";
    static String LOCAL_GRAPH = "LOCAL_GRAPH";

    // Sensor & Data generation related properties
    static String NUMBER_OF_SENSORS = "NUMBER_OF_SENSORS";
    static String DATA_GENERATION_INTERVAL = "DATA_GENERATION_INTERVAL";

    // INJECTOR PROPERTIES
    static String MQTT_BROKER = "MQTT_BROKER";
    static String MQTT_TOPIC = "MQTT_TOPIC";

    // EXPORTER PROPERTIES
    static String EXPORTER_TYPE = "EXPORTER_TYPE";
    static String EXPORTER_REMOTE_URI = "EXPORTER_REMOTE_IP";
    static String EXPORTER_KAFKA_TOPIC = "EXPORTER_KAFKA_TOPIC";
    static String EXPORTER_TIME_INTERVAL = "EXPORTER_TIME_INTERVAL";

}
