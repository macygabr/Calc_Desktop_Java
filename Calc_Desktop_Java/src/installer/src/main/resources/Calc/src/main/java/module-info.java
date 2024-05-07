module com.example.calc {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.calc to javafx.fxml;
    exports com.example.calc;
}