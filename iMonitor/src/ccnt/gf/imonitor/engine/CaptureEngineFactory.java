package ccnt.gf.imonitor.engine;

import ccnt.gf.imonitor.engine.internal.CaptureEngineImpl;

public class CaptureEngineFactory {
	
	public CaptureEngine createCaptureEngine() {
		return new CaptureEngineImpl();
	}
	
}
