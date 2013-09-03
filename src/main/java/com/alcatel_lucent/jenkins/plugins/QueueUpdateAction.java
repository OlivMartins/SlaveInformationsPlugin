package com.alcatel_lucent.jenkins.plugins;

import hudson.Extension;
import hudson.model.Action;

import hudson.model.Computer;
@Extension
public class QueueUpdateAction implements Action {

	 private Computer computer;
	    
	    public QueueUpdateAction(Computer computer){
	        this.computer=computer;
	    }
	    
	    public String getIconFileName() {
	        return null;
	    }

	    public String getDisplayName() {
	        return null;
	    }

	    public String getUrlName() {
	        return "updateQueue";
	    }
	    
	  

}
