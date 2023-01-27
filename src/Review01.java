
public class Review01 {

    public static void main(String[] args) {

        int base = 1500; //本体価格
        int rate = 10; //税率(％)
        int result;
        result = tax(base, rate);
        System.out.println(base + "円の商品の税込価格は" + (base+result)+ "円（消費税は" + result +"円）です。");

    }

    public static int tax(int base, int rate) {
        int result =base*rate/100;
        return result;
    }

}
