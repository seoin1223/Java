public class Ex14_0 {
    public static void main(String[] args){
        // Object obj = (a,b) -> a>b? a:b; // 람다식, 익명 객체
       Object obj = new Object(){
            int max(int a,int b){
                return a>b? a:b;
            }
        };

        // int val = obj.wait(1,2); // (x) ->  함수형 인터페이스

    }
}
