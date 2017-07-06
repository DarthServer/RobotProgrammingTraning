package com.spikes2212.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Feeder extends Subsystem {


    private SpeedController motor;

    public Feeder(SpeedController motor) {
        this.motor = motor;
    }

    public void move(double speed) {
        motor.set(speed);
    }

    @Override
    protected void initDefaultCommand() {

    }
}
