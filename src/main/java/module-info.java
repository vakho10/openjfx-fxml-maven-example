module ge.vakho.java_fxml_test {
    requires javafx.controls;
    requires javafx.fxml;

    opens ge.vakho.openjfx_fxml_maven_example to javafx.fxml;
    exports ge.vakho.openjfx_fxml_maven_example;
}