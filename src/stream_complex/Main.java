package stream_complex;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        //Creating Students and Address

        Address  addr1 = new Address(700136,"Kolkata");
        Address  addr2 = new Address(600135,"Delhi");
        Address  addr3 = new Address(509823,"Hyderabad");
        Address  addr4 = new Address(200034,"Bangalore");
        Address  addr5 = new Address(456723,"Jammu");


        Student s1 = new Student();
        s1.setId(1);
        s1.setName("Rajkumar");
        s1.setAddress(addr1);


        Student s2 = new Student();
        s2.setId(3);
        s2.setName("Sharmila");
        s2.setAddress(addr2);

        Student s3 = new Student();
        s3.setId(3);
        s3.setName("Premkumar");
        s3.setAddress(addr3);

        Student s4 = new Student();
        s4.setId(4);
        s4.setName("Shibkumar");
        s4.setAddress(addr4);

        List<Student> students = List.of(s1,s2,s3,s4);
        System.out.println(students);

        Map<Integer, Double> collect = students.stream().collect(Collectors.groupingBy(Student::getId, Collectors.averagingInt(Student::getId)));
        System.out.println(collect);


        List<Integer> integers= new ArrayList<>();
        for(int i=1; i<=10; i++){
            integers.add(i);
        }
        Integer reduce = integers.stream().reduce(1, (i, j) -> i * j );
        System.out.println(reduce);

        Integer i = integers.stream().sorted(Comparator.reverseOrder()).limit(3).min(Comparator.naturalOrder()).get();
        System.out.println(i);

        String input= "Shibsankar is a good lad ";
        Set<Character> charSet= new HashSet<>();
        List<Character> list = input.chars().mapToObj(c -> Character.toLowerCase ((char) c)).filter(c -> !charSet.add(c)).toList();
        System.out.println(list);

        input.chars()
                .mapToObj(c-> Character.toLowerCase((char)c))
                .collect(Collectors.groupingBy(ch->ch, Collectors.counting()))
                .entrySet().stream()
                .filter(e-> e.getValue()>1 )
                .filter(e-> !(e.getKey() == ' '))
                .forEach(System.out::print);
    }
}
