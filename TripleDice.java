package week13labs;

public class TripleDice extends Dice {
    
    @Override
    
    public int Throw () {
        int roll = (super.Throw() + super.Throw() + super.Throw())/3;
        return roll;
    }
    
}
