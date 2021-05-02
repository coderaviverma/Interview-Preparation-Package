package language.java.corebasic.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringStream {


    public static void main(String[] args) {

        String str="I am very buzzy right now!";

//        List<String> ls=Stream.of(str.split("[\\s\\W]"))
//                .map (elem -> new String(elem))
//                .collect(Collectors.toList());

        List<Character> ls=str.chars()
                .mapToObj(item -> (char) item)
                .collect(Collectors.toList());


        ls.forEach(System.out::println);

    }
}
