package ccnt.gf.imonitor;

import java.util.List;

import ccnt.gf.imonitor.engine.CaptureEngine;
import ccnt.gf.imonitor.engine.CaptureEngineFactory;
import ccnt.gf.imonitor.engine.DevInfo;

public class Main {
	
	public static void main(String[] args) {
		/**
		 * get all network devices
		 */
		CaptureEngine captureEngine = new CaptureEngineFactory().createCaptureEngine();
		List<DevInfo> result = captureEngine.findAllDevs();
		for (DevInfo devInfo : result)
			System.out.println(devInfo);
	}
	
}
