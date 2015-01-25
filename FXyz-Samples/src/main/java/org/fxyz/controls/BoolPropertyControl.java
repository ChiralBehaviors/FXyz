/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fxyz.controls;

import javafx.beans.property.Property;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

/**
 * FXML Controller class
 *
 * @author Jason Pollastrini aka jdub1581
 */
public class BoolPropertyControl extends ControlBase<Property<Boolean>>{

    
    public BoolPropertyControl(Property<Boolean> prop) {
        super("BoolPropController.fxml", prop);
        loadBindings();
    }

    @FXML
    private CheckBox checkBox;
    @FXML
    private StackPane spacer;
    @FXML
    private Label boolPropTitle;
    public final void loadBindings() {
        controlledProp.bind(checkBox.selectedProperty());
        boolPropTitle.setText(!controlledProp.getName().isEmpty() ? controlledProp.getName() : "Empty Name");
    }
    
}