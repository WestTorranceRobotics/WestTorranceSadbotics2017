package org.usfirst.frc5124.WestTorranceSadbotics2017.commands;


import org.usfirst.frc5124.WestTorranceSadbotics2017.Robot;
import org.usfirst.frc5124.WestTorranceSadbotics2017.subsystems.GearHolder;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class FunnelBackForward extends Command {

    public FunnelBackForward() {
    	requires(Robot.funnel);
    }

    protected void initialize() {
    	Robot.funnel.funnelBackboardForward();
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
