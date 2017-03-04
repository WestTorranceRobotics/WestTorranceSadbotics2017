package org.usfirst.frc5124.WestTorranceSadbotics2017.commands;

import org.usfirst.frc5124.WestTorranceSadbotics2017.RobotMap;
import org.usfirst.frc5124.WestTorranceSadbotics2017.Robot;
import org.usfirst.frc5124.WestTorranceSadbotics2017.subsystems.Shooters;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ShooterTeleopShoot extends Command {

    public ShooterTeleopShoot() {
    	requires(Robot.shooters);
    }

    protected void initialize() {
    	Robot.shooters.setControlMode(2);
    	Robot.shooters.setLeftShooter(Robot.shooters.getShootingSpeedLeft());
    	Robot.shooters.setCenterShooter(Robot.shooters.getShootingSpeedCenter());
    	Robot.shooters.setRightShooter(Robot.shooters.getShootingSpeedRight());
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    	Robot.shooters.setControlMode(0);
    	Robot.shooters.setAllShooters(0);
    	RobotMap.shooterLeftShooterMotor.enableBrakeMode(false);
    }

    protected void interrupted() {
    	end();
    }
}
