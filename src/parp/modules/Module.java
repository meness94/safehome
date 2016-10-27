package parp.modules;

/**
 * 
 * @author Jan Alexander Stiehl
 *
 */
public abstract class Module implements Runnable {
	public abstract void setConfig(CharSequence c);

	public abstract CharSequence getConfig();

}