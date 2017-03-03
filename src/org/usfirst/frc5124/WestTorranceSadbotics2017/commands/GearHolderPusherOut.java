package org.usfirst.frc5124.WestTorranceSadbotics2017.commands;

import org.usfirst.frc5124.WestTorranceSadbotics2017.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class GearHolderPusherOut extends Command {

    public GearHolderPusherOut() {
    	requires(Robot.gearHolder);
    }

    protected void initialize() {
    	Robot.gearHolder.pusherOut();
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
