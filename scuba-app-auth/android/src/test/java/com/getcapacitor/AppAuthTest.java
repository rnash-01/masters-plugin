package com.getcapacitor;

import static org.junit.Assert.*;

import org.junit.Test;
import com.uolscubamasters.plugins.auth.IntegrityResponse;
import com.uolscubamasters.plugins.auth.AppAuth;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    AppAuth appAuth;
    @Override
    public void setUp() throws Exception {
        appAuth = new AppAuth();
    }

    @Test
    public void doesReturnToken() throws Exception {
        IntegrityResponse res = appAuth.verifyAppIntegrity();
        assertEquals(res.getAuth(), true);
        assertTrue(res.getToken().matches("^[a-zA-Z0-9]{8}-([a-zA-Z0-9]{4}-){3}[a-zA-Z0-9]{12}"));
    }
}
