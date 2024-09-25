import java.util.Scanner; 
class Conversation {

  public static void main(String[] arguments) {
    // You will start the conversation here.
    
    Scanner rounds = new Scanner(System.in);
    System.out.println("how many rounds should we play?");

    int roundnum = rounds.nextInt();

    Scanner prompt = new Scanner(System.in);
    System.out.println("hi there! what's on your mind?");

    //String prompt1 = prompt.nextLine(); 

  for (int i = 0; i < roundnum; i++) {
    Scanner answer = new Scanner(System.in);
    String answer2  =  answer.nextLine(); 
    String[] answer2components = answer2.split(" ");
    int m = 0;
    String[] transcript = new String[roundnum*2];
    transcript[m] = answer2;
    m = m+1;
    int answer2size = answer2components.length;
    for (int j = 0; j < answer2size-1; j++) {
      if (answer2components[j].equals("yes")) {
        
      } else if (answer2components[j].equals("i")) {
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
      }}
      //answer2components + "?";
      String finalresponse = String.join(" ", answer2components) + "?";
      transcript[m] = finalresponse;
      m = m+1;
      System.out.print(finalresponse);
    String finaltranscript = String.join("        ", transcript);
    //System.out.println(finaltranscript);
  // IF VARIABLE EQUALS NUM ROUJNDS THENNNNNNN OD OTHIS
      System.out.println("that's so cool! goodbye!");
      System.out.println();
      System.out.println("transcript:");
      //String finaltranscript = String.join(" ", transcript);
      System.out.println(finaltranscript);
  }}}

  