import java.util.Scanner;

public class PizzaShop {


    public static void topping(Pizza p){

        System.out.println("You selected " + p.getDescription() + " as base pizza...");
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int t;
        while(true){

            System.out.print("Please select one or more topping(s) or finish the order: ");
            System.out.println("\n1. Pepperoni \n2. Onion \n3. Bacon \n4. Sausage \n5. Choi \n6. ExtraCheese \n7. BlackOlives \n8. GreenPeppers \n9. Finish Order");
            t = sc.nextInt();
            if(t == 1){
                p = new Pepperoni(p);
                System.out.println("Ordered Item(s): " + p.getDescription() + "     Cost: " + p.cost());
            }

            if(t == 2){
                p = new Onion(p);
                System.out.println("Ordered Item(s): " + p.getDescription() + "     Cost: " + p.cost());
            }

            if(t == 3){
                p = new Bacon(p);
                System.out.println("Ordered Item(s): " + p.getDescription() + "     Cost: " + p.cost());
            }

            if(t == 4){
                p = new Sausage(p);
                System.out.println("Ordered Item(s): " + p.getDescription() + "     Cost: " + p.cost());
            }

            if(t == 5){
                p = new Choi(p);
                System.out.println("Ordered Item(s): " + p.getDescription() + "     Cost: " + p.cost());
            }

            if(t == 6){
                p = new ExtraChese(p);
                System.out.println("Ordered Item(s): " + p.getDescription() + "     Cost: " + p.cost());
            }

            if(t == 7){
                p = new BlackOlives(p);
                System.out.println("Ordered Item(s): " + p.getDescription() + "     Cost: " + p.cost());
            }

            if(t == 8){
                p = new GreenPeppers(p);
                System.out.println("Ordered Item(s): " + p.getDescription() + "     Cost: " + p.cost());
            }

            if(t == 9){
                System.out.println(" Sir, You have successfully finished your order!");
                System.out.println("Your Ordered Item(s): " + p.getDescription() + "     Total Cost: " + p.cost());
                break;
            }
        }
    }

    public static void main(String args[]){
        System.out.print("Please select a Pizza : ");
        System.out.println("\n1. Mozarella \n2. Mushroom \n3. Crudo \n4. Napoli");
        int p;
        Scanner sc = new Scanner(System.in);
        p = sc.nextInt();
        System.out.println();

        switch (p){
            case 1:
                Pizza pizza = new Mozarella();
                topping(pizza);
                break;

            case 2:
                Pizza pizza2 = new Mushroom();
                topping(pizza2);
                break;

            case 3:
                Pizza pizza3 = new Crudo();
                topping(pizza3);
                break;

            case 4:
                Pizza pizza4 = new Napoli();
                topping(pizza4);
                break;

            default:
                System.out.println("Please select the correct option!!");
                break;
        }

    }


}
