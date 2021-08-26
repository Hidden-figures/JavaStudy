package sec03.exam02;

public class KoreanExample {

    public static void main(String[] args){

        Korean k1 = new Korean("김민경", "010-1234-1234");
        System.out.println(k1.nation);
        System.out.println(k1.name);
        System.out.println(k1.ssn);
        System.out.println("-------------");
        Korean k2 = new Korean("김밍굥", "010-5678-5678");
        System.out.println(k1.nation);
        System.out.println(k2.name);
        System.out.println(k2.ssn);

    }
}
