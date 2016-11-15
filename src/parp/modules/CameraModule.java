/**
 * 
 */
package parp.modules;

import java.awt.Image;
import java.net.Socket;

/**
 * @author Jan Alexander Stiehl
 *
 */
public class CameraModule extends Module {
	
	public CameraModule(Socket accept) {
		// TODO Auto-generated constructor stub
		super(accept);
	}
	
	public Image getImage(){
		return null;
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

}
