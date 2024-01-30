package loop.ex;

public class ForEx2 {
    public static void main(String[] args) {
//        for (int num = 2,  count = 1; count <= 10; num+=2, count++) {
//            System.out.println(num);
//        }
        int num = 2;
        for (int count = 1; count <= 10; count++) {
            System.out.println(num);
            num += 2;
        }
        // 결과값은 같지만 아래 코드가 더 좋은 코드이다.
        // 증감식과 짝수를 호출하는 로직은 서로 다른 로직이기 때문에
    }
}
