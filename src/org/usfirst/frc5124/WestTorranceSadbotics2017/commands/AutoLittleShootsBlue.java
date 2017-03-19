package org.usfirst.frc5124.WestTorranceSadbotics2017.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutoLittleShootsBlue extends CommandGroup {

    public AutoLittleShootsBlue() {
    	addSequential(new DriveTrainDriveStraightWithSeconds(-0.6, 2.5));
    	addSequential(new Wait(1));
    	addSequential(new DriveTrainDriveStraightWithSeconds(0.6, 1.9));
    	addSequential(new DrivetrainTurnWithGyro(45));
    	addSequential(new DriveTrainDriveStraightWithSeconds(0.6, 1.5));
    }
}
