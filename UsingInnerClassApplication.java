package VasilevJavaBuch.Glava_8_Klass_i_Object;
import static javax.swing.JOptionPane.*;

class BankAccount{
    double rate;
    Person fellow;
    BankAccount(String name, double money, int time, double r){
        rate = r;
        fellow = new Person(name, money, time);
    }
    void show(){
        showMessageDialog(null, fellow, "Deposit", INFORMATION_MESSAGE);
    }
    class Person{
        String name;
        double money;
        int time;
        double getMoney(){
            double s = money;
            for(int i = 1; i <= time; i++){
                s *= (1 + rate / 100);
            }
            s = Math.round(s * 100) / 100.0;
            return s;
        }
        public String toString(){
            String txt = "Name: " + name + "\n";
            txt += "Anfangsbetrag: " + money + "\n";
            txt += "Zinssatz: " + rate + "\n";
            txt += "Zeit(Jahre): " + time + "\n";
            txt += "Endsumme: " + getMoney();
            return txt;
        }
        Person(String txt, double m, int t){
            name = txt;
            money = m;
            time = t;
        }
    }
}

public class UsingInnerClassApplication {
    public static void main(String[] args) {
        BankAccount ivanov = new BankAccount("Ivan Ivanov", 1000.0, 5, 8.0);
        ivanov.show();
    }
}
