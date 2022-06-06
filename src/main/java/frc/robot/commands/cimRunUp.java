package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.*;
import frc.robot.subsystems.*;

public class cimRunUp extends CommandBase{
    private cim cimMotor;

    public cimRunUp(cim subsystem) {
        addRequirements(subsystem);
        cimMotor = subsystem;
    }

    @Override
    public void execute() {
        cimMotor.raise();
    }

    @Override
    public void end(boolean interrupted) {
        cimMotor.stop();
    }
}