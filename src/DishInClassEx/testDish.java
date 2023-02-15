package DishInClassEx;
public class testDish {
    public static void main(String[] args){
        //(first objest here)
                Dish dish = new Dish();
                dish.costInCents = 25;
                dish.nameOfDish = "Steak";
                dish.wouldRecommend = true;
                dish.printSummary();
        
        //(Second objest here)
                Dish dish1 = new Dish();
                dish1.costInCents = 7 * 10;
                dish1.nameOfDish = "The big bean";
                dish1.wouldRecommend = false;
                dish1.printSummary();

        //DishTools here
                DishTools.shoutDishName(dish);
                DishTools.analyzeDishCost(dish);
                DishTools.flipRecommendation(dish);

                DishTools.shoutDishName(dish1);
                DishTools.analyzeDishCost(dish1);
                DishTools.flipRecommendation(dish1);
        }       
}
