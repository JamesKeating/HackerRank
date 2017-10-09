import java.util.*;

public class Hash_Ransome_Note {
    Map<String, Integer> magazineMap = new HashMap<>();
    String noteMap;


    public Hash_Ransome_Note(String magazine, String note) {

        noteMap = note;
        for(String word : magazine.split(" ")){
            
            magazineMap.putIfAbsent(word, 0);
            magazineMap.merge(word, 1, (a, b) -> a + b);
        }

    }

    public boolean solve() {
        for(String word : noteMap.split(" ")){
            if (magazineMap.get(word) == null || magazineMap.get(word) == 0)
                return false;
            magazineMap.merge(word, 1, (a, b) -> a - b);
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // Eat whitespace to beginning of next line
        scanner.nextLine();

        Hash_Ransome_Note s = new Hash_Ransome_Note(scanner.nextLine(), scanner.nextLine());
        scanner.close();

        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");

    }
}
