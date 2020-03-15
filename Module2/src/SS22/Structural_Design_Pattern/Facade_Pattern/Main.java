package SS22.Structural_Design_Pattern.Facade_Pattern;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ListFilter listFilter = new ListFilter();
        RandomList randomList = new RandomList();
        ListPrinter listPrinter = new ListPrinter();
        List<Integer> integers = randomList.generateList(10, 1, 20);
        listPrinter.printList(integers);
        System.out.println("----------------------------");
        integers = listFilter.filterOdd(integers);
        listPrinter.printList(integers);

    }
}
