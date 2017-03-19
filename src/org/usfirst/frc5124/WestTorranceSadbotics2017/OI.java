package org.usfirst.frc5124.WestTorranceSadbotics2017;

import org.usfirst.frc5124.WestTorranceSadbotics2017.commands.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


public class OI {
	
	public double speed;
	
	//Joysticks
	public static Joystick driver;
	public static Joystick operator;
    
	//Joystick Buttons
	//Driver Buttons
	public JoystickButton driverButton2;
	
//nothin to see here folks//
	
	//Operator Buttons
	public JoystickButton operatorButton2;
	public JoystickButton operatorButton3;
	public JoystickButton operatorButton4;
	public JoystickButton operatorButton5;
	public JoystickButton operatorButton6;
	public JoystickButton operatorButton7;
	public JoystickButton operatorButton8;
	public JoystickButton operatorButton12;
	public JoystickButton operatorButton14;
	public JoystickButton operatorButton15;
	
	public OI() {

		//Joysticks
		driver = new Joystick(0);
		operator = new Joystick(1);
		
		//Joystick Buttons
		//Driver Buttons
		
		driverButton2 = new JoystickButton(driver, 2);
		driverButton2.whenPressed(new DrivetrainReverseFront());
		//LoL//
		
		//Operator Button	
		operatorButton6 = new JoystickButton(operator, 6);
		operatorButton6.whenPressed(new GearHolderSafeOpen());
		
		operatorButton12 = new JoystickButton(operator, 12);
		operatorButton12.whileHeld(new FunnelFrontForward());
		operatorButton12.whenReleased(new FunnelFrontBack());
		
		operatorButton14 = new JoystickButton(operator, 14);
		operatorButton14.whenPressed(new GearHolderAutoRelease());
		
		operatorButton15 = new JoystickButton(operator, 15);
		operatorButton15.whileHeld(new FunnelFrontAndBackForward());
		operatorButton15.whenReleased(new FunnelFrontAndBackBack());
		
		operatorButton8 = new JoystickButton(operator, 8);
		operatorButton8.whileHeld(new ShooterTeleopShoot());
		
		
		
		SmartDashboard.putData("Turn 90", new DrivetrainTurnWithGyro(90));
		
    }
    
	public Joystick getDriver() {
		return driver;
	}
    
    public Joystick getOperator() {
    	return operator;
    }
    
    public double getLeftYAxisSens() {
    	if(Math.abs(driver.getRawAxis(1)) > 0.02) {
    		return Math.pow(driver.getRawAxis(1), 3);
    	} else {
    		return 0;
    	}
    }
    
    public double getRightXAxisSens() {
    	if(Math.abs(driver.getRawAxis(2)) > 0.02) {
    		return Math.pow(driver.getRawAxis(2), 3);
    	} else {
    		return 0;
    	}
    }
   
    public boolean getAuto1() {
    	return getOperator().getRawButton(1);
    }
    	
    public boolean getAuto2() {
    	return getOperator().getRawButton(2);
    }
    
    public boolean getAuto3() {
    	return getOperator().getRawButton(3);
    }
    
    public boolean getAuto4() {
    	return getOperator().getRawButton(4);
    }
    
}

