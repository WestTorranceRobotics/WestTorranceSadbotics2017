package org.usfirst.frc5124.WestTorranceSadbotics2017.commands;

import org.usfirst.frc5124.WestTorranceSadbotics2017.Robot;
import org.usfirst.frc5124.WestTorranceSadbotics2017.subsystems.GearHolder;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class GearHolderOpenGearHolder extends Command {

    public GearHolderOpenGearHolder() {
    	requires(Robot.gearHolder);
    }

    protected void initialize() {
    	Robot.gearHolder.holderOpen();
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
