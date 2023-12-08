import jdk.nashorn.internal.objects.annotations.Function;

public class Ex14_0 {
    public static void main(String[] args){
        // Object obj = (a,b) -> a>b? a:b; // 람다식, 익명 객체
/*       MyFunction f = new MyFunction(){
            public int max(int a,int b){ // 오버라이딩 - 접근제어자는 좁게 못바꿈
                return a>b? a:b;
            }
        };*/

        MyFunction f = (a,b) -> a>b?a:b; // 람다식 , 익명 객체

        int val = f.max(1,2); // (x) ->  함수형 인터페이스

        System.out.println("value="+val);

    }
}

// 함수형 인터페이스는 단 하나의 추상 메서드만 가져야 함
@FunctionalInterface
interface MyFunction{
    int max(int a ,int b);
}