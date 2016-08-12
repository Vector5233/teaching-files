
// This is a basic teleop program for Flowers. It only controls the treads.
// If you want to see an explanation of each line, there's a commented version called "BasicFlowersTeleop2".

package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class VariablesPractice extends OpMode{

    DcMotor motorFrontRight;
    DcMotor motorFrontLeft;
    DcMotor motorBackRight;
    DcMotor motorBackLeft;

    double rightPower = gamepad1.right_stick_y;
    double leftPower = gamepad1.left_stick_y;

    int loopsRun = 0;
    int numbera=0;


    public void init() {
        motorFrontRight = hardwareMap.dcMotor.get("motorFR");
        motorFrontLeft = hardwareMap.dcMotor.get("motorFL");
        motorBackRight = hardwareMap.dcMotor.get("motorBR");
        motorBackLeft = hardwareMap.dcMotor.get("motorBL");

        motorBackRight.setDirection(DcMotor.Direction.REVERSE);
        motorBackLeft.setDirection(DcMotor.Direction.FORWARD);
    }

    public void loop() {
        motorFrontRight.setPower(rightPower);
        motorFrontLeft.setPower(gamepad1.left_stick_y);
        motorBackRight.setPower(gamepad1.right_stick_y);
        motorBackLeft.setPower(leftPower);

        /*if(gamepad1.a)
        {
            numbera=numbera+1;
        }

        if(numbera>=5)
        {
            motorFrontRight.setPower(rightPower);
            motorFrontLeft.setPower(gamepad1.left_stick_y);
            motorBackRight.setPower(gamepad1.right_stick_y);
            motorBackLeft.setPower(leftPower);
        }*/


    }
}