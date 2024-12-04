class Library{
    String libraryName; 
	String address; 
	int totalBooks; 
	int members;
     
	public static void main(String Args[]){
		Library library1 = new Library();
		library1.libraryName = "Central Library";
		library1.address = "Karachi";
		library1.totalBooks = 1200;
		library1.members = 800;
		
		System.out.println("<<<<<<<LIBRARY INFORAMTION");
		System.out.println("Library Name : "+library1.libraryName);
		System.out.println("Address      : "+library1.address);
		System.out.println("Total Books  : "+library1.totalBooks);
		System.out.println("Total Member : "+library1.members);
		System.out.println();
		
		Library library2 = new Library();
		library2.libraryName = "Westside Library";
		library2.address = "Khuhra";
		library2.totalBooks = 1100;
		library2.members = 700;
		
		System.out.println("Library Name : "+library2.libraryName);
		System.out.println("Address      : "+library2.address);
		System.out.println("Total Books  : "+library2.totalBooks);
		System.out.println("Total Member : "+library2.members);
		System.out.println();
		
		Library library3 = new Library();
		library3.libraryName = "Eastside Library";
		library3.address = "Khairpur";
		library3.totalBooks = 1000;
		library3.members = 600;
		
		System.out.println("Library Name : "+library3.libraryName);
		System.out.println("Address      : "+library3.address);
		System.out.println("Total Books  : "+library3.totalBooks);
		System.out.println("Total Member : "+library3.members);
		System.out.println();
		
		Library library4 = new Library();
		library4.libraryName = "Central Library";
		library4.address = "Sukkur";
		library4.totalBooks = 900;
		library4.members = 500;
		
		System.out.println("Library Name : "+library4.libraryName);
		System.out.println("Address      : "+library4.address);
		System.out.println("Total Books  : "+library4.totalBooks);
		System.out.println("Total Member : "+library4.members);
		System.out.println();
		
		
		Library library5 = new Library();
		library5.libraryName = "Eastside Library";
		library5.address = "Gambat";
		library5.totalBooks = 600;
		library5.members = 400;
		
		System.out.println("Library Name : "+library5.libraryName);
		System.out.println("Address      : "+library5.address);
		System.out.println("Total Books  : "+library5.totalBooks);
		System.out.println("Total Member : "+library5.members);
	}
}