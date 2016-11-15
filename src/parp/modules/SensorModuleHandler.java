package parp.modules;

import java.io.IOException;
import java.net.*;
import java.util.*;

/**
 * @author Jan Alexander Stiehl
 *
 */
public class SensorModuleHandler extends ModuleHandler {

	Collection<Module> modules = new LinkedList<>();
	
	public SensorModuleHandler() {
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			sSocket = new ServerSocket(port);
			do {
				modules.add(new SensorModule(sSocket.accept()));
			} while (keepRunning);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public boolean stopSearch() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean startSearch() {
		// TODO Auto-generated method stub
		return false;
	}

}
