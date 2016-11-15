package parp.modules;

import java.util.UUID;

/**
 * 
 * @author Jan Alexander Stiehl
 *
 */
public abstract class Module implements Runnable {

	private String Status;

	public CharSequence getStatus() {
		return Status;
	}
	
	private java.net.Socket socket = null;
	
	protected Module(java.net.Socket socket){
		this.socket=socket;
	}
	
	public abstract void setActive(boolean active);
	public abstract boolean isActive();
	
	public abstract String getType();

	private UUID id = null;

	public String getID() {
		if (id == null)
			return "null";
		return id.toString();
	}

	// public abstract void setConfig(CharSequence c);

	// public abstract CharSequence getConfig();

	public boolean equals(Object o) {
		if (o != null && o instanceof Module && ((Module) o).id.equals(this.id))
			return true;
		return false;
	}
}