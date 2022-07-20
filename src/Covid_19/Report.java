package Covid_19;

public class Report {
    private  static volatile Report test;

    private Report(){
    }

    public static Report labTesting(){

        if(test == null){
            synchronized(Report.class){
                if(test == null){
                    test = new Report();
                }
            }
        }
        return test;
    }
}
