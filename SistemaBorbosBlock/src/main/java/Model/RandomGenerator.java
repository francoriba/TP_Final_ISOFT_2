package Model;
import Interfaces.PasswordGenerator;
import org.apache.commons.text.CharacterPredicates;
import org.apache.commons.text.RandomStringGenerator;

public class RandomGenerator implements PasswordGenerator {

    private int len;
    private int randNumOrigin;
    private int randNumBound;

    public RandomGenerator(int len, int randNumOrigin, int randNumBound) {
        this.len = len;
        this.randNumOrigin = randNumOrigin;
        this.randNumBound = randNumBound;
    }

    @Override
    public String generator() {
        RandomStringGenerator generator = new RandomStringGenerator.Builder()
                .withinRange(randNumOrigin, randNumBound)
                .filteredBy(CharacterPredicates.ASCII_ALPHA_NUMERALS)
                .build();
        return generator.generate(len);
    }
//    public static String generateRandomPassword(int len, int randNumOrigin, int randNumBound)
//    {
//        RandomStringGenerator generator = new RandomStringGenerator.Builder()
//                .withinRange(randNumOrigin, randNumBound)
//                .filteredBy(CharacterPredicates.ASCII_ALPHA_NUMERALS)
//                .build();
//
//        return generator.generate(len);
//    }
}
