package frc.robot.subsystems;



import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

public class cim extends SubsystemBase{gi
    int Victor_cim = 0;
    private final WPI_VictorSPX cim1 = new WPI_VictorSPX(Victor_cim);  
    private final MotorControllerGroup Cim_group  = new MotorControllerGroup(cim1);

    public cim(){
        this.cim1.configFactoryDefault();
    }

    @Override 
    public void periodic() {

    }
}
