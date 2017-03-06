package org.usfirst.frc5124.WestTorranceSadbotics2017.commands;

import org.usfirst.frc5124.WestTorranceSadbotics2017.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DrivetrainReverseFront extends Command {

    public DrivetrainReverseFront() {
        requires(Robot.drivetrain);
    }

    protected void initialize() {
    	Robot.drivetrain.driveStop();
    	Robot.drivetrain.reverseFront();
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
