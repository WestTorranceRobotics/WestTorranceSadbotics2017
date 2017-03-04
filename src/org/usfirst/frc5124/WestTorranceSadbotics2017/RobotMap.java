package org.usfirst.frc5124.WestTorranceSadbotics2017;

import com.ctre.CANTalon;
import com.ctre.CANTalon.FeedbackDevice;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class RobotMap {

	//Gear Holder
	public static DoubleSolenoid gearHolderHolderSolenoid;
	public static DoubleSolenoid gearHolderPusherSolenoid;
	public static DoubleSolenoid gearHolderFunnelFrontSolenoid;
	public static DoubleSolenoid gearHolderFunnelBackboardSolenoid;
	public static DigitalInput gearHolderLimitSwitch;
	
	//Drive Train
    public static SpeedController drivetrainLeft1;
    public static SpeedController drivetrainLeft2;
    public static SpeedController drivetrainRight1;
    public static SpeedController drivetrainRight2;
    public static RobotDrive drivetrainRobotDrive;
    
    //Shooters
    public static CANTalon shooterLeftShooterMotor;
    public static CANTalon shooterCenterShooterMotor;
    public static CANTalon shooterRightShooterMotor;

    public static void init() {
    	
    	////////////////////////
    	//GEAR HOLDER HARDWARE//
    	////////////////////////
    	gearHolderHolderSolenoid = new DoubleSolenoid(0, 0, 1);
    	LiveWindow.addActuator("Gear Holder", "Holder Solenoid", gearHolderHolderSolenoid);
    	
    	gearHolderPusherSolenoid = new DoubleSolenoid(0, 2, 3);
    	LiveWindow.addActuator("Gear Holder", "Pusher Solenoid", gearHolderPusherSolenoid);
    	
    	gearHolderFunnelFrontSolenoid = new DoubleSolenoid(0, 4, 5);
    	LiveWindow.addActuator("Gear Holder", "Funnel Front Solenoid", gearHolderFunnelFrontSolenoid);
    	
    	gearHolderFunnelBackboardSolenoid = new DoubleSolenoid(0, 6, 7);
    	LiveWindow.addActuator("Gear Holder", "Funnel Backboard Solenoid", gearHolderFunnelBackboardSolenoid);
    	
    	gearHolderLimitSwitch = new DigitalInput(7);
    	
    	
    	////////////////////////
        //DRIVE TRAIN HARDWARE//
    	////////////////////////
    	
    	drivetrainLeft1 = new Talon(0);
        LiveWindow.addActuator("Drivetrain", "Left 1", (Talon) drivetrainLeft1);
        
        drivetrainLeft2 = new Talon(1);
        LiveWindow.addActuator("Drivetrain", "Left 2", (Talon) drivetrainLeft2);
        
        drivetrainRight1 = new Talon(2);
        LiveWindow.addActuator("Drivetrain", "Right 1", (Talon) drivetrainRight1);
        
        drivetrainRight2 = new Talon(3);
        LiveWindow.addActuator("Drivetrain", "Right 2", (Talon) drivetrainRight2);
        
        drivetrainRobotDrive = new RobotDrive(drivetrainLeft1, drivetrainLeft2,
              drivetrainRight1, drivetrainRight2);
        
        ////////////////////
        //SHOOTER HARDWARE//
        ////////////////////
        
        shooterLeftShooterMotor = new CANTalon(3);
    	shooterLeftShooterMotor.enableBrakeMode(false);
    	shooterLeftShooterMotor.setProfile(0);
    	shooterLeftShooterMotor.setP(.1);
    	shooterLeftShooterMotor.setI(0);
    	shooterLeftShooterMotor.setD(0);
    	shooterLeftShooterMotor.setF(0.037);
    	shooterLeftShooterMotor.setAllowableClosedLoopErr(50);
    	shooterLeftShooterMotor.setControlMode(0);
    	shooterLeftShooterMotor.setFeedbackDevice(FeedbackDevice.QuadEncoder);
    	LiveWindow.addActuator("Shooter", "Left Shooter", shooterLeftShooterMotor);
    	
    	shooterCenterShooterMotor = new CANTalon(4);
    	shooterCenterShooterMotor.enableBrakeMode(false);
    	shooterCenterShooterMotor.setProfile(0);
    	shooterCenterShooterMotor.setP(.1);
    	shooterCenterShooterMotor.setI(0);
    	shooterCenterShooterMotor.setD(0);
    	shooterCenterShooterMotor.setF(0.037);
    	shooterCenterShooterMotor.setAllowableClosedLoopErr(50);
    	shooterCenterShooterMotor.setControlMode(0);
    	shooterCenterShooterMotor.setFeedbackDevice(FeedbackDevice.QuadEncoder);
    	LiveWindow.addActuator("Shooter", "Center Shooter", shooterCenterShooterMotor);
    	
    	shooterRightShooterMotor = new CANTalon(5);
    	shooterRightShooterMotor.enableBrakeMode(false);
    	shooterRightShooterMotor.setProfile(0);
    	shooterRightShooterMotor.setP(.1);
    	shooterRightShooterMotor.setI(0);
    	shooterRightShooterMotor.setD(0);
    	shooterRightShooterMotor.setF(0.037);
    	shooterRightShooterMotor.setAllowableClosedLoopErr(50);
    	shooterRightShooterMotor.setControlMode(0);
    	shooterRightShooterMotor.setFeedbackDevice(FeedbackDevice.QuadEncoder);
    	LiveWindow.addActuator("Shooter", "Right Shooter", shooterRightShooterMotor);
        
        
        drivetrainRobotDrive.setSafetyEnabled(false);
        drivetrainRobotDrive.setExpiration(0.1);
        drivetrainRobotDrive.setSensitivity(0.5);
        drivetrainRobotDrive.setMaxOutput(1.0);
        drivetrainRobotDrive.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
        drivetrainRobotDrive.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
        drivetrainRobotDrive.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
        drivetrainRobotDrive.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);


    }
}
