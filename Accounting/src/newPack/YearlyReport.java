package newPack;

import java.util.List;

public class YearlyReport {
    List<RecordYear> recordYearsList;

    public YearlyReport(List<RecordYear> recordYearsList) {
        this.recordYearsList = recordYearsList;
    }

    public int getMonthProfit(int month){
        for (RecordYear ry : recordYearsList) {
            if (!ry.getBoolean() && ry.getMonth() == month) {
                return ry.getAmount();
            }
        }
        return 0;
    }

    public int getMonthExpense(int month){
        for (RecordYear ry : recordYearsList) {
            if (ry.getBoolean() && ry.getMonth() == month) {
                return ry.getAmount();
            }
        }
        return 0;
    }

    public int getYearProfit(int month){
        int profit = 0;
        int expense = 0;
        for(RecordYear recordYear : recordYearsList){
            if(month == recordYear.getMonth() && !recordYear.getBoolean()) {
                profit = recordYear.getAmount();
            } else if (month == recordYear.getMonth() && recordYear.getBoolean()) {
                expense = recordYear.getAmount();
            }
        }
        return profit - expense;
    }

    public int getMedProfit(){
        int sum = 0;
        int count = 0;
        for(RecordYear ry : recordYearsList){
            if(!ry.getBoolean()){
                sum = ry.getAmount() + sum;
                count++;
            }
        }
        return sum/count;
    }

    public int getMedExpense(){
        int sum = 0;
        int count = 0;
        for(RecordYear ry : recordYearsList){
            if(ry.getBoolean()){
                sum = ry.getAmount() + sum;
                count++;
            }
        }
        return sum/count;
    }

    @Override
    public String toString() {
        return "YearlyReport{" +
                "recordYearsList=" + recordYearsList +
                '}';
    }
}
