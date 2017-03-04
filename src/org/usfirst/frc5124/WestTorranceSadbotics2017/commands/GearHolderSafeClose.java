package org.usfirst.frc5124.WestTorranceSadbotics2017.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class GearHolderSafeClose extends CommandGroup {

    public GearHolderSafeClose() {
    	addSequential(new GearHolderFunnelBackboardBack());
    	addSequential(new GearHolderFunnelFrontBack());
    	addSequential(new Wait(.125));
    	addSequential(new GearHolderPusherIn());
    	addSequential(new Wait(.125));
    	addSequential(new GearHolderCloseGearHolder());    
    }
}
