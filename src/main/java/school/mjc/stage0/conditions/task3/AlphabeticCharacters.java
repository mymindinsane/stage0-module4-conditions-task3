package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if (character == 65 || character == 97 || character == 69 || character == 101 || character == 73 || character == 105
        || character == 79 || character == 111 || character == 85 || character == 117){
            System.out.println("Vowel");
        } if (character < 65 || (character > 90 && character < 97) || character > 122) {
            System.out.println("wrong alphabet!");
        } else {
            System.out.println("Consonant");
        }
    }
}
