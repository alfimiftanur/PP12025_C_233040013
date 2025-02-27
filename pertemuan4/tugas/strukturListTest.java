package pertemuan4.tugas;
public class strukturListTest {
    public static void main(String[] args){

        strukturList list1 = new strukturList();
        list1.addTail(4.5);
        list1.addHead(2.1);
        list1.addMid(3.4,2);

        strukturList list2 = new strukturList();
        list2.addTail(5.5);
        list2.addHead(3.4);
        list2.addMid(2.1,2);
        list2.addMid(1.1,3);
        list2.addMid(4.5,4);

        System.out.println("=====Tugas 2.a=====");
        list1.displayElement();
        System.out.println("\n=====Tugas 2.b=====");
        list2.displayElement();
    }
}
