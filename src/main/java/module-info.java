module com.banking.vista {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;

    requires org.controlsfx.controls;

    opens com.banking.vista to javafx.fxml;
    exports com.banking.vista;
    exports com.banking.vista.Controllers;
    exports com.banking.vista.Controllers.Admin;
    exports com.banking.vista.Controllers.Client;
    exports com.banking.vista.Models;
    exports com.banking.vista.Views;
}