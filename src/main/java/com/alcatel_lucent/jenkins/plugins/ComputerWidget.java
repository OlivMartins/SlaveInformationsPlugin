package com.alcatel_lucent.jenkins.plugins;


import java.util.List;
import hudson.Extension;
import hudson.model.BuildableItem;
import hudson.model.ComputerPanelBox;
import hudson.model.Computer;
import hudson.model.Hudson;


@Extension
public class ComputerWidget extends ComputerPanelBox {

	public List<?> items() {
        return Hudson.getInstance().getQueue().getBuildableItems(super.getComputer());
    }
	
}
