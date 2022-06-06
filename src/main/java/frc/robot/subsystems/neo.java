package frc.robot.subsystems;

import static frc.robot.Constants.*;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class neo extends SubsystemBase {
    private final CANSparkMax neo = new CANSparkMax(NEO_ID, MotorType.kBrushless);

    public neo() {
        neo.restoreFactoryDefaults();
    }
    
    public void raise() {
        neo.set(NEO_SPEED);
    }

    public void lower() {
        neo.set(-NEO_SPEED);
    }

    @Override
    public void periodic() {

    }

}