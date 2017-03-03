package org.usfirst.frc5124.WestTorranceSadbotics2017.commands;

import org.usfirst.frc5124.WestTorranceSadbotics2017.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class GearHolderFunnelFrontBack extends Command {

    public GearHolderFunnelFrontBack() {
    	requires(Robot.gearHolder);
    }

    protected void initialize() {
    	Robot.gearHolder.funnelFrontBack();
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
