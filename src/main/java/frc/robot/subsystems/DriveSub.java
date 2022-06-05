// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Robot;

public class DriveSub extends SubsystemBase {
  /** Creates a new DriveSub. */
  private TalonSRX motorLeft1 = new TalonSRX(Robot.MOTOR_LEFT_1_ID);
  private TalonSRX motorLeft2 = new TalonSRX(Robot.MOTOR_LEFT_2_ID);
  private TalonSRX motorRight1 = new TalonSRX(Robot.MOTOR_RIGHT_1_ID);
  private TalonSRX motorRight2 = new TalonSRX(Robot.MOTOR_RIGHT_2_ID);
  public DriveSub() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run

    public void setLeftMotors(double speed) {
      motorLeft1.set(ControlMode.PercentOutput, -speed);
      motorLeft2.set(ControlMode.PercentOutput, -speed);
  }

  public void setRightMotors(double speed) {
    motorRight1.set(ControlMode.PercentOutput, speed);
    motorRight2.set(ControlMode.PercentOutput, speed);

}
