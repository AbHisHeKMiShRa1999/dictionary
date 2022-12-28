module com.example.dictionarybyabhi {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dictionarybyabhi to javafx.fxml;
    exports com.example.dictionarybyabhi;
}