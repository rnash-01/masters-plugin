package com.uolscubamasters.plugins.appauth;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
//import java.util.UUID;

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
        IntegrityResponse ir = implementation.verifyAppIntegrity();
        JSObject ret = new JSObject();

        try {

            ret.put("auth", ir.getAuth());
            ret.put("token", ir.getToken());
            ret.put("platform", "android");
            ret.put("error", ir.getError());
            call.resolve(ret);
        }
        catch (Exception e) {
            call.reject(e.getMessage());
        }
		
	}
}

