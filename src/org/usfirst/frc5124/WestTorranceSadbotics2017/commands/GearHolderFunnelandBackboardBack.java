package org.usfirst.frc5124.WestTorranceSadbotics2017.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class GearHolderFunnelandBackboardBack extends CommandGroup {

    public GearHolderFunnelandBackboardBack() {
    	addSequential(new GearHolderFunnelBackboardBack());
    	addSequential(new GearHolderFunnelFrontBack());
    }
}
