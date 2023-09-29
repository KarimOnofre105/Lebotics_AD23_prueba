// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.ElevatorSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;

/** An example command that uses an example subsystem. */
public class elevatorUpCommand extends CommandBase {
  private final ElevatorSubsystem subsystem;

  
  public elevatorUpCommand(ElevatorSubsystem m_subsystem) {
    subsystem = m_subsystem;

    addRequirements(subsystem);
  }


  @Override
  public void initialize() {}


  @Override
  public void execute() {
    subsystem.moveLeft(30);
  }


  @Override
  public void end(boolean interrupted) {}


  @Override
  public boolean isFinished() {
    return false;
  }
}
