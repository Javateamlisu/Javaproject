package controller;

import java.io.IOException;

import database.Login_PasswordSQL;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.Node;

public class MainWindowController extends Login_PasswordSQL {
	public String hi;
	private Stage primaryStage;
	Login_PasswordSQL login = new Login_PasswordSQL();
	public void setMain(Main main,Stage primaryStage){
		this.primaryStage=primaryStage;
	}
	 @FXML
	    private Label lblMessage;

	    @FXML
	    private TextField txtUsername;

	    @FXML
	    private Button btnLogin;

	    @FXML
	    private PasswordField txtPassword;
	    @FXML
	    private void btnLoginAction(ActionEvent event){
			if(txtUsername.getText().equals("test") &&txtPassword.getText().equals("test")){
	    		((Node) (event.getSource())).getScene().getWindow().hide();
	    		adminPanel();
	    	}else{
	    		lblMessage.setText("Username or Password invalid");
	    	}
	    }
	    public void adminPanel(){
			try {
				FXMLLoader loader = new FXMLLoader(Main.class.getResource("/view/AdminPanel.fxml"));
		    	AnchorPane panee;
				panee = loader.load();
				Scene scenee = new Scene(panee);
				primaryStage.setScene(scenee);
				primaryStage.setTitle("Login");
				primaryStage.show();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


	    }
	    }




/*	@FXML private TextField field;
@FXML private Label label;

private Person person;



private Main main;

public void setMain(Main main){
	this.main=main;
	person = new Person("FirstName","LastName","Age");
}

public void showAlert1(){
	Alert alert = new Alert(AlertType.CONFIRMATION);
	alert.setTitle("Confirmation");
	alert.setHeaderText("Confirmation");
	alert.setContentText("I confirm this notice");
	Optional<ButtonType> result = alert.showAndWait();
	if(result.get()==ButtonType.OK){
		label.setText("OK");
		showAlert2();
	}
	else
	{
		label.setText("Fail");

	}
}
public void showAlert2(){
	TextInputDialog dialog = new TextInputDialog();
	dialog.setTitle("Input");
	dialog.setContentText("Please enter your age");
	Optional<String>result=dialog.showAndWait();
	if(result.isPresent()){
		label.setText("Age: "+result.get());
	}else{
		label.setText("NoInput ");
	}
}

public void handleButton(ActionEvent event){
	String text = field.getText();
	person.setFirstName("hihozmiana");
	label.setText(person.getFirstName()+"wiek"+person.getAge()+"Lastname "+person.getLastName());
	field.clear();
	showAlert1();
}
}
*/
