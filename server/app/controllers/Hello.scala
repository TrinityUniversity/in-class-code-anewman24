package controllers

import javax.inject._

import shared.SharedMessages
import play.api.mvc._

@Singleton
class Hello @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def hello = Action {
    Ok(views.html.hello("Goodbye"))
  }
  
}
