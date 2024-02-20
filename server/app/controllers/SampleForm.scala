package controllers

import javax.inject._

import shared.SharedMessages
import play.api.mvc._

@Singleton
class SampleForm @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def login = Action {
    Ok(s"Jerry")
  }

  def nameColorGet(name: String, color: String) = Action {
    Ok(s"$name and $color")
  }
  
}
