package com.spikes2212.robot.subsystems;

import com.spikes2212.robot.OI;
import com.spikes2212.robot.commands.basic.DriveTank;
import com.spikes2212.robot.subsystems.components.MotorGroup;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem {

    private SpeedController leftMotorGroup;
    private SpeedController rightMotorGroup;


    public Drivetrain(SpeedController leftMotorGroup, SpeedController rightMotorGroup) {
        this.leftMotorGroup = leftMotorGroup;
        this.rightMotorGroup = rightMotorGroup;
    }

    public void driveTank(double leftSpeed, double rightSpeed) {
        leftMotorGroup.set(leftSpeed);
        rightMotorGroup.set(rightSpeed);
    }

    @Override
    protected void initDefaultCommand() {
        setDefaultCommand(new DriveTank(OI::getLeftY, OI::getRightY));
    }
}
