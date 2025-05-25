import androidx.compose.ui.window.ComposeUIViewController
import dk.pd3.app.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController { App() }
