import java.util.HashSet;
import java.util.List;

public class Generator {
    public HashSet hashSetGenerator(){
        HashSet<Integer> numbers = new HashSet<Integer>(List.of(3, 7, 9, 13, 17));
        return numbers;
    }
}
