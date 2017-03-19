package org.usfirst.frc5124.WestTorranceSadbotics2017.commands;

import org.usfirst.frc5124.WestTorranceSadbotics2017.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveTrainRunOnSeconds extends Command {

	public double power;
	
    public DriveTrainRunOnSeconds(double driveTime) {
    	requires(Robot.drivetrain);
    	setTimeout(driveTime);
    	power = Math.copySign(0.6, driveTime);
    }
    
    public DriveTrainRunOnSeconds(double power, double time) {
    	this(time);
    	this.power = power;
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.drivetrain.drive(power, 0);
    }

    protected boolean isFinished() {
        return isTimedOut();
    }

    protected void end() {
    	Robot.drivetrain.driveStop();
    }

    protected void interrupted() {
    	Robot.drivetrain.driveStop();
    }
}
