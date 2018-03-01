package org.usfirst.frc.team2129.robot.commands;

import org.usfirst.frc.team2129.robot.OI;
import org.usfirst.frc.team2129.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class UserTestCommand extends Command {
	
	public UserTestCommand() {
		requires(Robot.s_Test);
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	
	protected void execute() {
		Robot.s_Test.setServo((OI.fourth.getX()/2)+0.5);
	}

}
