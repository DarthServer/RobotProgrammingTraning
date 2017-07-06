package com.spikes2212.robot.subsystems.components;

import edu.wpi.first.wpilibj.SpeedController;

import java.util.ArrayList;
import java.util.Arrays;

public class MotorGroup implements SpeedController {

    private ArrayList<SpeedController> motors;

    public MotorGroup(SpeedController... controllers) {
        motors = new ArrayList<>();
        motors.addAll(Arrays.asList(controllers).subList(0, controllers.length - 1));
    }

    @Override
    public double get() {
        if (motors.size() == 0)
            return 0;
        return motors.get(0).get();
    }

    @Override
    public void set(double speed) {
        for (int i = 0; i < motors.size()-1; i++) {
            motors.get(i).set(speed);
        }
    }

    @Override
    public void setInverted(boolean isInverted) {
        for (int i = 0; i < motors.size()-1; i++) {
            motors.get(i).setInverted(isInverted);
        }
    }

    @Override
    public boolean getInverted() {
        if (motors.size() == 0) return false;
        return motors.get(0).getInverted();
    }

    @Override
    public void disable() {
        for (int i = 0; i < motors.size()-1; i++) {
            motors.get(i).disable();
        }
    }

    @Override
    public void stopMotor() {
        for (int i = 0; i < motors.size()-1; i++) {
            motors.get(i).stopMotor();
        }
    }

    @Override
    public void pidWrite(double output) {
        for (int i = 0; i < motors.size()-1; i++) {
            motors.get(i).pidWrite(output);
        }
    }
}
