package com.demo.Java8Study.features;

import com.demo.Java8Study.dto.User;
import com.demo.Java8Study.utils.Mapper;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams  {

    public static void main(String... args) {
        // define a list
        List<User> users = new ArrayList<>();
        // add elements
        users.add(new User().setAge(10).setName("mohamed"));
        users.add(new User().setAge(11).setName("ali"));
        users.add(new User().setAge(12).setName("ahmed"));
        // loop through it the AFTER 8
        System.out.println("************Double colon operator***********");
        users.forEach(System.out::println);

        System.out.println("************Setting fields by foreach***********");
        users.forEach(it-> it.setAge(1));
        users.forEach(System.out::println);

        System.out.println("************Copying by getting the stream***********");
        List<User> usersList1 = users.stream().collect(Collectors.toList());
        usersList1.forEach(System.out::println);

        System.out.println("************Filtering by getting the stream***********");
        List<User> usersList2 = usersList1.stream().filter(it -> it.getAge() > 10).collect(Collectors.toList());
        usersList2.forEach(System.out::println);

        System.out.println("************Sorting by getting the stream***********");
        List<User> usersList3 = usersList1.stream().sorted(Comparator.comparing(User::getAge)).collect(Collectors.toList());
        usersList3.forEach(System.out::println);

        System.out.println("************Mapping by getting the stream***********");
        List<User> usersList4 = usersList1.stream().map(it -> new Mapper().doubleTheAge(it)).collect(Collectors.toList());
        usersList4.forEach(System.out::println);

        System.out.println("************Supported utils operations findFirst()***********");
        Optional<User> firstElement = usersList4.stream().findFirst() ;
        System.out.println(firstElement.get());

        System.out.println("************Supported utils operations createStream***********");
        // an example creating a stream and converting it to a list
        Stream<User> usersStream = Stream.of(new User().setAge(17).setName("hoda") , new User().setAge(10).setName("hany"));
        List<User> usersList5 = usersStream.collect(Collectors.toList());
        usersList5.forEach(System.out::println);




    }
}
