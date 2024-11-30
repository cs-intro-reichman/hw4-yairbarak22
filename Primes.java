public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] isprime = new boolean[n + 1];
        isprime[0] = false;
        if (n >= 1) isprime[1] = false;
        for (int i = 2; i <= n; i++) {
            isprime[i] = true;
        }
        for (int m = 2; m * m <= n; m++) {
            if (isprime[m]) {
                for (int tempm = m * m; tempm <= n; tempm += m) {
                    isprime[tempm] = false;
                }
            }
        }
        System.out.println("Prime numbers up to " + n + ":");
        int num = 0;
        for (int i = 0; i <= n; i++) {
            if (isprime[i]) {
                System.out.println(i);
                num++;
            }
        }
        System.out.println("There are " + num + " primes between 0 and " + n + " (" + ((double) num / n * 100) + "% are primes)");
    }
    
}