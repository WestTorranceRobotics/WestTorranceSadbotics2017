package org.usfirst.frc5124.WestTorranceSadbotics2017;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc5124.WestTorranceSadbotics2017.commands.*;
import org.usfirst.frc5124.WestTorranceSadbotics2017.subsystems.*;

public class Robot extends IterativeRobot {

    Command autonomousCommand;

    public static OI oi;
    public static Drivetrain drivetrain;
    public static GearHolder gearHolder; 
    public static Shooters shooters; 
   

    public void robotInit() {
    RobotMap.init();
        drivetrain = new Drivetrain();
        gearHolder = new GearHolder();
        shooters = new Shooters();
        
        oi = new OI();

    }

    public void disabledInit(){

    }

    public void disabledPeriodic() {
        Scheduler.getInstance().run();
    }

    public void autonomousInit() {
        if (autonomousCommand != null) autonomousCommand.start();
    }

    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
        if (autonomousCommand != null) autonomousCommand.cancel();
        drivetrain.disable();
    }

    public void teleopPeriodic() {
    	SmartDashboard.putNumber("Velocity", Robot.shooters.getCenterVelocity());
        Scheduler.getInstance().run();
        
        Robot.shooters.displayDiagnostics();
        
        if(Robot.oi.getDriver().getRawButton(5)) {
        	Robot.drivetrain.setSpeed(0.85);
        } else {
        	Robot.drivetrain.setSpeed(0.5);
        }
    }

    public void testPeriodic() {
        LiveWindow.run();
    }
}
