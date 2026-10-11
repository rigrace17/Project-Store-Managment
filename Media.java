/* Establishing the Media superclass
which also represent different types of Media*/
public class Media {

private String name; //Name of Media
private double price; //Price of Media
private String genre; //Genre of Media 

//No-Argument Constuctor 
public Media() {
  this("no name", 0.0, "no genre");
}

//Parameterized Constuctor
public Media (String name, double price, String genre) {
  this.name = name;
  this.price = price;
  this.genre = genre;
}

//Acsessor Method for Name
public String getName() {
  return name;
}

//Mutator Method for Name
public void setName(String name) {
  this.name = name;
}

//Acsessor Method for Price  
public double getPrice() {
   return price;
 }

//Mutator Method for Price  
public void setPrice(double price) {
   this.price = price;
 }

//Acessor Method for Genre  
public String getGenre() {
  return genre;
}

//Mutator Method for Genre
public void setGenre(String name) {
  this.genre = genre;
}

//To-String Method
public String toString() {
  return name + "." + genre;
}
  }
