import java.util.Random;

@SuppressWarnings("ALL")
public class Main {

    public static void main(String[] args) {
        String emailAddress = "john.doe.mis2016@ie.edu";
        String formattedEmailAddress = emailAddress.replaceAll("\\.", "/");

        Random random = new Random();
        //StringBuffer word = null;
        String word = null;

        switch (random.nextInt(3)) {
            case 0:
                word = "Y";
                break;
            case 1:
                word = "F";
                break;
            case 2:
                word = "T";
                break;
        }

        word = word + "o";
        word = word + "u";
        word = word + "r";

        System.out.println(word + " " + formattedEmailAddress);
    }

}

