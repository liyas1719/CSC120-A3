import java.util.Scanner; 
import java.util.Random;
class Conversation {

  public static void main(String[] arguments) {
    // You will start the conversation here.
    
    Scanner rounds = new Scanner(System.in);
    System.out.println("how many rounds should we play?");

    int roundnum = rounds.nextInt();

    System.out.println("hi there! what's on your mind?"); 
    int m = 0;
    String[] transcript = new String[(roundnum*2)+1];
    transcript[m] = "hi there! what's on your mind?";
    m = m+1;
    
  for (int i = 0; i <= roundnum; i++) {
    Scanner answer = new Scanner(System.in);
    String answer2  =  answer.nextLine(); 
    String[] answer2components = answer2.split(" ");
    //String[] transcript = new String[roundnum*2 -1 ];
    transcript[m] = answer2;
    System.out.println(m + transcript[m]);
    m = m+1;
    int answer2size = answer2components.length;
    for (int j = 0; j < answer2size; j++) {
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
      } else if (answer2components[j].equals("am")) {
        answer2components[j] = "are";
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
          if (p == answer2size-2) {
            String[] otherresponses = {
            "I love that! Share more!",
            "I understand, what more can you tell me?",
           "It will be okay!",
           "That is awesome!"
          }; 
            Random random = new Random();
            int selectedresponse = random.nextInt(otherresponses.length);
            answer2 = otherresponses[selectedresponse];
            answer2components = answer2.split(" ");
        
        }}
       
      if (j == answer2size-1) {
        String outputresponseString = String.join(" ", answer2components) + "?"; 
    System.out.println("t" + transcript[0]);
    System.out.println("t" + transcript[1]);
    System.out.println("t" + transcript[2]);
    System.out.println("t" + transcript[3]);
    System.out.println("t" + transcript[4]);
    System.out.println("t" + transcript[5]);
    if (i < roundnum-1) {
      transcript[m] = outputresponseString;
      System.out.println(m + transcript[m]);
      m = m+1;
      System.out.println(outputresponseString);}
    if (i == roundnum - 1) {
          System.out.println("that's so cool, goodbye!"); 
          System.out.println("Transcript:");
          transcript[m+1] = "that's so cool, goodbye!";
          int transcriptsize = transcript.length;
          for (int t = 0; t <= transcriptsize; t++) {
            System.out.println(t + transcript[t]);}
          }
          //String finaltranscript = String.join("        ", transcript);
          //System.out.println(finaltranscript);}
      }
    // else if (i == roundnum) {
    //   System.out.print("Transcript:");
    //   String finaltranscript = String.join("        ", transcript);
    //   System.out.println(finaltranscript);}}
  // IF VARIABLE EQUALS NUM ROUJNDS THENNNNNNN OD OTHIS
  //     System.out.println("that's so cool! goodbye!");
  //     System.out.println();
  //     System.out.println("transcript:");
  //     //String finaltranscript = String.join(" ", transcript);
  //     System.out.println(finaltranscript);
    }}}}

  