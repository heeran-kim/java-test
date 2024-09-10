package classes.immutable;

import java.util.ArrayList;
import java.util.List;

public record ImmutablePerson2(String name, int age, List<String> hobbies) {
    // Constructor
    public ImmutablePerson2(String name, int age, List<String> hobbies) {
        this.name = name;
        this.age = age;
        // Create a new list to ensure immutability
        this.hobbies = new ArrayList<>(hobbies);
    }
}
