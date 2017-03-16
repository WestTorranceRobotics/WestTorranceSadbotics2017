package org.usfirst.frc5124.WestTorranceSadbotics2017.subsystems;

import org.usfirst.frc5124.WestTorranceSadbotics2017.RobotMap;
import org.usfirst.frc5124.WestTorranceSadbotics2017.commands.*;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem {

    private final RobotDrive robotDrive = RobotMap.drivetrainRobotDrive;
    
    public double direction = 1;
    public double turnSpeed = 0.75;
    
    public double gyroOutput = 0;
    public double encoderOutput = 0;
    
    public double ticksPerInch = 27143.360527;
    
    public Drivetrain() {
    }

    public void initDefaultCommand() {
    	setDefaultCommand(new JoystickPuppetry());
    }
    
    public void setSpeed(double speed) {
    	robotDrive.setMaxOutput(speed);
    }
    
    public void driveStop() {
    	robotDrive.arcadeDrive(0, 0);
    }
    
    public void drive(double drivePower, double driveTurn) {
    	robotDrive.arcadeDrive(drivePower, driveTurn);
    }
	
	public double getDirection() {
		return direction;
	}
	
	public void reverseFront() {
		direction = Math.copySign(1, -direction);
	}
	
	public void frontAndCenter() {
		direction = 1;
	}
    
	public void slowTurn() {
		turnSpeed = 1;
	}
	
	public void fastTurn() {
		turnSpeed = 1;
	}
	
	public double getTurnSpeed() {
		return turnSpeed;
	}
	
	public void getEncoderOutput(double encoderOutput) {
		this.encoderOutput = encoderOutput;
	}
	
	public void getGyroOutput(double gyroOutput) {
		this.gyroOutput = gyroOutput;
	}
	
	public void getAllOutputs(double encoderOutput, double gyroOutput) {
		getEncoderOutput(encoderOutput);
		getGyroOutput(gyroOutput);
	}
	
	public void resetGyroOutput() {
		gyroOutput = 0;
	}
	
	public void resetEncoderOutput() {
		encoderOutput = 0;
	}
	
	public void resetAllOutputs() {
		resetEncoderOutput();
		resetGyroOutput();
	}
	
	public void setPIDOutputs() {
		robotDrive.arcadeDrive(encoderOutput, gyroOutput);
	}
}
