package org.usfirst.frc5124.WestTorranceSadbotics2017.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class GearHolderFunnelandBackboardForward extends CommandGroup {

    public GearHolderFunnelandBackboardForward() {
    	addSequential(new GearHolderFunnelFrontForward());
    	addSequential(new Wait(.5));
    	addSequential(new GearHolderFunnelBackboardForward());
    }
}
