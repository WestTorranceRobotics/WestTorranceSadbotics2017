package org.usfirst.frc5124.WestTorranceSadbotics2017.commands;

import org.usfirst.frc5124.WestTorranceSadbotics2017.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class GearHolderCloseGearHolder extends Command {

    public GearHolderCloseGearHolder() {
    	requires(Robot.gearHolder);
    }

    protected void initialize() {
    	Robot.gearHolder.holderClose();
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
