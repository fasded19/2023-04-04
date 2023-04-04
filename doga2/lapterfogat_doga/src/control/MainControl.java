/*
* File: MainControl.java
* Author: Nedved Balázs
* Copyright: 2023, Nedved Balázs
* Group: Szoft 1/1/N
* Date: 2023-04-04
* Github: https://github.com/fasded19/
* Licenc: GNU GPL
*/
package control;

import javafx.scene.control.Button;
import model.MainModel;
import view.MainPanel;

public class MainControl {
    MainPanel mainPanel;
    
    MainModel mainModel;
    public MainControl(){
        this.mainPanel=new MainPanel();
        this.mainModel=new MainModel();
        this.handleEvent();
    }
    public MainPanel getMainPanel() {
        return mainPanel;
    }
    public void handleEvent(){
        Button calcButton=this.mainPanel.getButtonPanel().getCalcButton();
        calcButton.setOnAction(e -> {
            double input=Double.parseDouble(this.mainPanel.getInputPanel().getValue());
            double result=this.mainModel.calcVolume(input);
            mainPanel.getResultPanel().setValue(String.valueOf(result));
        });
    }
    
}
