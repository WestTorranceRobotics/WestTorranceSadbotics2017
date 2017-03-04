package org.usfirst.frc5124.WestTorranceSadbotics2017.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class GearHolderSafeOpen extends CommandGroup {

    public GearHolderSafeOpen() {
    	addSequential(new GearHolderFunnelBackboardBack());
    	addSequential(new GearHolderFunnelFrontBack());
    	addSequential(new Wait(.25));
    	addSequential(new GearHolderOpenGearHolder());
    	addSequential(new Wait(.125));
    	addSequential(new GearHolderPusherOut());    
    }
}
