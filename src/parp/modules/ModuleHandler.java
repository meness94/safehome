package parp.modules;

import java.net.ServerSocket;
import java.util.Collection;

/**
 * 
 * @author Jan Alexander Stiehl
 *
 */
public abstract class ModuleHandler implements Runnable {

	protected String status = null;
	protected ServerSocket sSocket = null;
	protected int port;
	protected boolean keepRunning = false;


	public String getStatus() {
		return status;
	}

	protected Collection<Module> modules = null;

	public Collection<Module> getModules() {
		return modules;
	}
	
	/**
	 * The use of this method to start listening for modules is discouraged.
	 */
	public abstract void run();
	
	/**
	 * Causes the ModuleHandler to stop searching for new module devices.
	 * @return true, if successful 
	 */
	public abstract boolean stopSearch();
	
	/**
	 * Causes the ModuleHandler to start searching for new module devices.
	 * @return true, if successful
	 */
	public abstract boolean startSearch();

}
