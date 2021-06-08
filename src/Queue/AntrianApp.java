package Queue;
public class AntrianApp {
    public static void main(String[] args) {
        Antrian.title();
        Antrian antrian=new Antrian(10);
        antrian.enqueue(40);
        antrian.display();
        antrian.enqueue(33);
        antrian.display();
        System.out.println("Nilai Yang Paling depan = "+antrian.peek());
        antrian.enqueue(60);
        antrian.display();
        System.out.println("Yang Diambil dari Antrian = "+ antrian.dequeue());
        antrian.display();
        System.out.println("Yang Diambil Dari antrian = "+ antrian.dequeue());
        antrian.display();
        antrian.enqueue(54);
        antrian.display();
        System.out.println("Nilai Yang Paling Depan = "+antrian.peek());
    }
}
