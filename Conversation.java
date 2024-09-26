import java.util.Scanner; 
import java.util.Random;
class Conversation {

  public static void main(String[] arguments) {
    // You will start the conversation here.
    
    //asking for  user input for number of rounds
    Scanner rounds = new Scanner(System.in);
    System.out.println("how many rounds should we play?");

    // taking in that value
    int roundnum = rounds.nextInt();
    // prompting user, creating a transcript, adding prompt to transcript
    System.out.println("hi there! what's on your mind?"); 
    int m = 0;
    int sentences = ((roundnum*2) +1);
    String[] transcript = new String[sentences];
    transcript[m] = "hi there! what's on your mind?";
    m = m+1;
    
    // running this look as many times as user asked
  for (int i = 0; i <= roundnum; i++) {
    Scanner answer = new Scanner(System.in);
    String answer2  =  answer.nextLine(); // taking in user answer to prompt
    String[] answer2components = answer2.split(" ");// splitting answer into words
    transcript[m] = answer2; // adding answer to transcript
    m = m+1;
    int answer2size = answer2components.length; // figuring out how many words in answer
    for (int j = 0; j < answer2size; j++) { // for each word we are running through all the possible mirror words
      if (answer2components[j].equals("i")) {
        answer2components[j] = "you";
      } else if (answer2components[j].equals("I")) {
        answer2components[j] = "you";
      } else if (answer2components[j].equals("You")) {
        answer2components[j] = "i";
      } else if (answer2components[j].equals("you")) {
        answer2components[j] = "i";
      } else if (answer2components[j].equals("Me")) {
        answer2components[j] = "you";
      } else if (answer2components[j].equals("me")) {
        answer2components[j] = "you";
      } else if (answer2components[j].equals("You")) {
        answer2components[j] = "me";
      } else if (answer2components[j].equals("you")) {
        answer2components[j] = "me";
      } else if (answer2components[j].equals("am")) {
        answer2components[j] = "are";
      } else if (answer2components[j].equals("are")) {
        answer2components[j] = "am";
      } else if (answer2components[j].equals("My")) {
        answer2components[j] = "your";
      } else if (answer2components[j].equals("my")) {
        answer2components[j] = "your";
      } else if (answer2components[j].equals("Your")) {
        answer2components[j] = "my";
      } else if (answer2components[j].equals("your")) {
        answer2components[j] = "my";
      } else {
        int p = 0;
        p = p+1;
          if (p == answer2size-2) { // if none of the words are mirror words
            String[] otherresponses = { // canned responses
            "I love that! Share more!",
            "I understand, what more can you tell me?",
           "It will be okay!",
           "That is awesome!"
          }; 
            Random random = new Random();
            int selectedresponse = random.nextInt(otherresponses.length); // select a canned response randomly
            answer2 = otherresponses[selectedresponse]; // setting that as the new answer
            answer2components = answer2.split(" "); // splitting it up by words (to be able to join below)
        
        }}
       
      if (j == answer2size-1) { // once were at the end of the user setence
        String outputresponseString = String.join(" ", answer2components) + "?"; // putting it back together w new words and a question mark
    if (i < roundnum-1) { // for all but last response, we add to transcript and then print
      transcript[m] = outputresponseString; 
      m = m+1;
      System.out.println(outputresponseString);}
    if (i == roundnum-1) { // set last response to, print transcript
          System.out.println("that's so cool, goodbye!"); 
          System.out.println("Transcript:");
          transcript[m] = "that's so cool, goodbye!";
          int transcriptsize = transcript.length;
          for (int t = 0; t <= transcriptsize; t++) { // printing transcript line by line
            System.out.println(transcript[t]);}
          }
      }
    }}}}

  