package org.usfirst.frc5124.WestTorranceSadbotics2017.commands;

import org.usfirst.frc5124.WestTorranceSadbotics2017.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveTrainDriveStraightWithSeconds extends Command {

	public double power;
	
    public DriveTrainDriveStraightWithSeconds(double power , double time) {
    	requires(Robot.drivetrain);
    	setTimeout(time);
    	this.power = power;
    	Robot.gyroPIDHandler.setSetpoint(Robot.gyroPIDHandler.getGyro());
    	
    }
    
    protected void initialize() {
    	Robot.gyroPIDHandler.getPIDController().setPID(0.05, 0, 0);
    	Robot.gyroPIDHandler.enable();
    }
    
    protected void execute() {
    	Robot.drivetrain.setPIDtrash(power);
    }

    protected boolean isFinished() {
        return isTimedOut();
    }

    protected void end() {
    	Robot.drivetrain.driveStop();
    	Robot.drivetrain.resetAllOutputs();
    	Robot.gyroPIDHandler.disable();
    	Robot.gyroPIDHandler.getPIDController().setPID(0.1, 0.125, 0.4);
    }

    protected void interrupted() {
    	end();
    }
}
