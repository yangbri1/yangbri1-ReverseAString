
public class StringReverse {
    /**
     * Task: return the reverse of a string.
     * There are multiple good ways to solve this problem.
     *
     * You could do some math to grab characters from the end of the String using a typical for loop.
     * For instance, you could use build a String by writing a for loop that decrements rather than increments, grabbing
     * characters from the String starting from the end.
     * You could also look into the methods provided by StringBuilder.
     *
     * @param str a String.
     * @return the reverse of str.
     */
    public String reverse(String str){
        // // initialize reverseStr to empty String for appending char later
        // String reverseStr = "";
        // // loop via String 'str' in descending fashion
        // for(int i = str.length() - 1; i >= 0; --i){
        //     // append each char to empty String 
        //     reverseStr += str.charAt(i);
        // }
        // // return reverse String
        // return reverseStr;

        /* StringBuilder .reverse() method ... */
        /* https://stackoverflow.com/questions/7569335/reverse-a-string-in-java */
        // create an instance of StringBuffer()
        StringBuilder buffy = new StringBuilder();
         
        // String revStr = buffy.reverse().toString();  // .toString() --- convers to String but will throw NullPointerException if instance DNE
        String revStr = String.valueOf(buffy.reverse());          // String.valueOf() --- converts to String format or returns "null" if instance DNE
        
        // yield reverse String
        return revStr;

    }
}
