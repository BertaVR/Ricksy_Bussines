package edu.pingpong.ricksyBussiness;

public class CreditCard {

    private String owner;
    private String number;
    private Double credit= 0d;
    private final String SYMBOL = "EZI";





    public CreditCard (String name,String number){  //ESTO ES UN CONSTRUCTOR
        this.owner = name;
        this.number = number;
        this.credit = 3000.0d;



    }
    public String getOwner(){
        return this.owner;
    }

    public String getCredit(){
        return this.credit.toString();
    }

    public String getNumber(){
        return this.number;
    }



    public void addOwner (){

        System.out.println("\n" + "Tarjeta de "+ getOwner() +"\n" + 
                                  "===================="+ "\n"+
                                  "owner: "+ getOwner() + "\n"+
                                  "number: "+ getNumber() + "\n"
                                  );

    }

    @Override
    public String toString() {
        return "owner: " + getOwner() + '\n' + 
                "number: " + getNumber() + '\n' +
                "credit: " + getCredit() + SYMBOL;
     }


}