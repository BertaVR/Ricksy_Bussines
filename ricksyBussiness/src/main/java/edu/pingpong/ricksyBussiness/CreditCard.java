package edu.pingpong.ricksyBussiness;

public class CreditCard {

    private String owner;
    private String number;



    public CreditCard (String name,String number){  //ESTO ES UN CONSTRUCTOR
        this.owner = name;
        this.number = number;


    }
    public String getOwner(){
        return this.owner;
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
    public String toString(){
        return "owner:" + getOwner() + "\n" +  
                "number:" + getNumber() + "\n"; }


}