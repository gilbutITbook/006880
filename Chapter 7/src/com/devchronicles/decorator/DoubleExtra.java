package com.devchronicles.decorator;
public class DoubleExtra extends Extra {
public DoubleExtra(String label, double price, Order order) {
super(label, price, order);
}
public double getPrice() {
return (this.price*2)+order.getPrice();
}
public String getLabel() {
return order.getLabel()+ ", 더블 " + this.label;
}
}


/*
Order fourSeasonsPizza = new Pizza("포시즌 피자", 10);
fourSeasonsPizza = new RegularExtra("페퍼로니", 4, fourSeasonsPizza );
fourSeasonsPizza = new DoubleExtra("모짜렐라", 2, fourSeasonsPizza );
fourSeasonsPizza = new NoCostExtra("칠리", 2, fourSeasonsPizza );
System.out.println(fourSeasonsPizza.getPrice());
System.out.println(fourSeasonsPizza.getLabel());
*/