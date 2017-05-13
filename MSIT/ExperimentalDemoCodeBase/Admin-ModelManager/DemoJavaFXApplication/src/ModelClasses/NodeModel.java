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
public class NodeModel {
    private String name;
    PropertiesModel properties = new PropertiesModel();
    private List<String> linkedTo = new ArrayList<String>();

    public List<String> getLinkedTo() {
        return linkedTo;
    }

    public void setLinkedTo(List<String> linkedTo) {
        this.linkedTo = linkedTo;
    }

    public PropertiesModel getProperties() {
        return properties;
    }

    public void setProperties(PropertiesModel properties) {
        this.properties = properties;
    }

    
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   
    
}
