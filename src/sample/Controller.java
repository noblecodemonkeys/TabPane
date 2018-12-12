package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable
{

    @FXML
    Tab tab1;

    @FXML
    Tab tab2;

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {

        FXMLLoader loader = new FXMLLoader();
        try
        {
            AnchorPane anch1 = loader.load(getClass().getResource("Tab1.fxml"));
            tab1.setContent(anch1);
        }
        catch(IOException iex)
        {
            System.out.println("File not found");
        }
        loader = new FXMLLoader();
        try
        {
            AnchorPane anch2 = loader.load(getClass().getResource("Tab2.fxml"));
            tab2.setContent(anch2);
        }
        catch(IOException iex)
        {
            System.out.println("File not found");
        }

    }
}
