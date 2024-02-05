package com.uolscubamasters.app.python;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

// From https://github.com/chaquo/chaquopy-matplotlib/
import com.chaquo.python.PyException;
import com.chaquo.python.Python;
import com.chaquo.python.PyObject;
import com.chaquo.python.android.AndroidPlatform;

import android.content.Context;

@CapacitorPlugin(name = "PyFace")
public class PyFacePlugin extends Plugin {

    private PyFace implementation = new PyFace();
	private PyObject buhlmannSource;
	private Python py;

	public PyFacePlugin() {
		if (!Python.isStarted()) {
			Python.start(new AndroidPlatform(this.getActivity().getApplicationContext()));
		}
		py = Python.getInstance();
	}

    @PluginMethod
    public void echo(PluginCall call) {
        String value = call.getString("value");

        JSObject ret = new JSObject();
        ret.put("value", implementation.echo(value));
        call.resolve(ret);
    }

	@PluginMethod
	public int loadBuhlmann(PluginCall call) {

		// fPath - more formatting needed to make
		// sure it loads correct python file
		String fPath = call.getString("fPath").replace("/", ".");
		JSObject ret = new JSObject();
		try {
			buhlmannSource = this.py.getModule(fPath);
			ret.put("message", "Successful");
			call.resolve(ret);
			return 0;
		}
		catch (Exception e) {
			ret.put("message", e.getMessage());
			call.reject(e.getMessage());
			return 1;
		}
	}
}
