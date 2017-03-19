package org.usfirst.frc5124.WestTorranceSadbotics2017.subsystems;

import org.usfirst.frc5124.WestTorranceSadbotics2017.RobotMap;
import org.usfirst.frc5124.WestTorranceSadbotics2017.commands.GearHolderBraceForImpact;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

public class GearHolder extends Subsystem {
	
	private final DoubleSolenoid holderSolenoid = RobotMap.gearHolderHolderSolenoid;
	private final DoubleSolenoid pusherSolenoid = RobotMap.gearHolderPusherSolenoid;
	private final DigitalInput limitSwitch = RobotMap.gearHolderLimitSwitch;
	
    public void initDefaultCommand() {
    	setDefaultCommand(new GearHolderBraceForImpact());
    }
    
    public void holderOpen() {
    	holderSolenoid.set(Value.kReverse);
    }
    
    public void holderClose() {
    	holderSolenoid.set(Value.kForward);
    }
    
    public void pusherOut() {
    	pusherSolenoid.set(Value.kReverse);
    }
    
    public void pusherIn() {
    	pusherSolenoid.set(Value.kForward);
    }
    
    public boolean getLimitSwitch() {
    	return !limitSwitch.get();
    }
}

