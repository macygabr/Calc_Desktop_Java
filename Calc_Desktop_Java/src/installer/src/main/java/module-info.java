module com.example.installer {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.installer to javafx.fxml;
    exports com.example.installer;
}