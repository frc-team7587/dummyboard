package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class falcon extends SubsystemBase{
    private static final int deviceID = 1;
    private TalonFX motor;

    public falcon() {
        motor = new TalonFX(deviceID);
        motor.configFactoryDefault();
    }

    @Override
    public void periodic() {

    }
}
