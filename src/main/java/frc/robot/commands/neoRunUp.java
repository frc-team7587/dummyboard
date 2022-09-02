package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.*;
import frc.robot.subsystems.*;

public class neoRunUp extends CommandBase{
    private neo neoMotor;

    public neoRunUp(neo subsystem) {
        addRequirements(subsystem);
        neoMotor = subsystem;
    }

    @Override
    public void execute() {
        neoMotor.raise();
    }

    @Override
    public void end(boolean interrupted) {
        neoMotor.stop();
    }

}