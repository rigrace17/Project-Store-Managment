public class Book extends Media { //Establishing the Book subclass

private int pages; //Number of Pages in a Book
private String publisher; //Publisher of Book
private String author; //Author of Book 

//No-Argument Constuctor 
public Book() {
  super("no name", 10.0, "no genre");
}

//Parameterized Constructor
public Book(String name, String genre, int pages, String publisher, String author){
  super(name, 10.0, genre + pages * 0.000001);
  this.pages = pages;
  this.publisher = publisher;
  this.author = author; 
} 

//Sets the name and genre[PARAMTERIZED]
public Book (String name, String genre) {
  super(name, 10.0, genre);
} 

/* Okay, so everything down here is 
Acessor and Mutator methods alternating */
  public int getPages() {
  return pages;
}

public void setPages() {
  this.pages = pages;
}

public String getPublisher() {
  return publisher;
} 

public void setPublisher() {
  this.publisher = publisher;
}

public String getAuthor() {
  return author;
}

public void setAuthor() {
  this.author = author;
}

//To-String Method  
public String toString() {
  return super.toString() + " (" + pages + " pages)" + " (" + publisher + " publisher)" + " (" + author + " author)" + "\nPrice: $" + getPrice();
}
  }
