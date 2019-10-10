package interface_segregation_principle;

import java.util.Date;

public interface Reporting {

    // methods for reporting
    String getName();

    Date getDate();

    String productBreakdown();
}
