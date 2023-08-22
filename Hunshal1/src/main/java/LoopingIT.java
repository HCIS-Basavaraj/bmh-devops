import org.testng.annotations.Test;

public class LoopingIT {

    @Test
    public boolean doWhileLoop(int n) {
        System.out.printf("Welcome to Do...While loop\n");
        do {
            System.out.printf("n = " +n + "\n");
            n--;
        } while (n>0);
        return true;
    }

    @Test
    public boolean whileLoop(int n) {
        System.out.printf("Welcome to While loop\n");
        while (n>0) {
            System.out.printf("n = " +n + "\n");
            n--;
        }
        return true;
    }

    @Test
    public boolean forLoop(int n) {
        System.out.printf("Welcome to for loop\n");
        for(int i=n; i>0; i--) {
            System.out.printf("n = " +n + "\n");
            n--;
        } while (n>=1);
        return true;
    }
}
