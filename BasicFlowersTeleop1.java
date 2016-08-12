
// This is a basic teleop program for Flowers. It only controls the treads.
// If you want to see an explanation of each line, there's a commented version called "BasicFlowersTeleop2".

package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class BasicFlowersTeleop1 extends OpMode{

    DcMotor motorFrontRight;
    DcMotor motorFrontLeft;
    DcMotor motorBackRight;
    DcMotor motorBackLeft;

    public void init() {
        motorFrontRight = hardwareMap.dcMotor.get("motorFR");
        motorFrontLeft = hardwareMap.dcMotor.get("motorFL");
        motorBackRight = hardwareMap.dcMotor.get("motorBR");
        motorBackLeft = hardwareMap.dcMotor.get("motorBL");

        motorFrontLeft.setDirection(DcMotor.Direction.REVERSE);
        motorBackLeft.setDirection(DcMotor.Direction.REVERSE);
    }

    public void loop() {
        motorFrontRight.setPower(gamepad1.right_stick_y);
        motorFrontLeft.setPower(gamepad1.right_stick_y);
        motorFrontLeft.setPower(gamepad1.left_stick_y);
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
