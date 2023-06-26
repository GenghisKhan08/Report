package newPack;

public class Record {
    private String itemName;
    private boolean isExpense;
    private int quantity;
    private int sumOfOne;

    public Record(String itemName, boolean isExpense, int quantity, int sumOfOne){
        this.isExpense = isExpense;
        this.itemName = itemName;
        this.quantity = quantity;
        this.sumOfOne = sumOfOne;
    }

    public boolean isExpense(){
        return this.isExpense;
    }

    public int getSum(){
        return this.quantity * this.sumOfOne;
    }

    public String getItemName() {
        return itemName;
    }

    @Override public String toString() {
        return "Record{" +
                "itemName='" + itemName + '\'' +
                ", isExpense=" + isExpense +
                ", quantity=" + quantity +
                ", sumOfOne=" + sumOfOne +
                '}';
    }
}
