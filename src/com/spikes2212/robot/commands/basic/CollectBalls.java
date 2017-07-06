package com.spikes2212.robot.commands.basic;

import com.spikes2212.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class CollectBalls extends Command {


    public static final double FEEDER_SPEED = 0.3;



    public CollectBalls() {
        requires(Robot.feeder);
    }

    @Override
    protected void initialize() {
    }

    @Override
    protected void execute() {
        Robot.feeder.move(FEEDER_SPEED);
    }



    @Override
    protected boolean isFinished() {
        return isTimedOut();
    }
}
