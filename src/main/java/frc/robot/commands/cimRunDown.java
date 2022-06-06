package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.*;
import frc.robot.subsystems.*;

public class cimRunDown extends CommandBase{
    private cim cimMotor;

    public cimRunDown(cim subsystem) {
        addRequirements(subsystem);
        cimMotor = subsystem;
    }

    @Override
    public void execute() {
        cimMotor.lower();
    }

    @Override
    public void end(boolean interrupted) {
        cimMotor.stop();
    }
}
