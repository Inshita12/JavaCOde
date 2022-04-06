class Bill{

int itemprice;

public Bill (int itemPrice) { 
	
	this.itemprice = itemPrice;
}
void display() {

int itemprice = 20;
System.out.println(itemprice);
}

}

class Demo {

public static void main(String[] args) {

Bill billobj = new Bill (10);

System.out.println (billobj.itemprice); billobj.display();

}

}