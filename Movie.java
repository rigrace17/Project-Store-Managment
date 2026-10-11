public class Movie extends Media { //Establishing the Movie subclass

private String director; // Direction of a Movie
private double runTime; // Run Time of a Movie

public Movie() {
  super("no name", 5.00, "no genre");
}

public Movie(String name, String genre, String director, double runTime) {
  super(name, 5.00, genre);
  this.director = director;
  this.runTime = runTime;
}

public Movie (String name, String genre) {
  super (name, 5.00, genre);
}

public String getDirector() {
  return director;
}

public double getRunTime() {
  return runTime;
}

public String toString() {
  return super.toString() + " (" + director + " director)" + " (" + runTime + " runTime)" + "\nPrice: $" + getPrice();
  }
}
