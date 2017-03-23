package org.usfirst.frc5124.WestTorranceSadbotics2017;

import com.ctre.CANTalon;
import com.ctre.CANTalon.FeedbackDevice;
import edu.wpi.first.wpilibj.ADXL362;
import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class RobotMap {
	
	//Left PID Values
	public static double leftKp = 0.05;
	public static double leftKi = 0;
	public static double leftKd = 0;
	public static double leftKf = 0.0365;
	
	//Center PID Values
	public static double centerKp = 0.04;
	public static double centerKi = 0;
	public static double centerKd = 0;
	public static double centerKf = 0.035;

	//Right PID Values
	public static double rightKp = 0.05;
	public static double rightKi = 0;
	public static double rightKd = 0;
	public static double rightKf = 0.0375;
	
	//Gear Holder
	public static DoubleSolenoid gearHolderHolderSolenoid;
	public static DoubleSolenoid gearHolderForkliftSolenoid;
	
	//Funnel
	public static DoubleSolenoid funnelFrontSolenoid;
	public static DoubleSolenoid funnelBackSolenoid;
	
	//Drive Train
    public static SpeedController drivetrainLeft1;
    public static SpeedController drivetrainLeft2;
    public static SpeedController drivetrainRight1;
    public static SpeedController drivetrainRight2;
    public static RobotDrive drivetrainRobotDrive;
    public static ADXL362 drivetrainAccelerometer; 
	public static ADXRS450_Gyro drivetrainGyro;
	public static Compressor compressor;
    
    //Shooters
    public static CANTalon shooterLeftShooterMotor;
    public static CANTalon shooterCenterShooterMotor;
    public static CANTalon shooterRightShooterMotor;
    public static Talon shooterTestCenterShooterMotor;
    
    //CAN Devices
    public static PowerDistributionPanel pdp;

    public static void init() {
    	
    	////////////////////////
    	//GEAR HOLDER HARDWARE//
    	////////////////////////
    	gearHolderHolderSolenoid = new DoubleSolenoid(0, 5, 4);
    	LiveWindow.addActuator("Gear Holder", "Holder Solenoid", gearHolderHolderSolenoid);
    	
    	gearHolderForkliftSolenoid = new DoubleSolenoid(0, 3, 2);
    	LiveWindow.addActuator("Gear Holder", "Forklift Solenoid", gearHolderForkliftSolenoid);
    	
    	////////////////////////
    	/////FUNNEL HARDWARE////
    	////////////////////////
    	
    	funnelFrontSolenoid = new DoubleSolenoid(0, 0, 1);
    	LiveWindow.addActuator("Funnel", "Funnel Front Solenoid", funnelFrontSolenoid);
    	
    	funnelBackSolenoid = new DoubleSolenoid(0, 6, 7);
    	LiveWindow.addActuator("Funnel", "Funnel Backboard Solenoid", funnelBackSolenoid);
    	
    	////////////////////////
        //DRIVE TRAIN HARDWARE//
    	////////////////////////
    	
    	drivetrainLeft1 = new Talon(0);
        //LiveWindow.addActuator("Drivetrain", "Left 1", (Talon) drivetrainLeft1);
        
        drivetrainLeft2 = new Talon(1);
        //LiveWindow.addActuator("Drivetrain", "Left 2", (Talon) drivetrainLeft2);
        
        drivetrainRight1 = new Talon(2);
        //LiveWindow.addActuator("Drivetrain", "Right 1", (Talon) drivetrainRight1);
        
        drivetrainRight2 = new Talon(3);
        //LiveWindow.addActuator("Drivetrain", "Right 2", (Talon) drivetrainRight2);
        
        drivetrainRobotDrive = new RobotDrive(drivetrainLeft1, drivetrainLeft2,
              drivetrainRight1, drivetrainRight2);
        
        drivetrainGyro = new ADXRS450_Gyro();
        //LiveWindow.addSensor("Gyro", "Gyro", drivetrainGyro);
        
        ////////////////////
        //SHOOTER HARDWARE//
        ////////////////////
        
        shooterLeftShooterMotor = new CANTalon(3);
    	shooterLeftShooterMotor.enableBrakeMode(false);
    	shooterLeftShooterMotor.setProfile(0);
    	shooterLeftShooterMotor.setP(leftKp);
    	shooterLeftShooterMotor.setI(leftKi);
    	shooterLeftShooterMotor.setD(leftKd);
    	shooterLeftShooterMotor.setF(leftKf);
    	shooterLeftShooterMotor.setAllowableClosedLoopErr(50);
    	shooterLeftShooterMotor.setControlMode(0);
    	shooterLeftShooterMotor.setFeedbackDevice(FeedbackDevice.QuadEncoder);
    	//LiveWindow.addActuator("Shooter", "Left Shooter", shooterLeftShooterMotor);
    	
    	shooterCenterShooterMotor = new CANTalon(4);
    	shooterCenterShooterMotor.enableBrakeMode(false);
    	shooterCenterShooterMotor.setProfile(0);
    	shooterCenterShooterMotor.setP(centerKp);
    	shooterCenterShooterMotor.setI(centerKi);
    	shooterCenterShooterMotor.setD(centerKd);
    	shooterCenterShooterMotor.setF(centerKf);
    	shooterCenterShooterMotor.setAllowableClosedLoopErr(50);
    	shooterCenterShooterMotor.setControlMode(0);
    	shooterCenterShooterMotor.setFeedbackDevice(FeedbackDevice.QuadEncoder);
    	//LiveWindow.addActuator("Shooter", "Center Shooter", shooterCenterShooterMotor);
    	
    	shooterRightShooterMotor = new CANTalon(5);
    	shooterRightShooterMotor.enableBrakeMode(false);
    	shooterRightShooterMotor.setProfile(0);
    	shooterRightShooterMotor.setP(rightKp);
    	shooterRightShooterMotor.setI(rightKi);
    	shooterRightShooterMotor.setD(rightKd);
    	shooterRightShooterMotor.setF(rightKf);
    	shooterRightShooterMotor.setAllowableClosedLoopErr(50);
    	shooterRightShooterMotor.setControlMode(0);
    	shooterRightShooterMotor.setFeedbackDevice(FeedbackDevice.QuadEncoder);
    	//LiveWindow.addActuator("Shooter", "Right Shooter", shooterRightShooterMotor);
        
    	shooterTestCenterShooterMotor = new Talon(7);
    	
        drivetrainRobotDrive.setSafetyEnabled(false);
        drivetrainRobotDrive.setExpiration(0.1);
        drivetrainRobotDrive.setSensitivity(0.5);
        drivetrainRobotDrive.setMaxOutput(1.0);
        drivetrainRobotDrive.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
        drivetrainRobotDrive.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
        drivetrainRobotDrive.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
        drivetrainRobotDrive.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
        
        //can
        pdp = new PowerDistributionPanel(1);
        
        compressor = new Compressor(0);
        

    }
}
