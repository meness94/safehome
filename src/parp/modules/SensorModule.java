/**
 * 
 */
package parp.modules;

import java.net.Socket;

/**
 * @author Jan Alexander Stiehl
 *
 */
public class SensorModule extends Module {
	public SensorModule(Socket accept) {
		// TODO Auto-generated constructor stub
		super(accept);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setActive(boolean active) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isActive() {
		// TODO Auto-generated method stub
		return false;
	}

//	@Override
//	public void setConfig(CharSequence c) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public CharSequence getConfig() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
