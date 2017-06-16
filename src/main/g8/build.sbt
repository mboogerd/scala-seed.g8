lazy val root = project.in(file("."))
  .settings(
    inThisBuild(List(
      organization := "$package$",
      scalaVersion := "2.12.2",
      version := "0.1.0-SNAPSHOT"
    )),
    name := "$name$")
  .settings(GenericConf.settings())
  .settings(DependenciesConf.common)
  .settings(LicenseConf.settings)
  .enablePlugins(AutomateHeaderPlugin)
  .settings(TutConf.settings)
  .enablePlugins(TutPlugin)