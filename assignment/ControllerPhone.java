package assignment;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerPhone implements Initializable {
    public TextField txtName;
    public TextField txtPhone;

    public TableView table;
    public TableColumn nameCl;
    public TableColumn phoneCL;

    public ObservableList<PhoneNumber> phoneList;



    public void initialize(URL location, ResourceBundle resources) {
        phoneList  = FXCollections.observableArrayList();
        nameCl.setCellValueFactory(new PropertyValueFactory<PhoneNumber, String>("name"));
        phoneCL.setCellValueFactory(new PropertyValueFactory<PhoneNumber, String>("phone"));
        table.setItems(phoneList);
    }

    public void submit(){
        PhoneNumber np = new PhoneNumber();
        np.setName(txtName.getText());
        np.setPhone(txtPhone.getText());
        phoneList.add(np);





    }



}
