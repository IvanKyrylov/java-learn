package hw01.gradle;

import com.google.common.math.IntMath;

public class HelloGuava {
    public static void callMethodCheckedMultiplyGuava() {
        int mustNotOverflow = IntMath.checkedMultiply(5, 5);
        System.out.println(mustNotOverflow);
    }
}
