package scope;

public class Scope3_1 {

    public static void main(String[] args) {
        int m = 10;
        int temp = 0;
        // temp는 if문 안에서만 사용하면 되는데 비효율적인 메모리 사용과
        // 코드 복잡성이 증가할 수 있다
        if(m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}