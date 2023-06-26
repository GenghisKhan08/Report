package newPack;

import java.util.ArrayList;
import java.util.List;

public class MonthlyReport {
    private List<Record> recordList = new ArrayList<>();
    private String month;

    public MonthlyReport(int month){
        this.month = getMonthName(month);
    }

    public String getMonth() {
        return month;
    }

    public void setRecordList(Record record) {
        recordList.add(record);
    }

    public String getMonthName(int monthNumber) {
        switch(monthNumber) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
        }
        return "Unknown monthNumber";
    }

    public Record getMostProfitableRecord(){
        Record record = null;
        int sum = 0;
        for(Record r : recordList){
            if(r.getSum() > sum && !r.isExpense()){
                sum = r.getSum();
                record = r;
            }
        }
        return record;
    }



    public Record getMostExpensableRecord(){
        Record record = null;
        int sum = 0;
        for(Record r : recordList){
            if(r.getSum() > sum && r.isExpense()){
                sum = r.getSum();
                record = r;
            }
        }
        return record;
    }

    public int getMonthProfit(){
        int total = 0;
        for (Record record : recordList){
            if(!(record.isExpense())){
                total += record.getSum();
            }
        }
        return total;
    }

    public int getMonthExpense(){
        int total = 0;
        for(Record record : recordList){
            if(record.isExpense()){
                total += record.getSum();
            }
        }
        return total;
    }

    @Override
    public String toString() {
        return "MonthlyReport{" +
                "recordList=" + recordList +
                '}';
    }
}
