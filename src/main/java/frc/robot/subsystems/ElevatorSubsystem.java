package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class ElevatorSubsystem extends SubsystemBase{
    private static final CANSparkMax motor1 = new CANSparkMax(Constants.ElevatorConstants.arm_Motor_Id, 
        MotorType.kBrushless);

  private RelativeEncoder motor1_encoder;

    public ElevatorSubsystem() {
        motor1_encoder=motor1.getEncoder();
    }

    public void moveRight(int speed){
        motor1.set(speed);
    }

    public void moveLeft(int speed){
        motor1.set(-speed);
    }
    

}
