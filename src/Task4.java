import java.math.BigInteger;
import java.util.stream.Stream;

public class Task4 {
    public static Stream<Long> generate(long a, long c, long m, long seed) {
        BigInteger multiplier = BigInteger.valueOf(a);
        BigInteger increment = BigInteger.valueOf(c);
        BigInteger modulus = BigInteger.valueOf(m);

        return Stream.iterate(seed, value -> multiplier
                .multiply(BigInteger.valueOf(value))
                .add(increment)
                .mod(modulus)
                .longValue());
    }
}
