package Covid_19;

public class CovidTest {
    public static void main(String[] args) {
        Long start_test;
        Long end_test;
        String results = null;

        start_test = System.currentTimeMillis();
        Report withoutMask = Report.labTesting();
        end_test = System.currentTimeMillis();

        if((end_test - start_test) == 1){
            results = "Positive";
        }else{
            results = "Negetive";
        }

        System.out.println(withoutMask);
        System.out.println("Covid test = "+ results);



        start_test = System.currentTimeMillis();
        Report withtMask = Report.labTesting();
        end_test = System.currentTimeMillis();

        if((end_test - start_test) == 1){
            results = "Positive";
        }else{
            results = "Negetive";
        }

        System.out.println(withtMask);
        System.out.println("Covid test = "+ results);



    }
}
