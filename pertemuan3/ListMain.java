package pertemuan3;

//Latihan-4
public class ListMain {
    public static void main (String[] args){
        strukturList list = new strukturList();

//        latihan-4

        System.out.println("Element: ");
        list.addTail(3);
        list.addTail(4);
        list.addTail(5);
        list.displayElement();

//        test-1

        strukturList list1 = new strukturList();
        System.out.println();
        System.out.println("Element2: ");
        list1.addTail(3);
        list1.addTail(2);
        list1.addTail(1);
        list1.displayElement();


        strukturList list2 = new strukturList();
        System.out.println();
        System.out.println("Element3: ");
        list2.addTail(1);
        list2.addTail(4);
        list2.addTail(5);
        list2.addTail(7);
        list2.displayElement();

//        test-2
        strukturList list3 = new strukturList();
        System.out.println();
        System.out.println("Tes-2:");
        list3.addHead(3);
        list3.addHead(4);
        list3.addHead(5);
        list3.displayElement();

//        tes-3

        strukturList list4 = new strukturList();
        System.out.println();
        System.out.println("Tes-3:");
        list4.addHead(1);
        list4.addHead(2);
        list4.addHead(3);
        list4.displayElement();

//        test-3

        strukturList list5 = new strukturList();
        System.out.println();
        System.out.println("Tes-3:");
        list5.addHead(7);
        list5.addHead(5);
        list5.addHead(4);
        list5.addHead(1);
        list5.displayElement();
    }
}
