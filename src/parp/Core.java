/**
 * 
 */
package parp;

import parp.modules.SensorModuleHandler;
import parp.modules.AuthModuleHandler;
import parp.modules.CameraModuleHandler;

/**
 * @author Jan Alexander Stiehl
 *
 */
public class Core {
	/**
	 * Initializes system core.
	 */
	private Core() {
		// TODO Auto-generated constructor stub
	}

	private static Core core = new Core();

	public static Core getInstance() {
		return core;
	}

	private IAlarmListener al;

	public void setAlarmActive(boolean active) {
		this.al = (active) ? new ActiveAlarmListener() : new InactiveAlarmListener();
	}

	public String getAlarmStatus() {
		if (al == null)
			return "undefined";
		return al.getActive();
	}

	private SensorModuleHandler sensorHandler = null;

	public SensorModuleHandler getSensorHandler() {
		return sensorHandler;
	}

	private AuthModuleHandler authHandler = null;

	public AuthModuleHandler getAuthHandler() {
		return authHandler;
	}
	
	private CameraModuleHandler cameraHandler = null;
	
	public CameraModuleHandler getCameraHandler(){
		return cameraHandler;
	}

}
