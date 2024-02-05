import Foundation
import Capacitor
import StoreKit
import Foundation
/**
 * Please read the Capacitor iOS Plugin Development Guide
 * here: https://capacitorjs.com/docs/plugins/ios
 */
@objc(AppAuthPlugin)
public class AppAuthPlugin: CAPPlugin {
    private let implementation = AppAuth()

    @objc func echo(_ call: CAPPluginCall) {
        let value = call.getString("value") ?? ""
        call.resolve([
            "value": implementation.echo(value)
        ])
    }

    @objc func verifyAppIntegrity(_ call: CAPPluginCall) {
        // This will need to be fully implemented when App Store account
        // is set up.
        call.resolve([
            "auth": true,
			"platform": "ios",
            "token": UUID().uuidString()
        ]);
    }
}
