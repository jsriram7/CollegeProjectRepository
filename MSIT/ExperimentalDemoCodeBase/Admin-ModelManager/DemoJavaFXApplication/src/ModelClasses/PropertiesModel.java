/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelClasses;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sriram
 */
public class PropertiesModel {
    private List<TextBoxModel> textBoxProperties = new <TextBoxModel> ArrayList();
    private List<DropDownModel> dropDownProperties = new <DropDownModel> ArrayList();
    private List<TextAreaModel> textAreaProperties = new <TextAreaModel> ArrayList();

    public List<TextBoxModel> getTextBoxProperties() {
        return textBoxProperties;
    }

    public void setTextBoxProperties(List<TextBoxModel> textBoxProperties) {
        this.textBoxProperties = textBoxProperties;
    }

    public List<DropDownModel> getDropDownProperties() {
        return dropDownProperties;
    }

    public void setDropDownProperties(List<DropDownModel> dropDownProperties) {
        this.dropDownProperties = dropDownProperties;
    }

    public List<TextAreaModel> getTextAreaProperties() {
        return textAreaProperties;
    }

    public void setTextAreaProperties(List<TextAreaModel> textAreaProperties) {
        this.textAreaProperties = textAreaProperties;
    }

    
    
}
