package leetCode.tt;

/**
 * @author chj
 * @date 2021/9/13 18:34
 */
public class B {

    static void demo(int i) {
        int [] ints = new int[2];

        Integer num1 = new Integer(i) ;
        Integer num2 = new Integer(i) ;
        Integer num3 = i ;
        Integer num4 = Integer.valueOf(i) ;
        Integer num5 = Integer. valueOf(i) ;
        System.out.println(num1.hashCode());
        System.out.println(num2.hashCode());
        System.out.println(num3.hashCode());
        System.out.println(num4.hashCode());
        System.out.println(num5.hashCode());
//        System. out.print(num1 == num2) ;
//        System. out.print("","");System. out.print(num2==num3) ;System. out.print("","") ;System. out.print(num3==num4) ;System. out.print(""，"");
//        System. out.println(num4==num5) ;
    }

    public static void main(String[] args) {
        demo(200);
    }

}

