package newPack;

public class RecordYear {
    private int month;
    private int amount;
    private boolean isExpense;
    public RecordYear(int month, int amount, boolean isExpense) {
        this.month = month;
        this.amount = amount;
        this.isExpense = isExpense;
    }

    public int getAmount() {
        return this.amount;
    }

    public int getMonth() {
        return this.month;
    }

    public boolean getBoolean(){
        return this.isExpense;
    }




    @Override
    public String toString() {
        return "RecordYear{" +
                "month=" + month +
                ", amount=" + amount +
                ", isExpense=" + isExpense +
                '}';
    }
}
