/**
 * 
 */
package parp;

/**
 * 
 * @author Jan Alexander Stiehl
 *
 */
class InactiveAlarmListener implements IAlarmListener {

	@Override
	public void pushAlarm(Alarm al) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public String getActive(){
		return "inactive";
	}

}
