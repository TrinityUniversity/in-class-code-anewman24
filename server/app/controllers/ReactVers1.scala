package controllers

import javax.inject._

import shared.SharedMessages
import play.api.mvc._
import play.api.i18n._
import play.api.libs.json._
import models._


@Singleton
class ReactVers1 @Inject() (cc: ControllerComponents) extends AbstractController(cc) {
    def load = Action { implicit request =>
        Ok(views.html.reactMain())
    }
}