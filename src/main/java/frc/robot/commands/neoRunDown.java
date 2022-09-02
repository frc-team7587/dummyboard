package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.*;
import frc.robot.subsystems.*;

public class neoRunDown {
    private neo neoMotor;

    public neoRunDown(neo subsystem) {
        addRequirements(subsystem);
        neoMotor = subsystem;
    }

    @Override
    public void execute() {
        neo.lower();
    }

    @Override
    public void end(boolean interrupted) {
        neo.stop();
    }

}
