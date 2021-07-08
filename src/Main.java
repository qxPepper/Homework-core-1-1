public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b);

        calc.println.accept(c);

        /*
        1.
        В первоначальном варианте calc.devide.apply(a, b) не учитывает деление
        на 0, поэтому ошибка. В классе Calculator приведён исправленный вариант.

        2.
        В примере не использовался isPositive. Но при этом, calc.println.accept(d)
        на вход принимает только Integer, поэтому в
            int x = calc.plus.apply(3, 8);
            boolean y = calc.isPositive.test(x);
            calc.println.accept(y);
            ошибка!
        В классе Calculator приведён исправленный вариант.
        */

        calc.println.accept("Пробуем println, и чего не было в примере:");

        boolean y = calc.isPositive.test(14);
        calc.println.accept(y);

        String s = "Hello!";
        calc.println.accept(s);

        double d = 5.8;
        calc.println.accept(d);

        int i = calc.abs.apply(-4);
        calc.println.accept(i);

        int j = calc.pow.apply(7);
        calc.println.accept(j);
    }
}
