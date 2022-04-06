package code;
class currencyconverter {
    double USD = 0, INR, Euro, SGD, UAE;

    currencyconverter(int usd) {
        USD = usd;
        change();
    }

    void change() {
        INR = USD * 74.49;
        Euro = USD * 0.89;
        SGD = USD * 1.36;
        UAE = USD * 3.67;
    }

    void update(int usd) {
        USD = usd;
        change();
        System.out.println("Updated");
    }

    void display() {
        System.out.println("INR " + INR + "\n" + "Euro " + Euro + "\n" + "SGD " + SGD + "\n" + "UAE " + UAE);
    }
}

class MoneyTransferService {
    public static void main(String[] args) {
        currencyconverter c = new currencyconverter(20);
        c.display();
        c.update(30);
        c.display();
    }
}