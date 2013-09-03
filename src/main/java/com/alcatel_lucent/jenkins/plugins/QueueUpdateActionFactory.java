package com.alcatel_lucent.jenkins.plugins;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


import hudson.model.Action;
import hudson.model.TransientComputerActionFactory;
import hudson.model.Computer;


public class QueueUpdateActionFactory extends TransientComputerActionFactory {

	@Override
	public Collection<? extends Action> createFor(Computer target){
		List<Action> actions = new ArrayList<Action>();
        actions.add(new QueueUpdateAction(target));
        return actions;
	}
	
}
