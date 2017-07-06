package com.spikes2212.robot.commands.basic;

import com.spikes2212.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class MoveCrainDown extends Command {

    public static final double MOVE_DOWN_SPEED = -0.5;

    public MoveCrainDown() {
        requires(Robot.crane);
    }

    @Override
    protected void execute() {
        Robot.crane.tryMove(MOVE_DOWN_SPEED);
    }

    @Override
    protected void interrupted() {
        end();
    }

    @Override
    protected void end() {
        Robot.crane.tryMove(0);
    }


    @Override
    protected boolean isFinished() {
        return !Robot.crane.canMove(MOVE_DOWN_SPEED);
    }
}
