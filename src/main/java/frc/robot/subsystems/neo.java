package frc.robot.subsystems;
import com.revrobotics.CANSparkMax;

import static frc.robot.Constants.*;
import com.revrobotics.CnSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class neo extends SubsystemBase{
    private final CANSparkMax neo = new CANSparkMax(NEO_ID, com.revrobotics.CANSparkMaxLowLevel.MotorType.kBrushless);

    public neo() {
        neo.restoreFactoryDefaults();
    }

    public void raise() {
        neo.set(NEO_SPEED);
    }

    public void lower() {
        neo.set(-NEO_SPEED);
    }

    public void stop() {
        neo.set(0);
    }

    @Override
    public void periodic() {
    }


}
