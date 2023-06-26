package newPack;

import java.util.List;

public class MonthList {
    List<MonthlyReport> monthlyReports;

    public MonthList(List<MonthlyReport> monthlyReports) {
        this.monthlyReports = monthlyReports;
    }




    @Override
    public String toString() {
        return "MonthList{" +
                "monthlyReports=" + monthlyReports +
                '}';
    }
}
