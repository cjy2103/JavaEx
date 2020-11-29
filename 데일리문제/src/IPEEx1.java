// 2020년 정처기 5회 자바 상속문제 풀이
class Parent{
    int compute(int num) {
        if( num <= 1) return num;
        return compute(num-1) + compute(num-2);
    }
}

class Child extends Parent {
    int compute(int num) {
        if( num <= 1) return num;
        return compute(num-1) + compute(num-3);
    }
}
public class IPEEx1 {
    public static void main(String [] args){
        Parent obj = new Child();   // 생성자 Child() 즉 class Parent 를 상속받는 Child를 생성
        System.out.println(obj.compute(4)); // 1 -> return 1 2 -> return compute(1) + compute(-1) = 1+ -1 =0
                                                 // 3 -> return compute(2) + compute (0) = 0+0 4-> return compute(3) + compute(1) = 0 + 1 = 1
    }
}
