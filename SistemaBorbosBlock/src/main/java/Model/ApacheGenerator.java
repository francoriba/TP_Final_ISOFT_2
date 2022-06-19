package Model;

import Interfaces.PasswordGenerator;

import java.util.Random;

public class ApacheGenerator implements PasswordGenerator {

    private int lenght;

    public ApacheGenerator(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public String generator() {
        StringBuilder stringBuilder = new StringBuilder();
        String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String specialCharacters = "!@#$";
        String numbers = "1234567890";
        String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
        Random random = new Random();
        char[] password = new char[lenght];

            password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
            stringBuilder.append(password[0]);
            password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
            stringBuilder.append(password[1]);
            password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
            stringBuilder.append(password[2]);
            password[3] = numbers.charAt(random.nextInt(numbers.length()));
            stringBuilder.append(password[3]);
        for(int i = 4; i< lenght ; i++) {
            password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
            stringBuilder.append(password[i]);
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        ApacheGenerator apacheGenerator = new ApacheGenerator(6);
        String hola = apacheGenerator.generator();
    }

//    private static char[] generatePassword(int length) {
//        String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
//        String specialCharacters = "!@#$";
//        String numbers = "1234567890";
//        String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
//        Random random = new Random();
//        char[] password = new char[length];
//
//        password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
//        password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
//        password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
//        password[3] = numbers.charAt(random.nextInt(numbers.length()));
//
//        for(int i = 4; i< length ; i++) {
//            password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
//        }
//        return password;
//    }

}