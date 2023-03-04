public class 문제21_2 {
    public static void main(String[] args) {

        Box<Integer> box1 = new Box<>();
        box1.set(99);
        Box<Integer> box2 = new Box<>();
        box2.set(55);
        System.out.println(box1.get()+ " & " + box2.get());
        swapBox(box1, box2);
        System.out.println(box1.get() + " & " + box2.get());


    }
    public static <T extends Number> void swapBox(Box<T> box1, Box<T> box2){
        T b1 = box1.get();
        T b2 = box2.get();
        box1.set(b2);
        box2.set(b1);
    }
}

class Box<T>{
    private T ob;
    public void set(T o){
        ob = o;
    }
    public T get(){
        return ob;
    }
}
