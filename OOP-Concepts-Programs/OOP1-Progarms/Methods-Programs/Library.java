class Library {
    String libraryName; 
    String address; 
    int totalBooks; 
    int members;

    // Method to print library information
    void printLibraryInfo() {
        System.out.println("Library Name : " + libraryName);
        System.out.println("Address      : " + address);
        System.out.println("Total Books  : " + totalBooks);
        System.out.println("Total Members: " + members);
        System.out.println();
    }

    // Method to update total books and members
    void updateLibrary(int newBooks, int newMembers) {
        totalBooks = newBooks;
        members = newMembers;
    }

    public static void main(String Args[]) {
        Library library1 = new Library();
        library1.libraryName = "Central Library";
        library1.address = "Karachi";
        library1.totalBooks = 1200;
        library1.members = 800;
        library1.printLibraryInfo();

        // Updating library1 information
        library1.updateLibrary(1300, 850);
        System.out.println("After update:");
        library1.printLibraryInfo();

        Library library2 = new Library();
        library2.libraryName = "Westside Library";
        library2.address = "Khuhra";
        library2.totalBooks = 1100;
        library2.members = 700;
        library2.printLibraryInfo();

        // Updating library2 information
        library2.updateLibrary(1150, 750);
        System.out.println("After update:");
        library2.printLibraryInfo();

        Library library3 = new Library();
        library3.libraryName = "Eastside Library";
        library3.address = "Khairpur";
        library3.totalBooks = 1000;
        library3.members = 600;
        library3.printLibraryInfo();


        Library library4 = new Library();
        library4.libraryName = "Central Library";
        library4.address = "Sukkur";
        library4.totalBooks = 900;
        library4.members = 500;
        library4.printLibraryInfo();


        Library library5 = new Library();
        library5.libraryName = "Eastside Library";
        library5.address = "Gambat";
        library5.totalBooks = 600;
        library5.members = 400;
        library5.printLibraryInfo();

      
    }
}


