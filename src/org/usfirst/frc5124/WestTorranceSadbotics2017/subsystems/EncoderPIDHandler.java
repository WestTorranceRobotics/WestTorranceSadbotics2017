package org.usfirst.frc5124.WestTorranceSadbotics2017.subsystems;

import edu.wpi.first.wpilibj.command.PIDSubsystem;

public class EncoderPIDHandler extends PIDSubsystem {
	

    public EncoderPIDHandler() {
    	super(0.05, 0.000001, 0.11);
    	getPIDController().setContinuous(false);
    	getPIDController().setAbsoluteTolerance(1);
    	getPIDController().setOutputRange(-0.6, 0.6);
    }

    public void initDefaultCommand() {
    }

    protected double returnPIDInput() {
        return 0;
    }

    protected void usePIDOutput(double output) {
    }
}
