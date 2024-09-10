package classes.immutable;

import java.util.ArrayList;
import java.util.List;

// The class is final
public final class ImmutablePerson {
    // All attributes are private and final
    private final String name;
    private final int age;
    private final List<String> hobbies;

    // Constructor to initialise all fields
    public ImmutablePerson(String name, int age, List<String> hobbies) {
        this.name = name;
        this.age = age;
        // Create a new list to ensure immutability
        this.hobbies = new ArrayList<>(hobbies);
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Return a copy of the mutable field
    public List<String> getHobbies() {
        return new ArrayList<>(hobbies);
    }

    // No setters

    @Override
    public String toString() {
        return "ImmutablePerson{name='" + name + "', age=" + age + ", hobbies=" + hobbies + "}";
    }
}
