// The Lagom plugin
//import Dependencies._

addSbtPlugin("com.lightbend.lagom" % "lagom-sbt-plugin" % "1.6.4")
addSbtPlugin("com.lightbend.akka.grpc" %% "sbt-akka-grpc" % "1.0.3")
addSbtPlugin("org.foundweekends.giter8" % "sbt-giter8-scaffold" % "0.12.0")
addSbtPlugin("de.gccc.sbt" % "sbt-jib" % "0.2.3")
libraryDependencies += "com.lightbend.play" %% "play-grpc-generators" % "0.9.1"
