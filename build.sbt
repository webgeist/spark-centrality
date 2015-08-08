name := "spark-centrality"

version := "0.1"

scalaVersion := "2.10.4"

organization := "cc.p2k"

libraryDependencies += "org.apache.spark" % "spark-graphx_2.10" % "1.4.1"
libraryDependencies += "org.apache.spark" % "spark-core_2.10" % "1.4.1"
libraryDependencies += "com.twitter" % "algebird-core_2.10" % "0.10.2"
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))

sparkComponents += "graphx"

spName := "cc.p2k/spark-centrality"

sparkVersion := "1.4.0"

spAppendScalaVersion := true