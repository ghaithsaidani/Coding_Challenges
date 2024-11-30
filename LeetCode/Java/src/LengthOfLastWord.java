public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
         String[] splited=s.split("\\s+");
        return splited[splited.length - 1].length();
    }
}
