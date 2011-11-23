package rc

import lejos.nxt.Motor

object Robot extends App {
  val rightMotor = Motor.B
  val leftMotor = Motor.A
  
  rightMotor.setSpeed(200)
  leftMotor.setSpeed(200)
  
  while (true) {
    val command = readLine("Enter WASD for direction: ")

    rightMotor.stop()
    leftMotor.stop()
    
    // Because of the position of motors, forward moves the robot backwards and vice-versa
    // Rotation needed for turning estimated using tachometer to be 528 degrees of wheel = 90 degrees of robot
    command match {
      case "w" => rightMotor.backward()
    		  	  leftMotor.backward()
      case "a" => rightMotor.rotate(-528, true)
      case "s" => rightMotor.forward()
    		  	  leftMotor.forward()
      case "d" => leftMotor.rotate(-528, true)
      case _ => println("Invalid command")
    }
  }	
}