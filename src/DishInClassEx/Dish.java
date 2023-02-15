package DishInClassEx;


//     -- OOP SHORT ASSIGNMENT #1 --
// Create a class called Dish. This class will represent various restaurant dishes.
// Include an integer property called “costInCents”
// Include a string property called “nameOfDish”
// Include a boolean property called “wouldRecommend”
// Include a method called “printSummary” with a void return type
//     this method will use a single printf method to print out the values of each of the instance properties in the following format:
//       Cost: COST_IN_CENTS_HERE
//       Name: NAME_OF_DISH_HERE
//       Recommended: BOOLEAN_VALUE_OF_WOULD_RECOMMEND_HERE
// Create another class called DishTest
// Add a main method and inside the method...
//     1) instantiate a Dish object and assign to a variable called dish1
//     2) assign creative values for each of the properties
//     3) test the printSummary() method by invoking it and checking if all instance values are correctly printed


public class Dish {
    public int  costInCents;
    public String nameOfDish;
    public boolean wouldRecommend;
    private String Recom;
    public void printSummary(){
        //Answering according to boolean
        if (wouldRecommend == false){
            Recom = "Not recommended";
        }else {
            Recom = "Recommended";
        }
        System.out.printf("Price: %d cents\nname: %s\nRecom: %s\n==========\n", costInCents, nameOfDish, Recom);
    }
}

