package org.usfirst.frc5124.WestTorranceSadbotics2017.subsystems;

import org.usfirst.frc5124.WestTorranceSadbotics2017.RobotMap;
import org.usfirst.frc5124.WestTorranceSadbotics2017.commands.*;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Drivetrain extends Subsystem {

    private final SpeedController left1 = RobotMap.drivetrainLeft1;
    private final SpeedController left2 = RobotMap.drivetrainLeft2;
    private final SpeedController right1 = RobotMap.drivetrainRight1;
    private final SpeedController right2 = RobotMap.drivetrainRight2;
    private final RobotDrive robotDrive = RobotMap.drivetrainRobotDrive;

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
    
}

