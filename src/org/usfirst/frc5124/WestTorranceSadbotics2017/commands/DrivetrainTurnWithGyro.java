package org.usfirst.frc5124.WestTorranceSadbotics2017.commands;

import org.usfirst.frc5124.WestTorranceSadbotics2017.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DrivetrainTurnWithGyro extends Command {
	
	public double degrees;

    public DrivetrainTurnWithGyro(double degrees) {
        requires(Robot.drivetrain);
        this.degrees = degrees;
    }

    protected void initialize() {
    	Robot.drivetrain.resetAllOutputs();
    	Robot.gyroPIDHandler.setSetpoint(degrees + Robot.gyroPIDHandler.getGyro());
    	Robot.gyroPIDHandler.enable();
    }

    protected void execute() {
    	Robot.drivetrain.setPIDOutputs();
    }

    protected boolean isFinished() {
        return Robot.gyroPIDHandler.onTarget();
    }

    protected void end() {
    	Robot.gyroPIDHandler.disable();
    	Robot.drivetrain.driveStop();
    }

    protected void interrupted() {
    	end();
    }
}
