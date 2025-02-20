package pertemuan3;

public class strukturList {
    Node HEAD;

    public boolean isEmpty() {
        return HEAD == null;
    }


//    Latihan-5
    public void addHead (int data){
        Node newNode = new Node (data);
        if (isEmpty()){
            HEAD = newNode;
        }
        else{
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }

//    Latihan-2
    public void addTail(int data) {
        Node posNode = null;
        Node curNode = null;
        Node newNode = new Node(data);

        if (isEmpty()) {
            HEAD = newNode;
        } else {
            curNode = HEAD;
            while (curNode != null) {
                posNode = curNode;
                curNode = curNode.getNext();
            }
            posNode.setNext(newNode);
        }
    }

//    Latihan-3
    public void displayElement(){
        Node curNode = HEAD;
        while (curNode != null) {
            System.out.print(curNode.getData()+ " ");
            curNode = curNode.getNext();
        }
    }
}
