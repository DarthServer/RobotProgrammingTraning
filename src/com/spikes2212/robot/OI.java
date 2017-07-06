package com.spikes2212.robot;

import com.spikes2212.robot.commands.basic.CollectBalls;
import com.spikes2212.robot.commands.basic.MoveCraneUp;
import com.spikes2212.robot.commands.basic.Shoot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI /* GEVALD */ {

    private static Joystick leftJoystick;
    private static Joystick rightJoystick;

    private static JoystickButton moveCraneUpButton;
    private static JoystickButton shootButton;
    private static JoystickButton collectBallsButton;

    public OI() {
        rightJoystick = new Joystick(0);
        leftJoystick = new Joystick(1);

        moveCraneUpButton = new JoystickButton(rightJoystick, 3);
        shootButton = new JoystickButton(leftJoystick, 1);
        collectBallsButton = new JoystickButton(leftJoystick, 2);

        initButtons();
    }

    private static void initButtons() {
        moveCraneUpButton.whileHeld(new MoveCraneUp());
        shootButton.whileHeld(new Shoot());
        collectBallsButton.whileHeld(new CollectBalls());
    }

    private static double adjust(double val) {
        return val * Math.abs(val);
    }
    public static double getLeftY() {
        return adjust(leftJoystick.getY());
    }

    public static double getRightY() {
        return adjust(rightJoystick.getY());
    }
}
