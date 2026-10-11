public class VideoGames extends Media { //Establishing the Video Games subclass

private String developer; //Developer of Video Game

//No-Argument Constructor
public VideoGames() {
  super("no name", 20.0, "no genre");
} 

//Parameterized Constructor
public VideoGames(String name, String genre, String developer) {
  super(name, 20.0, genre);
  this.developer = developer;
}

//Sets the name and genre[PARAMTERIZED]
public VideoGames(String name, String genre) {
  super(name, 20.0, genre);
}

//Accessor and Mutator Method for the Developer subclass
public String getDeveloper() {
  return developer;
}

public void setDeveloper() {
  this.developer = developer;
}

//To-String Method
public String toString() {
  return super.toString() + " (" + developer + " developer)" + "\nPrice: $" + getPrice();
}
  }
