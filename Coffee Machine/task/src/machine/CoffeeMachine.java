package machine;

import java.util.Scanner;

import static java.lang.Math.min;

public   class CoffeeMachine {
   public static    int   water = 400;
   public  static   int milk = 540;
     public static  int beans = 120;
   public   static int cups = 9;
   public   static int money  = 550;
   public   static int cupsP;



    public static void  state () {
        System.out.printf("The coffee machine has:\n%d of water\n%d of milk\n%d of coffee beans\n%d of disposable " +
                        "cups\n%d of money\n", water, milk, beans, cups, money);
     }
    public static void  action () {
        System.out.println("Write action (buy, fill, take):");
        Scanner input = new Scanner(System.in);
        String action = input.nextLine();
        switch (action) {
            case "buy":


        }


    }
    public static void  buy () {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
        Scanner input = new Scanner(System.in);
        int product = input.nextInt();
        switch (product) {

            case 1:
                water -= 250;
                beans -= 160;
                money += 4;
                cups-=1;
                break;
            case 2:
                water -= 350;
                milk -= 75;
                beans -= 75;
                money += 7;
                cups-=1;
                break;
            case 3:
                water -= 200;
                milk -= 100;
                beans -= 12;
                money += 6;
                cups-=1;
                break;

        }//switch





        }//buy




    /**
     * ask for the user ingredients and number of cups that he want to prepare
     */
    public static void  asking ( ){
        Scanner   input = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        water = input.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has: ");
        milk = input.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        beans = input.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        cups = input.nextInt();
        chk();

        }




    /**
     * check if the ingredients are enough to prepare the N cups
     */
        static void  chk () {
                cupsP= min(min(water / 200 ,milk/50 ),  beans/15);
                if (cupsP == cups) System.out.println("Yes, I can make that amount of coffee");
                else if (cupsP > cups) System.out.println("Yes, I can make that amount of coffee (and even " + (cupsP - cups)   + " more than that)");
                else System.out.println("No, I can make only " +  cupsP +  " cup(s) of coffee");

    }


    /** you tell me how much cups you want and I will tell you the amount of Ing needed
     * @param cups "the number of cups you want to drink"
     */
   public static  void quanta(int cups){
       water = cups * 200;
       milk = cups * 50;
       beans = cups * 15;
       System.out.printf(" For %d cups of coffee you will need:\n" +
               "%d ml of water\n" +
               "%d ml of milk\n" +
               "%d g of coffee beans", cups, water, milk, beans);

   }

    /**ask the user of the number of cups and than call for the "quanta()" method
     * @param message is the message that will ask for the numbers of cups
     */
    public static  void inputMessage (String message){
        System.out.println(message);
        Scanner input = new Scanner(System.in);
        int cups = input.nextInt();
          quanta(cups);
    }





    public static void main(String[] args) {

    buy();
    state();



    }//main
}//class
