module com.civil_cons_app.civil_cons_app {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.civil_cons_app.civil_cons_app to javafx.fxml;
    exports com.civil_cons_app.civil_cons_app;
}