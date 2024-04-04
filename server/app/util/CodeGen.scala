package util

object CodeGen extends App {
  slick.codegen.SourceCodeGenerator.run(
    "slick.jdbc.PostgresProfile", 
    "org.postgresql.Driver",
    "jdbc:postgresql://localhost/anewman?user=anewman&password=0851583",
    "/users/anewman/CSfolder/cs3345/in-class-code-anewman24/server/app", //put path to
    "models", None, None, true, false
    // /users/anewman/CSfolder/cs3345/in-class-code-anewman24/server/app/util/CodeGen.scala
  )
}