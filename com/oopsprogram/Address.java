package com.oopsprogram;

public class Address {
String City;
String state;
String country;
public Address(String City,String state,String country) {

this.City=City;
this.state=state;
this.country=country;
        }

public void display() {
	System.out.println("[City="+City+",State="+state+",Country="+country+"]");
}

}
