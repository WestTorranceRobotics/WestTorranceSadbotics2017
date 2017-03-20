package org.usfirst.frc5124.WestTorranceSadbotics2017.commands;

import org.usfirst.frc5124.WestTorranceSadbotics2017.commands.Wait;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class GearHolderAutoRelease extends CommandGroup {

	    public GearHolderAutoRelease() {
	        addSequential(new GearHolderOpenGearHolder());
	        addSequential(new Wait(.25));
	        addSequential(new GearHolderForkliftDown());
	    }
	}
