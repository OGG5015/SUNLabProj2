module com.example.sunlabproj {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.sunlabproj to javafx.fxml;
    exports com.example.sunlabproj;
}