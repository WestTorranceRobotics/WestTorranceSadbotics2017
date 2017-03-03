package org.usfirst.frc5124.WestTorranceSadbotics2017;

import java.util.function.Function;
import org.usfirst.frc5124.WestTorranceSadbotics2017.commands.*;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


public class OI {
	
	//Joysticks
	public static Joystick driver;
	public static Joystick operator;
    
	//Joystick Buttons
	//Driver Buttons
//nothin to see here folks//
	
	//Operator Buttons
	public JoystickButton operatorButton2;
	public JoystickButton operatorButton3;
	public JoystickButton operatorButton4;
	public JoystickButton operatorButton5;
	public JoystickButton operatorButton6;
	public JoystickButton operatorButton7;
	public JoystickButton operatorButton8;
	public JoystickButton operatorButton9;
	
	public OI() {

		//Joysticks
		driver = new Joystick(0);
		operator = new Joystick(1);
		
		//Joystick Buttons
		//Driver Buttons
//lol//
		
		//Operator Buttons
		operatorButton2 = new JoystickButton(operator, 2);
		operatorButton2.whenPressed(new GearHolderFunnelBackboardBack());
		
		operatorButton3 = new JoystickButton(operator, 3);
		operatorButton3.whenPressed(new GearHolderFunnelBackboardForward());
		
		operatorButton4 = new JoystickButton(operator, 4);
		operatorButton4.whenPressed(new GearHolderFunnelFrontBack());
		
		operatorButton5 = new JoystickButton(operator, 5);
		operatorButton5.whenPressed(new GearHolderFunnelFrontForward());
		
		operatorButton6 = new JoystickButton(operator, 6);
		operatorButton6.whenPressed(new GearHolderOpenGearHolder());
		
		operatorButton7 = new JoystickButton(operator, 7);
		operatorButton7.whenPressed(new GearHolderCloseGearHolder());
		
		operatorButton8 = new JoystickButton(operator, 8);
		operatorButton8.whenPressed(new GearHolderPusherIn());
		
		operatorButton9 = new JoystickButton(operator, 9);
		operatorButton9.whenPressed(new GearHolderPusherOut());
    }
    
	public Joystick getDriver() {
		return driver;
	}
    
    public Joystick getOperator() {
    	return operator;
    }

}

