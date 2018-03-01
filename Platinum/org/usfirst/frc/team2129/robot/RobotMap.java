/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2129.robot;

import org.usfirst.frc.team2129.util.encoderdesc.CANTalonEncoderDescriptor;
import org.usfirst.frc.team2129.util.encoderdesc.IEncoderDescriptor;
import org.usfirst.frc.team2129.util.motordesc.CANMotorDescriptor;
import org.usfirst.frc.team2129.util.motordesc.MotorDescriptor;
import org.usfirst.frc.team2129.util.motordesc.PWMMotorDescriptor;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static MotorDescriptor driveRight1 = new CANMotorDescriptor(10, true);
	public static MotorDescriptor driveRight2 = new CANMotorDescriptor(11, true);
	
	public static MotorDescriptor driveLeft1  = new CANMotorDescriptor(20);
	public static MotorDescriptor driveLeft2  = new CANMotorDescriptor(21);
	
	public static MotorDescriptor climber1    = new PWMMotorDescriptor(0, true);
	public static MotorDescriptor climber2    = new PWMMotorDescriptor(1, true);
	
	public static int testServo_PWM = 2;
	
	public static IEncoderDescriptor climberEncoder = new CANTalonEncoderDescriptor(driveLeft1);
}
