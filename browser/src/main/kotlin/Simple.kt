import kotlinx.browser.document
import kotlinx.browser.window
import kotlinx.dom.appendElement
import kotlinx.html.div
import kotlinx.html.dom.append
import kotlinx.html.js.div
import kotlinx.html.js.h1
import org.w3c.dom.Node

fun main() {
    document.getElementById("root")?.append {
        h1 {
            +"Hello Inna Kostiuk!"
        }
    }
    println(document)
}