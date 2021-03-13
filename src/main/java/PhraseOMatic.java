public class PhraseOMatic { //be like those slick guys in marketing

    public static void main(String[] arg) {

        String[] wordListOne = {"cool,", "great,", "big,", "fabulous,", "amazing,", "energetic,", "explosive,"};

        String[] wordListTwo = {"hard-to-come-by", "fast paced", "new", "humongous", "expensive", "rare", "large", "tear-enducing"};

        String[] wordListThree = {"house", "wife", "car", "adventure", "grandma"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        String indefinitivearticle;

        if ("aeiou".indexOf(wordListOne[rand1].charAt(0)) >= 0){
            indefinitivearticle = " an ";
          } else {
            indefinitivearticle = " a ";
             }

            System.out.println("What we need is" + indefinitivearticle + phrase + "!");
    }
}
