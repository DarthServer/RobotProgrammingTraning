package com.spikes2212.robot;

/*

*/

public class RobotMap {
    public static interface PWM {
        // driving system motors
        public static final int LEFT_MOTOR_1  = 1;
        public static final int RIGHT_MOTOR_1 = 2;
        public static final int LEFT_MOTOR_2 = 3;
        public static final int RIGHT_MOTOR_2 = 4;

        // crane motor
        public static final int CRAIN_MOTOR = 5;

        // feeder motor
        public static final int FEEDER_MOTOR = 6;

        // shooter

        public static final int SHOOTER_MOTOR = 7;
    }

    public static interface DIO {
        public static final int CRAIN_DOWN_SWITCH = 15;
        public static final int CRAIN_DOWN_UP = 16;
    }
}
