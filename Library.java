public class Library{
	static String libraryName;
	  String bookTitle;
public static void main(String[] args){
      libraryName="Central Library";
      System.out.println("LibraryName:"+Library.libraryName);
      //bookTitle="The Alchemist"; We can’t access instance variables without creating objects
     Library lib=new Library();
     lib.bookTitle="The Alchemist";
     System.out.println("Book Title :"+lib.bookTitle);
}
}