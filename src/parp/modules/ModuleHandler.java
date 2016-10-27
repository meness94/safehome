package parp.modules;

import java.util.Collection;

/**
 * 
 * @author Jan Alexander Stiehl
 *
 */
public abstract class ModuleHandler implements Runnable {

	private Collection<Module> modules;

	public Collection<Module> getModules() {
		return modules;
	}

	public void run() {
	}
}
