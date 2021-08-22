import kotlinx.browser.document
import kotlinx.dom.appendElement

fun main() {
    console.log("Hello, ${greet()}")
//    document.getElementById("root").app
}

fun greet() = "world"