public class Decode {
    public void decodeViaNumber(String password) {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()-_=+,<.>/?;:[]{}".toCharArray();

        // Split the password into characters and print each character’s index in `alphabet`
        for (int i = 0; i < password.length(); i++) {
            char currentChar = password.charAt(i); //accesses specific character in password

            // Find the index of currentChar in the alphabet array
            int indexInAlphabet = -1;
            for (int check = 0; check < alphabet.length; check++) {
                if (alphabet[check] == currentChar) {
                    indexInAlphabet = check;
                    break;
                }
            }

            if (indexInAlphabet != -1) {
                System.out.println(currentChar + " - Index: " + indexInAlphabet);
            } 
            else{
                System.out.println(currentChar + "is not in the alphabet array.");
            }
        }
    }
}
