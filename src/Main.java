import org.w3c.dom.ls.LSOutput;

public class Main {

    void main(){


        System.out.println("opgave 1 Shopping cart:");
        double price1 = 25.50;
        double price2 = 15.00;
        double price3 = 30.00;
        double totalPrice = price1 + price2 + price3;
        double moms = 0.25;
        double priceMoms = totalPrice+totalPrice*moms;
        //double priceMoms = totalPrice *(1+moms);
        System.out.println("the total price with moms is: " + priceMoms);
        System.out.println();

        System.out.println("opgave 2 Split restaurant bill:");
        double food = 450.0;
        double drinks = 120.0;
        double tips = 50.0;
        int persons = 4;
        double account = food + drinks + tips;
        double accountEach = account/persons;
        System.out.println(accountEach);
        System.out.println();

        System.out.println("Opgave 3 Discount calculation");
        double originalPrice = 300.0;
         double sale20 = (300.0 * 20)/100;
         double priceSale20 = originalPrice - sale20;
         double momss = 0.25;
         double totalSalePrice =priceSale20+priceSale20*momss;
        System.out.println(originalPrice);
        System.out.println(priceSale20);
        System.out.println(totalSalePrice);
        System.out.println();

        System.out.println("Opgave 4: Party planning");
        int quest = 15;
        int cupcakes = 40;
        int cakeEch = cupcakes/quest;
        int cakesLeft = cupcakes%quest;
        System.out.println(cakeEch);
        System.out.println(cupcakes%quest);
        System.out.println();

        System.out.println("Opgave 5: Build greeting message");
        String greeting = "Hello ";
        String name = "Anna! ";
        int  age = 25;
        String  greetingMessage = greeting + name  + "You are " + age + " years old";
        System.out.println(greetingMessage);
        System.out.println();

        System.out.println("Opgave 6: Using +=");
        int scores = 100;
        System.out.println(scores);
        scores +=  50;
        System.out.println(scores);
        scores +=25;
        System.out.println(scores);
        System.out.println();

        System.out.println("pgave 7: Using -=");
        int healthy = 100;
        healthy -= 15;
        System.out.println(healthy);
        healthy -= 20;
        System.out.println(healthy);
        System.out.println();

        System.out.println("Opgave 8: Using *=");
        double pricee = 50.0;
        System.out.println(pricee);
        pricee *= 2;
        System.out.println(pricee);
        System.out.println();

        System.out.println("Opgave 9: Increment og decrement med 1");
        int count = 10;
        System.out.println(count);
        count ++; //count = count +1
        System.out.println(count);
        count --;
        System.out.println(count);
        System.out.println();

        System.out.println("Opgave 10: All compound operators");
        int number = 10;
        number +=5;
        System.out.println(number);
        number -=3;
        System.out.println(number);
        number ++;
        System.out.println(number);
        number --;
        System.out.println(number);
        System.out.println();

        System.out.println("Opgave 11: E-commerce product");
        String product = "laptop";
        double price = 7999.99;
        boolean isRest = true;
        int left = 15;
        double discountPercent = 10.0;
        String category = "Electronics";
        System.out.println();

        System.out.println("Opgave 12: Karaktersystem");
        String namaOfStudent = "Anna";
        int studentTestScore = 85;
        int studentWorkScore = 92;
        double studentFinalScore = 88.5;
        boolean isCourseComplited = true;
        System.out.println();

        System.out.println("Opgave 13: Bookingsystem");
        String visitorName = "Peter Hansen";
        int roomNumber = 204;
        int NightsStay = 3;
        double OneNightPrice = 899.00;
        boolean isBreakfast = true;
        double VisitorTotalPrice = 2697.00;
        System.out.println();

        System.out.println("Opgave 14: Fitness-tracker");
        int myStepsToday = 8547;
        int myGoalSteps = 10000;
        double DistanceKm = 6.2;
        int burnedKcal = 420;
        boolean isGoalReached = true;
        System.out.println();

        System.out.println("Opgave 15: Bibliotekssystem");




















    }
}
