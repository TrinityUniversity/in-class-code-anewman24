package models

import play.db._
import scala.concurrent.ExecutionContext

class RelationDBModel(db: Database)(implicit ec: ExecutionContext) {
    def getRelations(username: String): Unit = {
        //val userRows = db.run(Users.filter(u => u.username === username).result)
        //userRows.flatMap {

        //}
    }
}