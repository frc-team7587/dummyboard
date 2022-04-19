package frc.robot.subsystems;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
public class neo extends SubsystemBase{
    private static final int neo_sparkmax = 2; 

    private CANSparkMax neo1;
    public neo (){
        neo1 = new CANSparkMax(neo_sparkmax, MotorType.kBrushless);
        neo1.restoreFactoryDefaults();

    }
    @Override 
    public void periodic() {

    }
}
