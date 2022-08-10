package arrays;

public class ServerNameGenerator {
    //create two strings
   static String[] adjetives = {"average", "alive", "blue", "condemned", "dark", "cloudy", "busy", "clever", "cute", "clever"};

   static String[] nouns = {"horse", "lamp", "discotech", "helmet", "night", "plastic", "planet", "oil", "dog", "pluto"};
   //method that takes in arrays of strings
    public static String getRandomElement(String[] adj,String[] noun){
        //picks out random string from arrays
        int randomAdjIndex = (int)(Math.random() * adj.length);
        String randomAdjetive = adj[randomAdjIndex];
//        System.out.println(randomAdjIndex);
        int randomNounIndex = (int)(Math.random() * noun.length);
        String randomNoun = noun[randomNounIndex];
//        System.out.println(randomNounIndex);
        //save RandomElement from both arrays into one variable
        String newElement = randomAdjetive+"-"+randomNoun;
        //returns combined RandomElement string
//        System.out.println(newElement);
        return newElement;
    }

    public static void main(String[] args) {
        System.out.println(getRandomElement(adjetives, nouns));
    }

}
