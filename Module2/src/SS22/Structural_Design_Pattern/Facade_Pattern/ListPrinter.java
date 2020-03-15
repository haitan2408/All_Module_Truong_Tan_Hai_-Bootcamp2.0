package SS22.Structural_Design_Pattern.Facade_Pattern;

import java.util.List;

public class ListPrinter {
    public void printList(List<Integer> numbers){
        for (Integer number: numbers) {
            System.out.println(number);
        }
    }
}
