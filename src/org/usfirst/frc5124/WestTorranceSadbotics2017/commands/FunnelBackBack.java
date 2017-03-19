package org.usfirst.frc5124.WestTorranceSadbotics2017.commands;

import org.usfirst.frc5124.WestTorranceSadbotics2017.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class FunnelBackBack extends Command {

    public FunnelBackBack() {
    	requires(Robot.funnel);
    }

    protected void initialize() {
    	Robot.funnel.funnelBackboardBack();
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
