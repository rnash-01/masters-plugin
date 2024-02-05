package com.getcapacitor;
import static org.junit.Assert.*;
import org.junit.Test;
import com.uolscubamasters.app.python.PyFacePlugin;
import com.getcapacitor.PluginCall;

public class PyFaceTest {
	private PyFacePlugin pyFace;

	@Override
	protected void setUp() throws Exception {
		pyFace = new PyFacePlugin();
	}
	
	@Override
	protected void tearDown() throws Exception {
		
	}
	
	/*	@Test
	public void loadPyFile() throws Exception {
		PluginCall call = new PluginCall(
		int result = pyFace.loadBuhlmann({ fPath: "test_script.py" });
		assertEquals(result, 0);
	}

	@Test
	public void failNonExistant() throws Exception {
		int result = pyFace.loadBuhlmann({ fPath: "does_not_exist.py" });
		assertEquals(result, 1);
		}*/
}
