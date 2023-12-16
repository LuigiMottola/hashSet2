import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Generator generator1 = new Generator();

        Set<Integer> numbersHashSet = generator1.hashSetGenerator();

        int newAddingNumber = 47;

        numbersHashSet.add(newAddingNumber);

        if (numbersHashSet.contains(newAddingNumber)){
            System.out.println(newAddingNumber + " is added correctly");
        } else {
            System.out.println("Operation failed");
        }
    }
}
