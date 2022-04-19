package frc.robot.subsystems;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class falcon extends SubsystemBase{
    int falcon_talon =1;
    private final TalonSRX falcon1 = new TalonSRX(falcon_talon);
    public falcon(){
        this.falcon1.configFactoryDefault();
    }

    @Override 
    public void periodic() {

    }
}
