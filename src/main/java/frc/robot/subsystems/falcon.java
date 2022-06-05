package frc.robot.subsystems;

import static frc.robot.Constants.*;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class falcon extends SubsystemBase{
    private final TalonFX falconMotor = new TalonFX(FALCON_ID);;

    public falcon() {
        falconMotor.configFactoryDefault();
    }

    public void raise() {
        falconMotor.set(ControlMode.PercentOutput, FALCON_SPEED); // Goes up
    }

    public void lower() {
        falconMotor.set(ControlMode.PercentOutput, -FALCON_SPEED); // Goes down
    }

    public void stop() {
        falconMotor.set(ControlMode.PercentOutput, 0); // Stops
    }
    @Override
    public void periodic() {

    }
}
