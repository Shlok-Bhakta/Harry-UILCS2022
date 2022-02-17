import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("Harry.dat"));
        int loop = scanner.nextInt();
        for (int i = 0; i < loop; i++) {
            String e = scanner.next();
            String d = scanner.next();
            ArrayList<Character> encoded = new ArrayList<Character>();
            ArrayList<Character> decoded = new ArrayList<Character>();

            for (int zzz = 0; zzz < e.length(); zzz++) {
                encoded.add(e.charAt(zzz));
            }
            for (int zzzz = 0; zzzz < d.length(); zzzz++) {
                decoded.add(d.charAt(zzzz));
            }

            for (int j = 0; j < encoded.size(); j++) {
                for (int k = 0; k < decoded.size(); k++) {
                    encoded.remove(decoded.get(k));

                }

            }
            if (encoded.size() != 0) {
                for (int yyy = 0; yyy < encoded.size(); yyy++) {
                    System.out.print(encoded.get(yyy));
                    if (yyy == encoded.size() - 1) {
                        System.out.println();
                    }
                }
            } else {
                System.out.println("ALL LETTERS ARE GONE");
            }

        }

    }
}
