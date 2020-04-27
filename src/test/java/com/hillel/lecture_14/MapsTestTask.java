package com.hillel.lecture_14;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class MapsTestTask {

    private JsonConverter jsonConverter = new JsonConverter();

    private String jsonUsersList = "\"[{\"id\":1,\"firstName\":\"Bob\",\"lastName\":\"Marley\",\"age\":22,\"gender\":\"male\",\"company\":\"BALOOBA\",\"email\":\"knoxavery@balooba.com\",\"phone\":[\"+38-096-123-26-48\",\"+38-093-812-12-32\"],\"address\":{\"city\":\"Dnipro\",\"street\":\"Gagarina 35\"},\"friends\":[{\"id\":2,\"firstName\":\"Eaton\",\"lastName\":\"Barlow\"},{\"id\":3,\"firstName\":\"Milagros\",\"lastName\":\"Fletcher\"},{\"id\":4,\"firstName\":\"Morris\",\"lastName\":\"Grimes\"}]},{\"id\":5,\"firstName\":\"Steve\",\"lastName\":\"Rogers\",\"age\":99,\"gender\":\"male\",\"company\":\"Avengers\",\"email\":\"steve@avengers.com\",\"phone\":[\"+19-123-136-35-48\",\"+19-916-812-99-00\"],\"address\":{\"city\":\"New-York\",\"street\":\"Brooklyn 75\"},\"friends\":[{\"id\":6,\"firstName\":\"Tony\",\"lastName\":\"Stark\"},{\"id\":7,\"firstName\":\"Natasha\",\"lastName\":\"Romanova\"},{\"id\":8,\"firstName\":\"Thor\",\"lastName\":\"Son of Oddin\"}]}]\"";
    private String jsonUser= "\"{\"id\":5,\"firstName\":\"Steve\",\"lastName\":\"Rogers\",\"age\":99,\"gender\":\"male\",\"company\":\"Avengers\",\"email\":\"steve@avengers.com\",\"phone\":[\"+19-123-136-35-48\",\"+19-916-812-99-00\"],\"address\":{\"city\":\"New-York\",\"street\":\"Brooklyn 75\"},\"friends\":[{\"id\":6,\"firstName\":\"Tony\",\"lastName\":\"Stark\"},{\"id\":7,\"firstName\":\"Natasha\",\"lastName\":\"Romanova\"},{\"id\":8,\"firstName\":\"Thor\",\"lastName\":\"Son of Oddin\"}]}\"";

    @Test
    public void convertUsersListToJsonString() {
        List<User> userList = getUsers();

        assertEquals(jsonConverter.convertToJsonString(userList), jsonUsersList);
    }

    @Test
    public void convertUserToJsonString() {
        User user = buildSteveRogers();

        assertEquals(jsonConverter.convertToJsonString(user), jsonUser);
    }

    private List<User> getUsers() {
        List<User> userList = new ArrayList<>();
        userList.add(buildBobMarley());
        userList.add(buildSteveRogers());

        return userList;
    }

    private User buildBobMarley() {
        User bobMarleyUser = new User();
        bobMarleyUser.setId(1);
        bobMarleyUser.setFirstName("Bob");
        bobMarleyUser.setLastName("Marley");
        bobMarleyUser.setAge(22);
        bobMarleyUser.setGender("male");
        bobMarleyUser.setCompany("BALOOBA");
        bobMarleyUser.setEmail("knoxavery@balooba.com");

        List<String> phones = Arrays.asList("+38-096-123-26-48", "+38-093-812-12-32");
        bobMarleyUser.setPhone(phones);

        Address address = new Address();
        address.setCity("Dnipro");
        address.setStreet("Gagarina 35");

        bobMarleyUser.setAddress(address);

        Friend eatonBarlow = new Friend();
        eatonBarlow.setId(2);
        eatonBarlow.setFirstName("Eaton");
        eatonBarlow.setLastName("Barlow");

        Friend milagrosFletcher = new Friend();
        milagrosFletcher.setId(3);
        milagrosFletcher.setFirstName("Milagros");
        milagrosFletcher.setLastName("Fletcher");

        Friend morrisGrimes = new Friend();
        morrisGrimes.setId(4);
        morrisGrimes.setFirstName("Morris");
        morrisGrimes.setLastName("Grimes");

        bobMarleyUser.setFriends(Arrays.asList(eatonBarlow, milagrosFletcher, morrisGrimes));
        return bobMarleyUser;
    }

    private User buildSteveRogers() {
        User steveRogers = new User();
        steveRogers.setId(5);
        steveRogers.setFirstName("Steve");
        steveRogers.setLastName("Rogers");
        steveRogers.setAge(99);
        steveRogers.setGender("male");
        steveRogers.setCompany("Avengers");
        steveRogers.setEmail("steve@avengers.com");

        List<String> stevePhones = Arrays.asList("+19-123-136-35-48", "+19-916-812-99-00");
        steveRogers.setPhone(stevePhones);

        Address steveAddress = new Address();
        steveAddress.setCity("New-York");
        steveAddress.setStreet("Brooklyn 75");

        steveRogers.setAddress(steveAddress);

        Friend tonyStark = new Friend();
        tonyStark.setId(6);
        tonyStark.setFirstName("Tony");
        tonyStark.setLastName("Stark");

        Friend natashaRomanova = new Friend();
        natashaRomanova.setId(7);
        natashaRomanova.setFirstName("Natasha");
        natashaRomanova.setLastName("Romanova");

        Friend thor = new Friend();
        thor.setId(8);
        thor.setFirstName("Thor");
        thor.setLastName("Son of Oddin");

        steveRogers.setFriends(Arrays.asList(tonyStark, natashaRomanova, thor));

        return steveRogers;
    }


}
