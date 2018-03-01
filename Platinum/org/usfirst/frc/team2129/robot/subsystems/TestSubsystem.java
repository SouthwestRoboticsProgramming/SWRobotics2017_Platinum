package org.usfirst.frc.team2129.robot.subsystems;

import org.usfirst.frc.team2129.robot.RobotMap;
import org.usfirst.frc.team2129.robot.commands.UserTestCommand;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;

public class TestSubsystem extends Subsystem {
	
	private static Servo testServo = new Servo(RobotMap.testServo_PWM);

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new UserTestCommand());

	}
	
	public void setServo(double value) {
		testServo.set(value);
	}

}
