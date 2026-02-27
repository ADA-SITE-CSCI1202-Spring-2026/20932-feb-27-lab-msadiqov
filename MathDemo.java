public class MathDemo {

    int min(int a, int b) {
        if (a < b)
            return a;
        else
            return b;
    }

    int max(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    int sum(int[] args) {
        int total = 0;
        for (int i = 0; i < args.length; i++) {
            total = total + args[i];
        }
        return total;
    }

    float mean(int[] args) {
        int total = sum(args);
        return (float) total / args.length;
    }

    int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {

        MathDemo m = new MathDemo();

        int[] numbers = {2, 4, 6, 8};

        System.out.println(m.min(5, 3));
        System.out.println(m.max(5, 3));
        System.out.println(m.sum(numbers));
        System.out.println(m.mean(numbers));
        System.out.println(m.factorial(5));
    }
}