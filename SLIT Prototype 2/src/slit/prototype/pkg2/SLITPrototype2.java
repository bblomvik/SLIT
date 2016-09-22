/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slit.prototype.pkg2;


import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.stage.StageStyle;


/**
 *
 * @author mathiashartveit1
 */
public class SLITPrototype2 extends Application {

    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.getIcons().add(new Image(getClass().getResourceAsStream("iMac-icon.png")));
        
        
        
        
        
        
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        launch(args);
        
     
        
        
    }



    /*
        We probably want to move this, but for now these static
        Functions will let us open urls from where we find ourselves
        In the code.
    */
    
    // This is the function that we use whenever we want
    // To open a URL in our browser.
    public static void openURL(URL url) {
    try {
         openWebpage(url.toURI()); 
        } catch (URISyntaxException e) { // In case things go wrong.
            e.printStackTrace();
        }
    }
    
    
    /*
        As doing try and catches over and over can be a bit tricky,
        the conversion to uri and call to the desktop browser
        is kept in its own function here.
    */
    static void openWebpage(URI uri) {
    Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
    if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
        try {
            desktop.browse(uri);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
    
    
    



    
}
