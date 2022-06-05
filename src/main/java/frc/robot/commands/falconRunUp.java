package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.*;
import frc.robot.subsystems.*;

public class falconRunUp extends CommandBase{
    private falcon falconMotor;

    public falconRunUp(falcon subsystem) {
        addRequirements(subsystem);
        falconMotor = subsystem;
    }

    @Override
    public void execute() {
        falconMotor.raise();
    }

    @Override
    public void end(boolean interrupted) {
        falconMotor.stop();
    }
}