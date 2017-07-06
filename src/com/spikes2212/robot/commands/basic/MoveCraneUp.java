package com.spikes2212.robot.commands.basic;

import com.spikes2212.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class MoveCraneUp extends Command {


    public static final double MOVE_UP_SPEED = 0.5;

    public MoveCraneUp() {
        requires(Robot.crane);
    }

    @Override
    public void execute() {
        Robot.crane.tryMove(MOVE_UP_SPEED);
    }

    @Override
    protected void end() {
        Robot.crane.tryMove(0);
    }

    @Override
    protected void interrupted() {
        end();
    }

    @Override
    protected boolean isFinished() {
        return !Robot.crane.canMove(MOVE_UP_SPEED);
    }
}
