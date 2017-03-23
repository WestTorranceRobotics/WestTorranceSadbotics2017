package org.usfirst.frc5124.WestTorranceSadbotics2017;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc5124.WestTorranceSadbotics2017.commands.AutoLittleShootsBlue;
import org.usfirst.frc5124.WestTorranceSadbotics2017.subsystems.*;

public class Robot extends IterativeRobot {

    Command autonomousCommand;

    public static OI oi;
    public static Drivetrain drivetrain;
    public static GearHolder gearHolder; 
    public static Funnel funnel;
    public static Shooters shooters; 
    public static GyroPIDHandler gyroPIDHandler;
    public static EncoderPIDHandler encoderPIDHandler;
    public static boolean button6IsPressed;
    public static boolean button8IsPressed;
   

    public void robotInit() {
    	RobotMap.init();
        drivetrain = new Drivetrain();
        gearHolder = new GearHolder();
        funnel = new Funnel();
        shooters = new Shooters();
        gyroPIDHandler = new GyroPIDHandler();
        encoderPIDHandler = new EncoderPIDHandler();
        
        autonomousCommand = new AutoLittleShootsBlue();
        
        CameraServer.getInstance().startAutomaticCapture();
        
        oi = new OI();
        
        RobotMap.drivetrainGyro.calibrate();
        RobotMap.pdp.clearStickyFaults();
    }

    public void disabledInit(){
    	drivetrain.resetAllOutputs();
    }

    public void disabledPeriodic() {
        Scheduler.getInstance().run();
    }

    public void autonomousInit() {
    	drivetrain.setSpeed(1);
    	drivetrain.resetAllOutputs();
        if (autonomousCommand != null) autonomousCommand.start();
        
        /* if(oi.getAuto4()) {
		if(oi.getAuto3() && oi.getAuto1() && oi.getAuto2()) {
			autonomousCommand = null;
		} else if(oi.getAuto3() && oi.getAuto1() && !oi.getAuto2()) {
			autonomousCommand = null;
		} else if(oi.getAuto3() && !oi.getAuto1() && oi.getAuto2()) {
			autonomousCommand = null;
		} else if(oi.getAuto3() && !oi.getAuto1() && !oi.getAuto2()) {
			autonomousCommand = null;
		} else if(!oi.getAuto3() && oi.getAuto1() && oi.getAuto2()) {
			autonomousCommand = null;
		} else if(!oi.getAuto3() && oi.getAuto1() && !oi.getAuto2()) {
			autonomousCommand = null;
		} else if(!oi.getAuto3() && !oi.getAuto1() && oi.getAuto2()) {
			autonomousCommand = null;
		} else if(!oi.getAuto3() && !oi.getAuto1() && !oi.getAuto2()) {
			autonomousCommand = null;
		}
	} else {
		autonomousCommand = null; 
	} */
    }
        
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
        if (autonomousCommand != null) autonomousCommand.cancel();
        Robot.drivetrain.frontAndCenter();
        Robot.drivetrain.slowTurn();
        Robot.gyroPIDHandler.disable();
        Robot.encoderPIDHandler.disable();
        Robot.drivetrain.resetAllOutputs();
    }
    
    public void teleopPeriodic() {
    	//SmartDashboard.putNumber("Velocity", Robot.shooters.getCenterVelocity());
        Scheduler.getInstance().run();
        
       // Robot.shooters.displayDiagnostics();
        
       // SmartDashboard.putData("gyro", RobotMap.drivetrainGyro);
        
        if(Robot.oi.getDriver().getRawButton(5)) {
        	Robot.drivetrain.setSpeed(1);
        	Robot.drivetrain.fastTurn();
        } else {
        	Robot.drivetrain.setSpeed(0.65);
        	Robot.drivetrain.slowTurn();
        }
        
        if(oi.getDriver().getRawButton(6) && !button6IsPressed) {
        	button6IsPressed = true;
        	shooters.shootingSpeedLeft -= 200;
        	shooters.shootingSpeedCenter -= 200;
        	shooters.shootingSpeedLeft -= 200;
        } else if(oi.getDriver().getRawButton(6)) {
        	button6IsPressed = false;
        }
        
        if(oi.getDriver().getRawButton(8) && !button8IsPressed) {
        	button8IsPressed = true;
        	shooters.shootingSpeedLeft += 200;
        	shooters.shootingSpeedCenter += 200;
        	shooters.shootingSpeedLeft += 200;
        } else if(oi.getDriver().getRawButton(8)) {
        	button8IsPressed = false;
        }
        

        
    }

    public void testPeriodic() {
        LiveWindow.run();
        drivetrain.setPIDOutputs();
    }
}
