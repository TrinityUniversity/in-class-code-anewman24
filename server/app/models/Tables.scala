package models
// AUTO-GENERATED Slick data model
/** Stand-alone Slick data model for immediate use */
object Tables extends Tables {
  val profile = slick.jdbc.PostgresProfile
}

/** Slick data model trait for extension, choice of backend or usage in the cake pattern. (Make sure to initialize this late.) */
trait Tables {
  val profile: slick.jdbc.JdbcProfile
  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** DDL for all tables. Call .create to execute. */
  lazy val schema: profile.SchemaDescription = Relations.schema ++ Users.schema
  @deprecated("Use .schema instead of .ddl", "3.0")
  def ddl = schema

  /** Entity class storing rows of table Relations
   *  @param relationId Database column relation_id SqlType(serial), AutoInc, PrimaryKey
   *  @param relationType Database column relation_type SqlType(varchar), Length(50,true)
   *  @param person1Id Database column person1_id SqlType(int4), Default(None)
   *  @param person2Id Database column person2_id SqlType(int4), Default(None) */
  case class RelationsRow(relationId: Int, relationType: String, person1Id: Option[Int] = None, person2Id: Option[Int] = None)
  /** GetResult implicit for fetching RelationsRow objects using plain SQL queries */
  implicit def GetResultRelationsRow(implicit e0: GR[Int], e1: GR[String], e2: GR[Option[Int]]): GR[RelationsRow] = GR{
    prs => import prs._
    RelationsRow.tupled((<<[Int], <<[String], <<?[Int], <<?[Int]))
  }
  /** Table description of table relations. Objects of this class serve as prototypes for rows in queries. */
  class Relations(_tableTag: Tag) extends profile.api.Table[RelationsRow](_tableTag, "relations") {
    def * = (relationId, relationType, person1Id, person2Id).<>(RelationsRow.tupled, RelationsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(relationId), Rep.Some(relationType), person1Id, person2Id)).shaped.<>({r=>import r._; _1.map(_=> RelationsRow.tupled((_1.get, _2.get, _3, _4)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column relation_id SqlType(serial), AutoInc, PrimaryKey */
    val relationId: Rep[Int] = column[Int]("relation_id", O.AutoInc, O.PrimaryKey)
    /** Database column relation_type SqlType(varchar), Length(50,true) */
    val relationType: Rep[String] = column[String]("relation_type", O.Length(50,varying=true))
    /** Database column person1_id SqlType(int4), Default(None) */
    val person1Id: Rep[Option[Int]] = column[Option[Int]]("person1_id", O.Default(None))
    /** Database column person2_id SqlType(int4), Default(None) */
    val person2Id: Rep[Option[Int]] = column[Option[Int]]("person2_id", O.Default(None))

    /** Foreign key referencing Users (database name relations_person1_id_fkey) */
    lazy val usersFk1 = foreignKey("relations_person1_id_fkey", person1Id, Users)(r => Rep.Some(r.userId), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Users (database name relations_person2_id_fkey) */
    lazy val usersFk2 = foreignKey("relations_person2_id_fkey", person2Id, Users)(r => Rep.Some(r.userId), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Relations */
  lazy val Relations = new TableQuery(tag => new Relations(tag))

  /** Entity class storing rows of table Users
   *  @param userId Database column user_id SqlType(serial), AutoInc, PrimaryKey
   *  @param username Database column username SqlType(varchar), Length(50,true) */
  case class UsersRow(userId: Int, username: String)
  /** GetResult implicit for fetching UsersRow objects using plain SQL queries */
  implicit def GetResultUsersRow(implicit e0: GR[Int], e1: GR[String]): GR[UsersRow] = GR{
    prs => import prs._
    UsersRow.tupled((<<[Int], <<[String]))
  }
  /** Table description of table users. Objects of this class serve as prototypes for rows in queries. */
  class Users(_tableTag: Tag) extends profile.api.Table[UsersRow](_tableTag, "users") {
    def * = (userId, username).<>(UsersRow.tupled, UsersRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = ((Rep.Some(userId), Rep.Some(username))).shaped.<>({r=>import r._; _1.map(_=> UsersRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column user_id SqlType(serial), AutoInc, PrimaryKey */
    val userId: Rep[Int] = column[Int]("user_id", O.AutoInc, O.PrimaryKey)
    /** Database column username SqlType(varchar), Length(50,true) */
    val username: Rep[String] = column[String]("username", O.Length(50,varying=true))
  }
  /** Collection-like TableQuery object for table Users */
  lazy val Users = new TableQuery(tag => new Users(tag))
}
