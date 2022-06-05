package frc.robot.subsystems;

import static frc.robot.Constants.*;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class falcon extends SubsystemBase {
    
    private final TalonFX falcon = new TalonFX(falcon_ID);

    public falcon() {
        this.falcon.configFactoryDefault();
    }

    public void raise (){

    falcon.set(ControlMode.PercentOutput, falcon_SPEED); //up
    }

    public void lower() {

        falcon.set(ControlMode.PercentOutput, -falcon_SPEED); //down
    }

    public  void stop() {
        falcon.set(ControlMode.PercentOutput, 0); //stop
    }

    @Override public void periodic() {}  
}
