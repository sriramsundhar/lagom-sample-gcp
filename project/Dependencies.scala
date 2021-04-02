import sbt._

object Dependencies {
  lazy val lagomVersion = "1.6.4"
  lazy val lbPlayVersion = "0.9.1"
  lazy val akkaVersion = "2.6.13"
  lazy val akkaHttpVersion = "10.2.3"
  lazy val playVersion = "2.8.7"
  lazy val lombok = "org.projectlombok" % "lombok" % "1.18.8"
  lazy val mySqlConnector = "mysql" % "mysql-connector-java" % "8.0.23"

  lazy val akkaOverrides = Seq(
    "com.typesafe.akka" %% "akka-actor-typed" % akkaVersion,
    "com.typesafe.akka" %% "akka-actor" % akkaVersion,
    "com.typesafe.akka" %% "akka-discovery" % akkaVersion,
    "com.typesafe.akka" %% "akka-protobuf-v3" % akkaVersion,
    "com.typesafe.akka" %% "akka-slf4j" % akkaVersion,
    "com.typesafe.akka" %% "akka-serialization-jackson" % akkaVersion,
    "com.typesafe.akka" %% "akka-stream" % akkaVersion,
    "com.typesafe.akka" %% "akka-actor-testkit-typed" % akkaVersion % Test,
    "com.typesafe.akka" %% "akka-cluster-sharding-typed" % akkaVersion % Test,
    "com.typesafe.akka" %% "akka-cluster-sharding" % akkaVersion % Test,
    "com.typesafe.akka" %% "akka-cluster-tools" % akkaVersion % Test,
    "com.typesafe.akka" %% "akka-cluster-typed" % akkaVersion % Test,
    "com.typesafe.akka" %% "akka-cluster" % akkaVersion % Test,
    "com.typesafe.akka" %% "akka-coordination" % akkaVersion % Test,
    "com.typesafe.akka" %% "akka-distributed-data" % akkaVersion % Test,
    "com.typesafe.akka" %% "akka-persistence-query" % akkaVersion % Test,
    "com.typesafe.akka" %% "akka-persistence-typed" % akkaVersion % Test,
    "com.typesafe.akka" %% "akka-persistence" % akkaVersion % Test,
    "com.typesafe.akka" %% "akka-pki" % akkaVersion % Test,
    "com.typesafe.akka" %% "akka-remote" % akkaVersion % Test,
    "com.typesafe.akka" %% "akka-stream-testkit" % akkaVersion % Test,
    "com.typesafe.akka" %% "akka-testkit" % akkaVersion % Test
  )

  lazy val akkaHttpOverrides = Seq(
    "akka-http2-support",
    "akka-http-core",
    "akka-http",
    "akka-parsing",
    "akka-http-spray-json"
  ).map(
    artifactId => "com.typesafe.akka" %% artifactId % akkaHttpVersion
  )

  lazy val playOverrides = Seq(
    "play",
    "play-akka-http-server",
    "play-server",
    "play-ws",
    "play-ahc-ws"
  ).map(
    artifactId => "com.typesafe.play" %% artifactId % playVersion
  )

  lazy val http2 = "com.typesafe.akka" %% "akka-http2-support" % akkaHttpVersion
  lazy val playGrpcRuntime = "com.lightbend.play" %% "play-grpc-runtime" % lbPlayVersion
  lazy val lagomGrpcTestkit = "com.lightbend.play" %% "lagom-javadsl-grpc-testkit" % lbPlayVersion % Test
}