package parp;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ManagedProperty;

@ManagedBean

public class IndexHandler {

	public boolean alarm;

	public boolean isAlarm() {
		//if (IAlarmListener.getActive().equals("active"))
		if (true)
			alarm = true;
		else
			alarm = false;
		return alarm;
	}

	public void setAlarm(boolean alarm) {
		this.alarm = alarm;
		//IAlarmListener.pushAlarm(alarm);
	}

}
