package org.usfirst.frc5124.WestTorranceSadbotics2017.subsystems;

import org.usfirst.frc5124.WestTorranceSadbotics2017.Robot;
import org.usfirst.frc5124.WestTorranceSadbotics2017.RobotMap;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 *
 */
public class GyroPIDHandler extends PIDSubsystem {
	
	private static ADXRS450_Gyro gyro = RobotMap.drivetrainGyro;

    public GyroPIDHandler() {
    	//super(0.05, 0.000001, 0.11);
    	//super("GyroPIDHandler", 0.1, 0.125, 0.4);
    	super("GyroPIDHandler", 0.05, 0, 0);
    	LiveWindow.addActuator("Gyro PID", "Gyro PID", this.getPIDController());
    	LiveWindow.addSensor("Gyro PID", "Gyro", gyro);
    	getPIDController().setContinuous(false);
    	getPIDController().setAbsoluteTolerance(1);
    	getPIDController().setOutputRange(-0.7, 0.7);
    }

    public void initDefaultCommand() {
    }

    protected double returnPIDInput() {
        return gyro.getAngle();
    }

    protected void usePIDOutput(double output) {
    	Robot.drivetrain.getGyroOutput(output);
    }
    
    public double getGyro() {
    	return gyro.getAngle();
    }
}
