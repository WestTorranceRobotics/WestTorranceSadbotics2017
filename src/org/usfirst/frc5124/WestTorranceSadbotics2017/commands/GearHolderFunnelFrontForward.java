package org.usfirst.frc5124.WestTorranceSadbotics2017.commands;

import org.usfirst.frc5124.WestTorranceSadbotics2017.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class GearHolderFunnelFrontForward extends Command {

    public GearHolderFunnelFrontForward() {
    	requires(Robot.gearHolder);
    }

    protected void initialize() {
    	Robot.gearHolder.funnelFrontForward();
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
