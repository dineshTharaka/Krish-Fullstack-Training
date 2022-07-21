public class test {
    public static void main(String[] args) {
        User.Builder builder = new User.Builder(1,"123@gmail.com");
        builder.setName("Krishantha Dinesh");
        builder.setMobile(123456789);

        User user = builder.build();

        System.out.println(user);
    }

}
