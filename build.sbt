name := "BasicRCRobot"

version := "0.1.0"

libraryDependencies ++= Seq(
	"net.sf.bluecove" % "bluecove" % "2.1.0"
)

fork in run := true

javaOptions in run += "-d32"