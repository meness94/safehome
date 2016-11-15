package parp;

/**
 * This is the object type used for sending alarms to the Core. It contains the
 * system core
 * 
 * @author Jan Alexander Stiehl
 *
 */
class Alarm {

	private String sensorID;

	Alarm(String sensorID) {
		this.sensorID = sensorID;
	}
	
	public String getSensorID(){
		return sensorID;
	}

}
