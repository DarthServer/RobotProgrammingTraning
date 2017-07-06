package com.spikes2212.robot.subsystems;

import com.spikes2212.robot.commands.basic.MoveCrainDown;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Crane extends Subsystem {

    /**
        two digital switches that indicates if the crane have moved out of the safe distance
        in a certain direction
    */
    private DigitalInput upSwitch;
    private DigitalInput downSwitch;

    /**
        the speed controller that controls the motor that is used to move the crane
    */
    private SpeedController motor;


    /**
     * the constructor of the crane, it gets the speed controller and the two switches as arguments
     * and then assigns them to the corresponding fields
     */

    public Crane(SpeedController motor, DigitalInput upSwitch, DigitalInput downSwitch) {
        this.motor = motor;
        this.upSwitch = upSwitch;
        this.downSwitch = downSwitch;
    }

    private void move(double speed) {
        motor.set(speed);
    }

    public boolean canMove(double speed) {
        if ((speed > 0 && upSwitch.get()) || (speed < 0 && downSwitch.get()))
            return false;
        return true;
    }

    public void tryMove(double speed) {
        if (canMove(speed)) move(speed);
    }

    @Override
    protected void initDefaultCommand() {
        setDefaultCommand(new MoveCrainDown());

    }
}
