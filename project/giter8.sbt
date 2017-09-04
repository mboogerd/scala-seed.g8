resolvers ++= Seq(
  Resolver.sbtPluginRepo("releases"),
  Resolver.bintrayIvyRepo("sbt", "sbt-plugin-releases")
)
addSbtPlugin("org.foundweekends.giter8" % "sbt-giter8" % "0.11.0-M2")