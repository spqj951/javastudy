import java.util.HashSet;

class Num {
    private int num;
    public Num(int n){
        num = n;
    }

    @Override
    public String toString() {
        return String.valueOf(num);
    }

    @Override
    public int hashCode() {
        return num%3; //분류 기준을 정해줌 -> String의 경우 잘 되어 있으나 숫자는 좀 다름
    }

    @Override
    public boolean equals(Object obj) {
        if(((Num)obj).num == num) //동등 비교 기준을 정해줌
            return true;
        else return false;
    }
}

public class HashSetEquality {
    public static void main(String[] args) {
        HashSet<Num> set = new HashSet<>();

        set.add(new Num(7799));
        set.add(new Num(7878));
        set.add(new Num(7799));
        System.out.println("인스턴스 수 : " + set.size());

        for(Num n : set){
            System.out.print(n.toString() + '\t');
        }
        System.out.println();
    }
}
