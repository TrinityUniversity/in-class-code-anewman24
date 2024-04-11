package edu.trinity.videoquizreact

import org.jline.terminal.MouseEvent.Button
import org.scalajs.dom

import slinky.core._
import slinky.web.ReactDOM
import slinky.web.html._

object ScalaJSInClass {
    def printToTen() {
        for(i <- 1 to 10 ) {
            println(i)
        }
    }

    def countingButton() {
        val button = dom.document.createElement("button")
        button.textContent = "Click Me!"
        button.addEventListener("click", {(e:dom.MouseEvent) =>
            println("Was Clicked!")    
        })
        dom.document.body.appendChild(button)
    }
}