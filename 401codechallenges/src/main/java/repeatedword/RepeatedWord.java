package repeatedword;

public class RepeatedWord {

     public String repeatedWord(String str){
       String dupWord = "";
         str = str.toLowerCase();

         String[] words = str.split(" ");

        for(int i = 0; i < words.length; i++){
            for(int j = i + 1; j < words.length; j++){
                if(words[i].equals(words[j])){
                    dupWord = words[j];
                    return dupWord;
                }
            }
        }
        return dupWord;
     }

}
