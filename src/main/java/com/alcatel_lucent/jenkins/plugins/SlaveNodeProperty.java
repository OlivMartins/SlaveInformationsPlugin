package com.alcatel_lucent.jenkins.plugins;
import java.util.List;

import org.kohsuke.stapler.Ancestor;
import org.kohsuke.stapler.StaplerRequest;

import jenkins.model.Jenkins;

import hudson.Extension;
import hudson.model.Node;
import hudson.slaves.NodeProperty;
import hudson.slaves.NodePropertyDescriptor;
import hudson.slaves.SlaveComputer;


public class SlaveNodeProperty extends NodeProperty<Node> {

	private String nodeName; 

	public Node getNode() {
		if (node == null) {
			setNode(Jenkins.getInstance().getNode(nodeName));
		}
		return node;
	}

	@Override
	public NodePropertyDescriptor getDescriptor() {
		return super.getDescriptor(); 
	}

	@Extension
	public static class DescriptorImpl extends NodePropertyDescriptor {       
		
		
		private static Node getNodeProperty(StaplerRequest req)
		{                
			List<Ancestor> ancestors = req.getAncestors();
			if (ancestors.isEmpty()) {
				assert false : "StaplerRequest is empty";
			return null;
			}

			Object node = ancestors.get(ancestors.size()-1).getObject();
			if (SlaveComputer.class.isAssignableFrom(node.getClass())) {
				return ((SlaveComputer)node).getNode();
			} else {
				assert false : "Test1";
			return null;
			}
		}

		@Override
		public boolean isApplicable( Class<? extends Node> Type ) {
			return true;
		}

		@Override
		public String getDisplayName() {
			
			return "TEST NODE PROPERTY";
		}         
	}
}