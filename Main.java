interface Printable {
    void print();
}

interface Showable {
    void print();
}

class Main implements Printable, Showable {
    public void print() {
        System.out.println("hello");
    }

    public static void main(String[] args) 
    {
        Main obj = new Main();
        obj.print();
    }
}
