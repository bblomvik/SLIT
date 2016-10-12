/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slit.prototype.pkg2;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;



/**
 *
 * @author mathiashartveit1
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML private TextArea textArea;

    @FXML private Label moduleLabel;
    
    @FXML private Button modul1Button;
    @FXML private Button modul2Button;
    @FXML private Button modul3Button;
    @FXML private Button modul4Button;
    @FXML private Button modul5Button;
    @FXML private Button modul6Button;
    @FXML private Button modul7Button;
    @FXML private Button modul8Button;
    @FXML private Button modul9Button;
    @FXML private Button modul10Button;
    
    @FXML private Button infoButton;
    
    
    
    ModulDatabase modulDatabase = new ModulDatabase();
    URL url;
    String currentModul; // TODO: Change to an enum?
    
    
  
    
    @FXML
    protected void handleTextFieldAction(ActionEvent e) {
        if (e.getSource().equals(modul1Button)) {
            ayy(modulDatabase.modulOppgaver.get("1"));
            currentModul = "Modul 1";
            moduleLabel.setText(currentModul);
        }
        if (e.getSource().equals(modul2Button)) {
            ayy(modulDatabase.modulOppgaver.get("2"));
        }
        if (e.getSource().equals(modul3Button)) {
            ayy(modulDatabase.modulOppgaver.get("3"));
        }
        if (e.getSource().equals(modul4Button)) {
            ayy(modulDatabase.modulOppgaver.get("4"));
        }
        if (e.getSource().equals(modul5Button)) {
            ayy(modulDatabase.modulOppgaver.get("5"));
        }
        if (e.getSource().equals(modul6Button)) {
            ayy(modulDatabase.modulOppgaver.get("6"));
        }
        if (e.getSource().equals(modul7Button)) {
            ayy(modulDatabase.modulOppgaver.get("7"));
        }
        if (e.getSource().equals(modul8Button)) {
            ayy(modulDatabase.modulOppgaver.get("8"));
        }
        if (e.getSource().equals(modul9Button)) {
            ayy(modulDatabase.modulOppgaver.get("9"));
        }
        if (e.getSource().equals(modul10Button)) {
            ayy(modulDatabase.modulOppgaver.get("10"));
        }
        
    }
    
    
    
    @FXML
    protected void handleInfoButton(ActionEvent evnt) {
        if (textArea.isVisible()) {
            textArea.setVisible(false);
        }
        
        String tempurl = "";
        
        if (evnt.getSource().equals(infoButton)) {
            
            if (currentModul != null) {
                if (currentModul.equals("Modul 1")) {
                    tempurl = modulDatabase.modulInfoLink.get("1");
                }
                
                
                
                
                
                
                
                try {
                 url = new URL(tempurl);
        
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            
            
               SLITPrototype2.openURL(url);
                
            }

        }
        
        
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

    }    
    
     @FXML
    protected void ayy(String text) {
        textArea.setVisible(true);
        textArea.setText(text);
    }
    
    
    
    
    
    
    public void handleCloseButton(ActionEvent e) {
        Platform.exit();
    }
    
}
