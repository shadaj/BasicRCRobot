Basic Remote Control Robot
==========================

This project allows controlling a NXT robot using the WASD keys, like a remote control car.
  
		  w
		a s d

w = forward, a = left, s = backward, d = right

The project uses the leJOS PC API, so you don't need to download the program onto the NXT brick.

Building
--------
For building the robot, please see the included robot model (RobotDesign.lxf). To open the file, use LDD (Lego Digital Designer),
which you can get from http://ldd.lego.com.

Requirements
-----------
* sbt (https://github.com/harrah/xsbt/wiki/Getting-Started-Setup)
* Eclipse with Scala IDE 
* leJOS software (http://lejos.sourceforge.net).

Setting Up
----------
* Copy pccomm.jar (lejos_nxj/lib/pc/pccomm.jar) to the lib directory.
* Go to the project in the terminal, and do 'sbt eclipse'.
* Load the project into Eclipse.

Running
-------
* Turn on the NXT brick and pair it up with your computer.
* Run Robot.scala (It will not run when in the 64 bit mode on Mac. To fix, add a VM parameter "-d32".)
* You may have to run multiple times so that the NXT can connect to the computer.
