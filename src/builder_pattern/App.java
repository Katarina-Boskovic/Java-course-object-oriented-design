package builder_pattern;

public interface App {
    public static void main(String[] args) {
        User websiteUser = new User.Builder("bob", "bob@email.con").firstName("Bob").lastName("M").build();

        System.out.println(websiteUser);
    }
}
