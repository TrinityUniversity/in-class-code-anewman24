package controllers

import javax.inject._

import shared.SharedMessages
import play.api.mvc._

@Singleton
class SampleForm @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def login = Action {
    Ok(s"Jerry")
  }

  def showNameColor(name: String, color: String) = Action {
    Ok(s"Hi $name, I see your favority color is $color!")
  }

  def nameColorGet = Action {
    Ok(views.html.colorForm()) 
  }

  def makeUsername = Action {
    Ok(views.html.usernameForm())
  }
  
  def showUsername = Action { request => 
    val postVals = request.body.asFormUrlEncoded
    postVals.map { args => 
      val username = args("username").head
      Ok(s"$username has logged in!")
      }.getOrElse(Ok("Opps!"))
  }

  // def enterUser = Action {
  //   Ok(views.html.usernameForm())
  // }

}
