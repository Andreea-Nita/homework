package homework10;

public enum Gender {
    M,F;

    public static Gender lookup(Gender gender) {
        for (Gender g : Gender.values()) {
            if (g.name().toString().equalsIgnoreCase(gender.toString())) {
                return g;
            }
        }
        return null;
    }
}
