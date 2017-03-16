package org.usfirst.frc5124.WestTorranceSadbotics2017.commands;



import org.usfirst.frc5124.WestTorranceSadbotics2017.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;

/**
 *
 */
public class GearHolderBraceForImpact extends Command {

    public GearHolderBraceForImpact() {
    	requires(Robot.gearHolder);
    }

    protected void initialize() {
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return Robot.gearHolder.getLimitSwitch();
    }

    protected void end() {
    	Scheduler.getInstance().add(new GearHolderAutoRelease());
    }

    protected void interrupted() {
    }
}
