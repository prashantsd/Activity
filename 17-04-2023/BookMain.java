package bookapplication;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		 
		BookService bseService = new BookService();
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("Welcome to Book Management System ");
			System.out.println("Press : \n1) To Create Book\n"
					+"2) To get All Book Details\n"
					+"3) to get book details using id\n"
					+"4) Get book by Name\n"
					+"5) Update book details by id\n"
					+"6) Exit");
			System.out.println("--------------------------------------------");
			System.out.println("Entet your choice :");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				bseService.createBook();
				System.out.println();
				break;
			
			case 2:
				bseService.getAllBook();
				System.out.println();
				break;
				
			case 3:
				bseService.getBookDetailsById();
				System.out.println();
				break;
				
			case 4:
				bseService.getBookDetailsByName();
				break;
				
			case 5:
				bseService.updatebook();
				break;
				
			case 6:
				System.exit(0);
				System.out.println("Thank For Visiting ");
				break;
				
			default:
				System.out.println("Invalid input");

			}

		}while(true);
		
	}

}
