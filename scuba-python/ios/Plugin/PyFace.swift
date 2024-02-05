import Foundation

@objc public class PyFace: NSObject {
    @objc public func echo(_ value: String) -> String {
        print(value)
        return value
    }
}
