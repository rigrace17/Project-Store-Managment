//Used for User Input
import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

// Creates a Scanner object 
Scanner input = new Scanner(System.in);

boolean didBuyMedia = false;

System.out.println("Welcome to the Multi-Media Emporium! What would you like to purchase today?");
System.out.println("1) A Book?");
System.out.println("2) Video Games?");
System.out.println("3) Perhaps a Movie?");

// Arrow for funsies
System.out.print("--> ");

int userSelection = input.nextInt();

//User should like to PURCHASE a Book
    if (userSelection == 1) {
      System.out.println("What's the name of the Book you will be purchasing today?");
      //Arrow for funsies
      System.out.print("-->"); 
      String bookName = input.nextLine();
      bookName = input.nextLine();
      
      System.out.println("What's the genre of the Book you will be purchasing today?");
      //Arrow for funsies
      System.out.print("-->"); 
      String bookGenre = input.nextLine();
      
      System.out.println("How many pages are in it?");
      //Arrow for funsies
      System.out.print("-->"); 
      int numPages = input.nextInt();
      input.nextLine();
      
      System.out.println("What's the name of the publisher?");
      //Arrow for funsies
      System.out.print("-->"); 
      String publisherName = input.nextLine();
      
      
      System.out.println("Who's the author?");
      //Arrow for funsies
      System.out.print("-->"); 
      String authorName = input.nextLine();
      

//Create the Book
      System.out.println();
      Book newBook = new Book(bookName, bookGenre, numPages, publisherName, authorName);
      System.out.println("Here's your Book!");
      System.out.println();
      System.out.println(newBook);

//Goodbye Messages
      didBuyMedia = true;
}

//User should like to PURCHASE a Video Game
    if (userSelection == 2) {
      System.out.println("What's the name of the Video Game you will be purchasing today?");
      //Arrow for funsies
      System.out.print("-->"); 
      String videoGameName = input.nextLine();
      videoGameName = input.nextLine();
      
      System.out.println("What's the genre of the Video Game you will be purchasing today?");
      //Arrow for funsies
      System.out.print("-->"); 
      String videoGameGenre = input.nextLine();
      
      
      System.out.println("Who's the developer?");
      //Arrow for funsies
      System.out.print("-->"); 
      String developerName = input.nextLine();
      
//Create the Video Game
      System.out.println();
      VideoGames newVideoGame = new VideoGames(videoGameName, videoGameGenre, developerName);
      System.out.println("Here's your Video Game!");
      System.out.println();
      System.out.println(newVideoGame);

//Goodbye Messages
      didBuyMedia = true;
}


    
//User should like to PURCHASE a Movie
    if (userSelection == 3) {
      System.out.println("What's the name of the Movie you will be purchasing today?");
      //Arrow for funsies
      System.out.print("-->"); 
      String movieName = input.nextLine();
      movieName = input.nextLine();
      
      System.out.println("What's the genre of the Video Game you will be purchasing today?");
      //Arrow for funsies
      System.out.print("-->"); 
      String movieGenre = input.nextLine();
      
      System.out.println("Who's the director?");
      //Arrow for funsies
      System.out.print("-->"); 
      String directorName = input.nextLine();

      
      System.out.println("What's the run time?");
      //Arrow for funsies
      System.out.print("-->"); 
      double duration = input.nextDouble();
      
//Create the Movie
      System.out.println();
      Movie newMovie = new Movie(movieName, movieGenre, directorName, duration);
      System.out.println("Here's your Movie!");
      System.out.println();
      System.out.println(newMovie);

//Goodbye Messages
      didBuyMedia = true;
}

if (didBuyMedia){
      System.out.println("Thank you so much for your purchase! Come back again!");
    } else {
      System.out.println("Thanks for visiting! Come again next time!");
    }

// Closes the Scanner object
input.close();
    
  }
}
