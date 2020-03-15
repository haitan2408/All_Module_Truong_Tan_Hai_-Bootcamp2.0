package SS18.Threading.tim_so_nguyen_to;

public class TestRunable {
    public static void main(String[] args) {
        LazyPrimeFactorization lazyPrimeFactorization=new LazyPrimeFactorization();
        OptimizedPrimeFactorization optimizedPrimeFactorization=new OptimizedPrimeFactorization();
        optimizedPrimeFactorization.run();
        lazyPrimeFactorization.run();

    }
}
