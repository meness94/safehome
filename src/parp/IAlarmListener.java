/**
 * 
 */
package parp;

/**
 * @author Jan Alexander Stiehl
 *
 */
interface IAlarmListener {
	public void pushAlarm(Alarm al);
	public String getActive();

}
