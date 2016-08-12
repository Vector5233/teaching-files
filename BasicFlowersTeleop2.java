
package com.qualcomm.ftcrobotcontroller.opmodes; //I'm not sure what it does, but it's here and it looks important.

import com.qualcomm.robotcore.eventloop.opmode.OpMode; //Gets files from "OpMode"
import com.qualcomm.robotcore.hardware.DcMotor; //Gets files from "DcMotor"



public class BasicFlowersTeleop2 extends OpMode{ //Beginning of the program

    DcMotor motorFrontRight; //Defines "motorFrontRight" as a DcMotor
    DcMotor motorFrontLeft;
    DcMotor motorBackRight;
    DcMotor motorBackLeft;

    public void init() {    //Runs when you hit "INIT" on the driver station.

        motorFrontRight = hardwareMap.dcMotor.get("motorFR"); //Says that "motorFrontRight" in this program corresponds to "motorFR" in the Robot Controller phone's config file
        motorFrontLeft = hardwareMap.dcMotor.get("motorFL");
        motorBackRight = hardwareMap.dcMotor.get("motorBR");
        motorBackLeft = hardwareMap.dcMotor.get("motorBL");

        motorFrontLeft.setDirection(DcMotor.Direction.REVERSE); //Reverses the direction of "motorFrontLeft"; It's like all the values you give it are multiplied by -1
        motorBackLeft.setDirection(DcMotor.Direction.REVERSE);

    }

    public void loop() {   //Runs continuously, over and over, starting when you hit the play arrow on the Driver Station until you kill the program.

        motorFrontRight.setPower(gamepad1.right_stick_y); //Sets the power of "motorFrontRight" equal to the y values from gamepad1's right stick
        motorFrontLeft.setPower(gamepad1.right_stick_y);
        motorFrontLeft.setPower(gamepad1.left_stick_y); //Sets the power of "motorFrontLeft" equal to the y values from gamepad1's left stick
        motorBackLeft.setPower(gamepad1.left_stick_y);

    }
}

// Good? Maybe? Okay, sweet.
// Here's your first challenge:
//   In a freak accident at states involving Chang and a hacksaw, your driver has lost his left hand.
//   He can still drive, but insists on holding the controller upside-down to comfort himself.
//
//   Create a new program (File -> New -> Java Class) that he can use to drive with one joystick.
//
//   Note: Since he's only using the one joystick, he'll only be able to move the bot forward and backwards. No turning for now.
