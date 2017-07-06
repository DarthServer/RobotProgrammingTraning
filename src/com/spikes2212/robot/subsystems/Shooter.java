package com.spikes2212.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shooter extends Subsystem {


    private SpeedController motor;


    public Shooter(SpeedController motor) {
        this.motor = motor;
    }

    public void shoot (double speed) {
        motor.set(speed);
    }

    @Override
    protected void initDefaultCommand() {

    }
}
