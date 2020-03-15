package SS22.Structural_Design_Pattern.Facade_Pattern;

public class RandomNumber {
    public int generateInteger(int min, int max){
        double randomDouble = Math.random();
        int randomInteger =  (int) (randomDouble * (max - min + 1) + min);
        return randomInteger;
    }
}
