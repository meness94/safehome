/**
 * 
 */
package parp;

/**
 * @author Jan Alexander Stiehl
 *
 */
class Core {
	/**
	 * Initializes system core.
	 */
	private Core() {
		// TODO Auto-generated constructor stub
	}

	private static Core core = new Core();

	public static Core getCoreI() {
		parp.modules.Module m = new parp.modules.SensorModule();
		m.getConfig();
		return core;
	}

	private IAlarmListener al;

	public IAlarmListener getAlarmListener() {
		return al;
	}

	public void setAlarmActive(boolean active) {
		this.al = (active) ? new ActiveAlarmListener() : new InactiveAlarmListener();
	}
	
}
