/* doesn't work with source level 1.8:
module com.mycompany.provaf {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.provaf to javafx.fxml;
    exports com.mycompany.provaf;
}
*/
