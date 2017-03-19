package org.usfirst.frc5124.WestTorranceSadbotics2017.subsystems;

import org.usfirst.frc5124.WestTorranceSadbotics2017.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Funnel extends Subsystem {
	
	private final DoubleSolenoid frontSolenoid = RobotMap.funnelFrontSolenoid;
	private final DoubleSolenoid backSolenoid = RobotMap.funnelBackSolenoid;

	public void funnelFrontForward() {
		frontSolenoid.set(Value.kForward);
    }
    
    public void funnelFrontBack() {
    	frontSolenoid.set(Value.kReverse);
    }
    
    public void funnelBackboardForward() {
    	backSolenoid.set(Value.kForward);
    }
    
    public void funnelBackboardBack() {
    	backSolenoid.set(Value.kReverse);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

