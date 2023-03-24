module com.example.arraylists {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.arraylists to javafx.fxml;
    exports com.example.arraylists;
}