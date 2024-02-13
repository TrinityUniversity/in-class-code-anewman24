package controllers

import javax.inject._

import shared.SharedMessages
import play.api.mvc._

@Singleton
class NBATeams @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def index = Action {
    Ok(views.html.index(SharedMessages.itWorks))
  }
  
  def getNBATable = Action {
    Ok(views.html.index(SharedMessages.itWorks))
  }

}
