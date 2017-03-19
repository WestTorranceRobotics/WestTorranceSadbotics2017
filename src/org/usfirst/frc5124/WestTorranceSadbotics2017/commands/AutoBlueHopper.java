package org.usfirst.frc5124.WestTorranceSadbotics2017.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutoBlueHopper extends CommandGroup {

    public AutoBlueHopper() {
    	addSequential(new DriveTrainDriveStraightWithSeconds(0.6, 1.8));
    	addSequential(new DrivetrainTurnWithGyro(-90));
    	addSequential(new FunnelFrontAndBackForward());
    	addSequential(new DriveTrainRunOnSeconds(1.25));
    	addSequential(new Wait(4));
    	addSequential(new DriveTrainRunOnSeconds(-0.6 , .75));
    	addSequential(new DrivetrainTurnWithGyro(-90));
    	addSequential(new DriveTrainDriveStraightWithSeconds(0.6 , 2.5));
    }
}
