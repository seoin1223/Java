@FunctionalInterface
interface MyFunction1 {
    void run();
}


public class Ex14_1{
    static void excute(MyFunction1 f){ // 매개변수 타입이 MyFunction1인 메서드
        f.run();
    }
    static MyFunction1 getMyFunction(){ // 반환 타입이 MyFunction1인 메서드
        return () -> System.out.println("f3.fun()");

    }

    public static void main(String[] args){
        // 람다식으로 MyFunction1의 run() 구현
        MyFunction1 f1 = () -> System.out.println("f1.run()");

        MyFunction1 f2 = new MyFunction1(){ // 익명 클래스로 run 구현
            public void run(){
                System.out.println("f2.run()");
            }
        };

        MyFunction1 f3 = () -> System.out.println("f3.fun()");

        f1.run();
        f2.run();
        f3.run();

        excute(f1);
        excute( () -> System.out.println("run()"));
    }

}
