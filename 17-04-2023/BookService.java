package bookapplication;

import java.util.Scanner;

public class BookService {
	
	static Book book[] = new Book[10];
	static Scanner sc = new Scanner(System.in);
	static int index = 0;
	
	
//	create book method
	public static void createBook()
	{
		boolean flag=false;
		System.out.println("Enter the book Id :");
		int id = sc.nextInt();
		sc.nextLine();
		
		
		// check book id is already exist or not
		for(int i=0;i<index;i++)
		{
			if(book[i].getBookId() == id)
			{
				flag = true;
				break;
			}
		}
		if(flag == false)
		{
			System.out.println("Enter the book name :");
			String bname = sc.nextLine();
			
			System.out.println("Enter the book price :");
			double price = sc.nextDouble();
			
			book[index] = new Book(id, bname, price);
				
			index++;
			System.out.println("Book details Created Successfully  ");
			System.out.println("----------------------------------");
		}else {
			System.out.println("Book ID is already Exist...");
			createBook();
			
		}
		
		
	
	}
	
	//get all book details list
	public static void getAllBook()
	{
		System.out.println("---------------------- Books List ----------------------");
		for(int i=0;i<index;i++)
		{
			
			System.out.println("Book Id : "+book[i].getBookId());
			System.out.println("Book Name : "+book[i].getBookName());
			System.out.println("Book Price : "+book[i].getBookPrice()+"\n");
			
		}
	}
	
//	get book detail by id
	public static void getBookDetailsById()
	{
		System.out.println("Entet id to search:");
		boolean flag = false;
		int id = sc.nextInt();
	
		for(int i=0;i<index;i++)
		{
			if(book[i].getBookId() == id)
			{
				System.out.println("Book Id : "+book[i].getBookId());
				System.out.println("Book Name : "+book[i].getBookName());
				System.out.println("Book Price : "+book[i].getBookPrice());
				System.out.println("---------------------------------------");
				flag = true;
				break;
			}else
			{
				if(flag == false)
					System.out.println("Book not found !!");
			}
		}
	}
	
	// get book by name
	
	public static void getBookDetailsByName()
	{
		boolean flag = false;
		
		sc.nextLine();
		
		System.out.println("Entet Book Name to search:");
		String  bname = sc.nextLine();
		
	
		for(int i=0;i<index;i++)
		{
			if(book[i].getBookName().equalsIgnoreCase(bname))
			{
				System.out.println("Book Id : "+book[i].getBookId());
				System.out.println("Book Name : "+book[i].getBookName());
				System.out.println("Book Price : "+book[i].getBookPrice());
				System.out.println("---------------------------------------");
				flag = true;
				break;
			}
		}
		
		if(flag == false)
			System.out.println("Book not found !!");
	}
	
	public static void updatebook()
	{
		boolean flag = false;
		System.out.println("Enter the Book ID ");
		int id = sc.nextInt();
		
		// check book is exist or not
		for(int i=0;i<index;i++)
		{
			if(book[i].getBookId() == id)
			{
				sc.nextLine();
				
				System.out.println("Enter Book Name : ");
				String name = sc.nextLine(); // get book name from user
				
				book[i].setBookName(name); // update book name
				
				
				System.out.println("Enter Book Price : ");
				double price = sc.nextDouble(); // get book price from user
				
				book[i].setBookPrice(price); // update book price 
				
				System.out.println("---------------------------------------");
				flag = true;
				break;
			
			
			}
		}
		if(flag == false) {
			System.out.println("Book ID is not found !!");
			System.out.print("Re-");
			updatebook();
		}
		else {
			System.out.println("Book details Update Successfully !!");
		}
			
	}

}
