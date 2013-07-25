package com.alcatel_lucent.jenkins.plugins;


import java.util.List;



import hudson.model.ComputerPanelBox;
import hudson.model.Hudson;


public class ComputerWidget extends ComputerPanelBox {
	
	public List<hudson.model.Queue.BuildableItem> items() {
        return Hudson.getInstance().getQueue().getBuildableItems(super.getComputer());
    }
	
}
