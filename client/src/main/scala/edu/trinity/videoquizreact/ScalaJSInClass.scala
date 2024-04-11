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

    var counter = 0

    def countingButton() {
        val button = dom.document.createElement("button")
        button.addEventListener("click", {(e:dom.MouseEvent) =>
            counter += 1 
            button.textContent = counter.toString()
            println("Was Clicked!")    
        })
        dom.document.body.appendChild(button)
    }
}