package parp.modules;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "SettingsHandler")
@SessionScoped

public class SettingsHandler {

	public int alarmtime = 5;
	public int loudness = 4;
	public int length = 10;
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getLoudness() {
		return loudness;
	}

	public void setLoudness(int loudness) {
		this.loudness = loudness;
	}

	public int getAlarmtime() {
		return alarmtime;
	}

	public void setAlarmtime(int alarmtime) {
		this.alarmtime = alarmtime;
	}

	public String submit() {
		System.out.println(alarmtime);
		return "";
	}
}
