package com.spikes2212.robot.commands.basic;

import com.spikes2212.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class Shoot extends Command {

    public static final double SHOOTING_SPEED = 0.4;

    public Shoot() {
        requires(Robot.shooter);
    }

    @Override
    protected void execute() {
        Robot.shooter.shoot(SHOOTING_SPEED);
    }

    @Override
    protected void end() {
        Robot.shooter.shoot(0);
    }

    @Override
    protected void interrupted() {
        end();
    }

    @Override
    protected boolean isFinished() {
        return isTimedOut();
    }
}
