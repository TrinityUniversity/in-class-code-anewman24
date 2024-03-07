package controllers

import javax.inject._

import shared.SharedMessages
import play.api.mvc._
import models.CountingModel

@Singleton
class NumCount @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
    def accessModel = Action {
        val count = CountingModel.getValue()
        Ok(views.html.counter(count))
    }
    def increase = Action {
        CountingModel.setValue()
        val count = CountingModel.getValue()
        Ok(views.html.counter(count))
    }
}
