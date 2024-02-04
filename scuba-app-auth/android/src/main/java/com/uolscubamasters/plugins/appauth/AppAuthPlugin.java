package com.uolscubamasters.plugins.appauth;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "AppAuth")
public class AppAuthPlugin extends Plugin {

    private AppAuth implementation = new AppAuth();

    @PluginMethod
    public void echo(PluginCall call) {
        String value = call.getString("value");

        JSObject ret = new JSObject();
        ret.put("value", implementation.echo(value));
        call.resolve(ret);
    }

	@PluginMethod
	public void verifyAppIntegrity(PluginCall call) {
		JSObject ret = new JSObject();
		ret.put("auth", true);
		ret.put("token", "ANDROID_TEST");
		call.resolve(ret);
	}
}
