import java.util.function.Function;

public class Ex14_3 {
    public static void main(String[] args) {
        Function<String, Integer> f = (s) -> Integer.parseInt(s,16);
        Function<Integer,String> g = Integer::toBinaryString;

        Function<String,String> h = f.andThen(g);
        Function<Integer,Integer> h2 = f.compose(g); // g.andThen(f)

        System.out.println(h.apply("FF")); // "FF" -> 255 -> "11111111"
        System.out.println(h2.apply(2)); // 2 -> "10" -> 16
    }
}
