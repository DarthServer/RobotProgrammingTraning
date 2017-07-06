package com.spikes2212.robot.commands.autonomous;

import com.spikes2212.robot.commands.basic.CollectBalls;
import com.spikes2212.robot.commands.basic.DriveTank;
import com.spikes2212.robot.commands.basic.Shoot;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class MoveCollectBallsAndShoot extends CommandGroup {

    public MoveCollectBallsAndShoot() {
        addParallel(new CollectBalls());
        addSequential(new DriveTank(1, 1), 10);
        addSequential(new Shoot(), 5);
    }

    @Override
    protected boolean isFinished() {
        return false;
    }
}
