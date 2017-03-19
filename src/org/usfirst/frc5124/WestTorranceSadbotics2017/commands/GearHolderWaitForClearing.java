package org.usfirst.frc5124.WestTorranceSadbotics2017.commands;

import org.usfirst.frc5124.WestTorranceSadbotics2017.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class GearHolderWaitForClearing extends Command {

    public GearHolderWaitForClearing() {
        requires(Robot.gearHolder);
    }

    protected void initialize() {
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return !Robot.gearHolder.getLimitSwitch();
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}