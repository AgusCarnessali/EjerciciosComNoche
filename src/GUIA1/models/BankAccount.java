package GUIA1.models;

public class BankAccount {
    private Long id;
    private String name;
    private Double balance;

    public BankAccount(Long id, String name, Double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
    public Double credit(Double amount) {
        this.balance += amount;
        return this.balance;
    }
    public Double debit(Double amount) {
        if(this.balance < amount){
            System.out.println("Saldo insuficiente");
        }
        else {
            this.balance -= amount;
        }
        return this.balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
