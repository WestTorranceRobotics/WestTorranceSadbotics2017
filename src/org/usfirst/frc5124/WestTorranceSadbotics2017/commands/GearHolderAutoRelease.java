package org.usfirst.frc5124.WestTorranceSadbotics2017.commands;

import org.usfirst.frc5124.WestTorranceSadbotics2017.commands.GearHolderSafeClose;
import org.usfirst.frc5124.WestTorranceSadbotics2017.commands.GearHolderSafeOpen;
import org.usfirst.frc5124.WestTorranceSadbotics2017.commands.GearHolderWaitForClearing;
import org.usfirst.frc5124.WestTorranceSadbotics2017.commands.Wait;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class GearHolderAutoRelease extends CommandGroup {

	    public GearHolderAutoRelease() {
	        addSequential(new GearHolderSafeOpen());
	        addSequential(new Wait(1.125));
	        addSequential(new GearHolderSafeClose());
	    }
	}
