public class GenerateDoc {
    public static boolean generateDocument(String characters, String document) {
        if(document.equals(""))
            return true;
        int charlength=characters.length();
        for (int i = 0; i < document.length(); i++) {
            int j;
            System.out.println(characters);
            for (j = 0; j < characters.length(); j++) {
                if(characters.charAt(j)==document.charAt(i)){
                    characters=characters.substring(0,j)+characters.substring(j+1);
                    break;
                }
            }
            if(j==characters.length()+1)
                break;
        }
        return characters.length()==charlength-document.length();
    }
    public static void main(String[] args) {
        String charcters="Bste!hetsi ogEAxpelrt x ";
        String document="AlgoExpert is the Best!";
        System.out.println(generateDocument(charcters,document));
    }
}
