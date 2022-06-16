package Model;
import org.apache.commons.text.CharacterPredicates;
import org.apache.commons.text.RandomStringGenerator;

public class PasswordGenerator2 {
    public static void main(String[] args) {
        int len = 10;
        int randNumOrigin = '0', randNumBound = 'z';
        System.out.println(generateRandomPassword(len, randNumOrigin, randNumBound));
    }

    public static String generateRandomPassword(int len, int randNumOrigin, int randNumBound)
    {
        RandomStringGenerator generator = new RandomStringGenerator.Builder()
                .withinRange(randNumOrigin, randNumBound)
                .filteredBy(CharacterPredicates.ASCII_ALPHA_NUMERALS)
                .build();

        return generator.generate(len);
    }


}
