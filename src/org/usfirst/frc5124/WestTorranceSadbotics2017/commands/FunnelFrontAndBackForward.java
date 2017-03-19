package org.usfirst.frc5124.WestTorranceSadbotics2017.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class FunnelFrontAndBackForward extends CommandGroup {

    public FunnelFrontAndBackForward() {
    	addSequential(new FunnelFrontForward());
    	addSequential(new Wait(.5));
    	addSequential(new FunnelBackForward());
    }
}
