package frc.robot.subsystems;

import static frc.robot.Constants.*;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class cim extends SubsystemBase {
    private final VictorSPX cimMotor = new VictorSPX(CIM_ID);

    public cim() {
        this.cimMotor.configFactoryDefault();
    }

    public void raise() {
        cimMotor.set(ControlMode.PercentOutput, CIM_SPEED); // Goes up
    }

    public void lower() {
        cimMotor.set(ControlMode.PercentOutput, -CIM_SPEED); // Goes down
    }

    public void stop() {
        cimMotor.set(ControlMode.PercentOutput, 0); // Stops
    }

    @Override
    public void periodic() {

    }
}