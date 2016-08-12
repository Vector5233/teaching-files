package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;


public class BasicCrashCourse {

    //Grammar crash course!
    // First off, everything in grey is a comment. The computer ignores them when it's running code. Comments are just notes for the reader.

    DcMotor leftMotor;
    DcMotor rightMotor;
    Servo latch;

    // These three lines are all "declarations"; All they do is say "This is a thing."
       // "leftMotor" is a DcMotor.
       // "rightMotor" is a DcMotor.
       // "latch" is a Servo.
    // By the way, lines of code (almost) always end in a semicolon. It's like a period in English.


    /////////////////////////////////////////////////////////////////////////////////////


    // These are methods:

    public void init() {
        leftMotor.setPower(0);
        rightMotor.setPower(0);
    }

    public void loop() {
        leftMotor.setPower(1);
        rightMotor.setPower(-1);
    }

    // They're fantastic and useful, and we'll use them a lot later.
    // The two you'll see in every teleop are "init()" and "loop()".
       // "init()" runs when you hit the big INIT on the driver station before the match starts.
       // "loop()" runs continuously, over and over and over, starting when you hit the play arrow on the driver station and ending when you hit the stop button.
    // For now, just remember that methods execute (do) whatever's inside of their {brackets}.



    // Colors
       // Android Studio will color code certain things for you, for easier reading.
            // Orange- Special words like "public" and "void"
            // Grey- Comments (like this one!)
            // Purple- Variables (more on them later) like "leftMotor" and "rightMotor"
            // Blue- Constant values like "1"
            // White- Pretty much everything else



    ///////
    //* *//
    ///////
       //
    ////////
       //
       //
     //  //
     //  //


    // End of the grammar lesson. Head on over to "BasicFlowersTeleop1".
}
