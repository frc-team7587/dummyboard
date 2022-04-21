package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class neo extends SubsystemBase {
    private static final int deviceID = 1;
    private CANSparkMax motor;

    public neo() {
        motor = new CANSparkMax(deviceID, MotorType.kBrushless);
        motor.restoreFactoryDefaults();
    }
    
    @Override
    public void periodic() {

    }

}