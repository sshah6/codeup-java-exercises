package DishInClassEx;


// -- SHORT ASSIGNMENT #2 --
// Create a class of static members (variables and methods) called DishTools
//   - AVERAGE_COST_OF_DISH_IN_CENTS - an integer constant set to 1300
//   - shoutDishName() - that takes in a Dish object and prints out the name in all caps
//   - analyzeDishCost() - that takes in a Dish object and will print out either “More expensive than average” or “Less expensive than average”, depending on the value of the dish costInCents compared to AVERAGE_COST_OF_DISH_IN_CENTS
//   - flipRecommendation() - that takes in a Dish object and reverses the wouldRecommend boolean value
// Try out the DishTools methods with Dish objects in the DishTest main method
// BONUS - add some static methods to the Dish class that compares two dishes in some way

public class DishTools {
    
public final static int AverageCost = 1300;

public static void shoutDishName(Dish dish){
    System.out.printf("Name of Dish: %S\n", dish.getName());
}

public static void analyzeDishCost(Dish dish){
    if(dish.getCost() > AverageCost){
        System.out.printf("Expensive then everage: %s\n",dish.getName());
    }else{
        System.out.printf("Less expensive: %s\n", dish.getName());
    }
}

public static void flipRecommendation(Dish dish){
    if(dish.getRecom() == false){
        System.out.printf("Recommended\n ======== \n");
    }else{
        System.out.printf("Not Recommended\n ======== \n");
        }
    }
}

