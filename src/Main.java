import javax.swing.plaf.PanelUI;

public class Main {
    public static void main(String[] args) {
        System.out.println("Udemy: Java Programming Masterclass");
        System.out.println("Coding Exercise: Decimal Format");
        System.out.println("");

        System.out.println(hasTeen(9,99,19));
        System.out.println(hasTeen(23,15,42));
        System.out.println(hasTeen(22,23,34));
        System.out.println("");

        System.out.println(isTeen(9));
        System.out.println(isTeen(13));

    }

    public static boolean hasTeen(int num1, int num2, int num3){
        if(num1 >=13 && num1 <= 19){
            return true;
        } else if(num2 >=13 && num2 <= 19){
            return true;
        }  else if(num3 >=13 && num3 <= 19){
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen(int number){
        if (number >= 13 && number <=19){
            return true;
        } else {
            return false;
        }
    }
}