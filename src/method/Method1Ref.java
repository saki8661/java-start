package method;

public class Method1Ref {

    public static void main(String[] args) {
        // 계산1
        int sum1 = add(1, 2);
        System.out.println("결과 1 출력 : " + sum1);

        // 계산2
        int sum2 = add(10, 20);
        System.out.println("결과 2 출력 : " + sum2);
    }

    // 메서드 호출
    public static  int add(int a, int b) {
        System.out.println(a + "+ " + b + " 연산 수행");
        int sum = a + b;
        return sum;
    }
}
