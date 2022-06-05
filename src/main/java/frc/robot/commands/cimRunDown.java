package frc.robot.commands;

public class cimRunDown extends CommandBase {
    private Arm m_arm;
    private int count;

    public cimRunDown(Arm subsystem) {

        addRequirements(subsystem);
        m_arm = subsystem;
    }


    @Override
    public void initialize() {
        count=0;
    }

    @Override
    public void execute() {
        if( (count)%20==0){
            System.out.println("arm Down [" + ++count + "]");
        }
        m_arm.lower();
    }
}
