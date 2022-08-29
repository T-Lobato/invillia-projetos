package entities;

import exceptions.BusinessException;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withDrawLimit;

    public Account(){
    }

    public Account(Integer number, String holder, Double balance, Double withDrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withDrawLimit = withDrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithDrawLimit() {
        return withDrawLimit;
    }

    public void setWithDrawLimit(Double withDrawLimit) {
        this.withDrawLimit = withDrawLimit;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withDraw(double amount){
        validateWithdraw(amount);
        balance -= amount;
    }

    private void validateWithdraw(double amount){
        if(amount > getWithDrawLimit()){
            throw new BusinessException("Erro de saque: A quantia excede o limite de saque");
        }
        if(amount > getBalance()){
            throw new BusinessException("Erro de saque: Saldo insuficiente");
        }
    }
}
