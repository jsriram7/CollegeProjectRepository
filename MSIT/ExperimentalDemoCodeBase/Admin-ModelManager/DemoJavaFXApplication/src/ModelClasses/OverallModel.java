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
public class OverallModel {
    private String derivedFrom;
    private String version;
    private List<NodeModel> nodes = new <NodeModel> ArrayList();

    public String getDerivedFrom() {
        return derivedFrom;
    }

    public void setDerivedFrom(String derivedFrom) {
        this.derivedFrom = derivedFrom;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public List<NodeModel> getNodes() {
        return nodes;
    }

    public void setNodes(List<NodeModel> nodes) {
        this.nodes = nodes;
    }
    
}
