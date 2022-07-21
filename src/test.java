public class test {
    public static void main(String[] args) {
        Mobile mobile = new Mobile( 4, 128, "Apple");

        System.out.println(mobile.toString());

        Mobile cloneObj = mobile.clone();
        System.out.println(cloneObj.toString());

        cloneObj.setRam(8);
        System.out.println(cloneObj);

        System.out.println(mobile.toString());



    }
}
