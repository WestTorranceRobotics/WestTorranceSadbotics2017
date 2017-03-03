package org.usfirst.frc5124.WestTorranceSadbotics2017.commands;

import org.usfirst.frc5124.WestTorranceSadbotics2017.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class GearHolderPusherIn extends Command {

    public GearHolderPusherIn() {
    	requires(Robot.gearHolder);
    }

    protected void initialize() {
    	Robot.gearHolder.pusherIn();
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
