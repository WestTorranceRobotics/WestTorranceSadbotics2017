package org.usfirst.frc5124.WestTorranceSadbotics2017.commands;



import org.usfirst.frc5124.WestTorranceSadbotics2017.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class JoystickPuppetry extends Command {

    public JoystickPuppetry() {
    	requires(Robot.drivetrain);
    }

    protected void initialize() {
    }

    protected void execute() {
    	/* Robot.drivetrain.drive(
    			(Robot.oi.getDriver().getRawAxis(1)) * Robot.drivetrain.getDirection(), 
    			(Robot.oi.getDriver().getRawAxis(2)) * Robot.drivetrain.getTurnSpeed()); */
    	Robot.drivetrain.tankDrive(Robot.oi.getLeftJoystick(), Robot.oi.getRightJoystick());
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    	Robot.drivetrain.driveStop();
    }

    protected void interrupted() {
    }
}
