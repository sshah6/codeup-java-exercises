package DishInClassEx;
public class testDish {
    public static void main(String[] args){
        //(first objest here)
                Dish dish = new Dish(25,"Steak",true );
                dish.printSummary();
        
        //(Second objest here)
                Dish dish1 = new Dish(7 * 10, "The big bean", false);
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
