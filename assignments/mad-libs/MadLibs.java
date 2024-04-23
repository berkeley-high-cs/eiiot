public class MadLibs {

  // These are arrays. We will cover them properly in Unit 6. They are used to
  // represent a list of values, in this case a list of Strings. You may want to
  // introduce your own arrays following the pattern here.

  private String[] names = { "Wilma", "Betty", "Fred", "Barney" };

  private String[] adjectives = { "radiant", "glowing", "glum", "bespeckled" };

  private String[] verb = {"run", "sit", "cry", "win"};

  // This method chooses a random element from the array passed as its argument.
  // For instance given the definition of names above, chooseFrom(names) will
  // return one of "Wilma", "Betty", "Fred", or "Barney" each time it is called.
  public String chooseFrom(String[] choices) {
    return choices[(int) (Math.random() * choices.length)];
  }

  // This is a sample method that produces a sentence filling in some values
  // just like when you fill in the blanks in a MadLib. You should write several
  // more of these to make a full MadLib.
  public String sentenceOne(String name, String adjective) {
    return "Hello " + name + ", you're looking " + adjective + " today.";
  }

  public String sentenceTwo(String verb, String name1, String name2) {
    return "Have you considered going and " + verb + " near " + name1 + " " + name2 + "?";
  }

  // TODO: write more sentence methods.

  // This method is the entry point for generating a full MadLib. It should call
  // all your sentence methods with appropriate arguments, probably obtained by
  // calling chooseFrom with a suitable array of choices. It should concatnate
  // the results of all the sentence methods with the + operator to produce one
  // string contaning the whole output.
  public String generate() {
    // TODO: add calls to more sentence methods that you write and concatenate
    // them to the result
    return sentenceOne(chooseFrom(names), chooseFrom(adjectives)) + " " + sentenceTwo(chooseFrom(verbs), chooseFrom(names), chooseFrom(names));
  }

  // You don't need to touch this method. It just calls your generate method and
  // prints the result.
  public static void main(String[] argv) throws Exception {
    System.out.println(new MadLibs().generate());
  }
}
