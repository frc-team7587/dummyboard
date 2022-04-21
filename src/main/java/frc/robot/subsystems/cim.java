package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class cim extends SubsystemBase{
    private static final int deviceID = 1;
    private VictorSPX motor;

    public cim() {
        motor = new VictorSPX(deviceID);
        motor.configFactoryDefault();
    }

    @Override
    public void periodic() {

    }
}