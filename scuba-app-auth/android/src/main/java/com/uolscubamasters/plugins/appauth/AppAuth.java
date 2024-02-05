package com.uolscubamasters.plugins.appauth;

import android.util.Log;
import java.util.UUID;
public class AppAuth {

    public String echo(String value) {
        Log.i("Echo", value);
        return value;
    }

    public IntegrityResponse verifyAppIntegrity() {
        
        IntegrityResponse res;
        try {
            String dummyToken = "android";
            res = new IntegrityResponse(true, UUID.randomUUID().toString());
        }
        
        catch (Exception e) {
            res = new IntegrityResponse(e);
        }

        return res;
    }
}
