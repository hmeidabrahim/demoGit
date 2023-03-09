import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        String str = "azertyuiopmlkjhgfdsqa";
        final var chars = str.toCharArray();
        List<Character> characterList = new ArrayList<>();

        for (int i = 0; i < chars.length; i++) {
            characterList.add(chars[i]);
        }

        //characterList.forEach(System.out::println);
        Set<Character> characterSet = new HashSet<>();
        List<Character> doublones = characterList.stream().filter(e-> !characterSet.add(e)).collect(Collectors.toList());

        doublones.forEach(System.out::println);

    }

}

