package OOP.Lesson6.Homework.Example10;

public record TransactionManagement(String transactionId , double allSum , double amount , String type) {
    public TransactionManagement {
        if(amount > 0) {
            if (type.equals("WITHDRAWAL")) {
                double withdrawal = amount * 0.02;
                allSum -= (amount + withdrawal);
                System.out.println(allSum);
            } else if(type.equals("DEPOSIT")){
                double deposit = amount * 0.01;
                allSum += (amount + deposit);
                System.out.println(allSum);
            }
        }
    }

    @Override
    public String toString() {
        return "TransactionManagement{" +
                "transactionId='" + transactionId + '\'' +
                ", allSum=" + allSum +
                ", amount=" + amount +
                ", type='" + type + '\'' +
                '}';
    }
}
