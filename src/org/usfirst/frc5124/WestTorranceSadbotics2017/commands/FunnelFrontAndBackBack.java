package org.usfirst.frc5124.WestTorranceSadbotics2017.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
/**
 *
 */
public class FunnelFrontAndBackBack extends CommandGroup {

    public FunnelFrontAndBackBack() {
    	addSequential(new FunnelBackBack());
    	addSequential(new FunnelFrontBack());
    }
}
