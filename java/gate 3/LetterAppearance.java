public class LetterAppearance{

    public String getNumberOfAppearances(String text){
    count = 0;
    String output = " ";

   for (int count = 0; count < text.length(); count++) {
            char characters = text.charAt(count);  

       for (int index = count + 1; index < text.length; index++) {

            if (characters >= 'A' && characters <= 'Z') {
                uppercaseCounter++;  
            }
                if (charcters1 == characters2){
    
                    count++;             
        }
            else if (characters >= 'a' && characters <= 'z') {
                lowercaseCounter++;  
            }

            output += count;
            
        



}
        return output;
}




}
   
}


