package week13labs;

public class Week13Labs {

    public static void main(String[] args) {
        
        TripleDice test = new TripleDice();
        System.out.println("Average of three dice using TripleDice is: " + test.Throw());
        
        Dice test2 = new Dice();
        System.out.println("Average of three dice using Dice is: " + test2.Throw());
        
        
    }
    
}
