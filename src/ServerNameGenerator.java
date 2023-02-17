import java.util.Random;

public class ServerNameGenerator {
    static String[] adjectives = {"aback","abaft","abandoned","abashed","aberrant","abhorrent","abiding","abject","ablaze","able"};
    static String[] nouns = {"accelerator", "accordion", "account", "accountant", "acknowledgment", "acoustic", "acrylic", "act", "action", "active"};


    public static String randomAdj(String[] arr){
        Random random = new Random();
        int randomNumber = random.nextInt(arr.length - 1) + 1;
        return arr[randomNumber];
    };

    public static String randomNouns(String[] arr){
        Random random = new Random();
        int randomNumber = random.nextInt(arr.length - 1) + 1;
        return arr[randomNumber];
    };

    public static String addAdjAndNoun(String adj, String noun){
        return adj + "-" + noun;
    }

    public static void main(String[] args) {
//        System.out.println(randomAdj(adjectives));
//        System.out.println(randomNouns(nouns));
        System.out.println("Here is your server name: \n" + addAdjAndNoun(randomAdj(adjectives), randomNouns(nouns)));
    }
}
