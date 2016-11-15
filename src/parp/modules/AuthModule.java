/**
 * 
 */
package parp.modules;

import java.net.Socket;
import java.util.Collection;

/**
 * @author Jan Alexander Stiehl
 * 
 * This class represents an authorization module, which is used to disengage a scheduled alarm.
 * Such modules can be e.g. an RFID reader or a keypad.
 */
public class AuthModule extends Module {
	
	public AuthModule(Socket accept) {
		// TODO Auto-generated constructor stub
		super(accept);
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private Collection<AuthKey> authKeys = null;
	
	/**
	 * This method, when invoked, prepares the authorization module, depending on type, to accept a new authorization key.
	 * This key may e.g. be another RFID chip (in case of an RFID reader) or a new PIN (in case of a keypad).
	 */
	public void pairKey(){
		
	}

	/**
	 * 
	 * @return copy of the collection of all authorization keys, such as PINs or RFID chips.
	 */
	public Collection<AuthKey> getAuthKeys(){
		return authKeys;
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
