package interface_segregation_principle;

public class ReportGenerator {

    private Reporting transactionObject;

    public void generateReport(){
        System.out.println(transactionObject.getName());
        System.out.println(transactionObject.getDate());
        System.out.println(transactionObject.productBreakdown());
    }
}
