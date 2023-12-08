# Java

## 목차

14. [Rambda & Stream](#14-lambda--stream)










## 14. Lambda & Stream

1. 람다식 : 함수를 간단한 식으로 표현하는 방법 (익명 함수)
    ```
    int mmax(int a, int b) return a>b? a:b;
    (a,b) -> a>b ? a: b
    ```
    - 람다식 작성하기
        - 메서드의 이름과 반환타입을 제거하고 '->'를 { } 앞에 추가
        - 반환값이 있는 경우 식이나 값만 적고, return 문 생각 가능 (; 생략)
        - 매개 변수의 타입이 추론 가능하면 생략 가능
    - 주의 사항
        - 매개 변수가 하나인 경우 () 생략 가능
        - 블록 안의 문장이 하나뿐일 때, {} 생략 가능
        - 하나뿐인 문장이 return문인 경우에는 {} 생략 불가 (return을 적을 경우)
    - ex
      ```
      1. int max(int a, int b) return a>b? a:b;
      -> (a,b)-> a>b? a:b
      
      2. int printVar(String name, int i) System.out.println(name+"="+i)
      -> (name, i) -> System.out.println(name+"="+i)
      
      3. int square(int x) return x * x;
      -> x ->  x * x 
      
      4. int roll(){
         return (int) (Math.random()*6) ;
      } 
      -> ()-> (int) Math.random()*6) 
      
      ```
    - 람다식
        - 람다식은 익명 클래스의 익명 객체
        - 람다식을 다루기 위한 참조 변수가 필요
