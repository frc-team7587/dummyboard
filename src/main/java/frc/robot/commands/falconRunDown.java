package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.*;
import frc.robot.subsystems.*;

public class falconRunDown extends CommandBase{
    private falcon falconMotor;

    public falconRunDown(falcon subsystem) {
        addRequirements(subsystem);
        falconMotor = subsystem;
    }

    @Override
    public void execute() {
        falconMotor.lower();
    }

    @Override
    public void end(boolean interrupted) {
        falconMotor.stop();
    }
}
