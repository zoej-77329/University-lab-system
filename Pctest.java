import java.util.Scanner;

  public class Pctest {
	  private static University university; 
	  public static void main(String args[])
	  {
        Scanner sc=new Scanner(System.in);
		
	
	  while(true)
	  {
		  System.out.println("1.Add University");
		  System.out.println("2.Add Campus");
		  System.out.println("3.Add Department");
		  System.out.println("4.Add Lab");
		 // System.out.println("5.Add pc");
		  System.out.println("0.Exit");
		  System.out.println("Enter the choice number from above:");
		  
		  int choice=sc.nextInt();
		  
		  switch(choice)
		  {
			  case 1:
			  {
				 university=createuni(sc);
				  
				  break;
			  }
			  case 2:
			  { 
                 addcampus(sc,university);
				  
				  break;
		
			  }
			  case 3:
			  {
				 
				  addDepartment(sc,university);
				  
				  break;
			  }
			  case 4:
			  {
				 
				 Pclab L=createlab(sc);
				 Pclab l=createlab(sc);
	             L.display();
				 l.display();
				  break;
			  }
			  
			  case 0:
			  {
				  System.out.println("Exiting the program");
				    sc.close(); 
				  return;
			  }
			  default:
			  {
				  System.out.println("Innvalid input");
			  }
		  }
		  
	  }
	  
	  }
	  
	  public static University createuni(Scanner sc)
	  {
		  System.out.println("Enter University name:");
		  String uniname=sc.nextLine();
		  		  sc.nextLine();

		  
		  System.out.println("Enter the number of departments:");
		  int numdepartment=sc.nextInt();
		  sc.nextLine();
		  
		  System.out.println("Enter the number of Campuses:");
		  int numcampuses=sc.nextInt();
		  sc.nextLine();
		  
		  University university=new University(uniname,numdepartment,numcampuses);
          return university;

	  }
	  
	  public static void addDepartment(Scanner sc,University university)
	  {
		  System.out.println("Enter Department name:");
		  String departmentname=sc.nextLine();
		   sc.nextLine();

		  System.out.println("Enter Department Head:");
		  String departmenthead=sc.nextLine();
		  
		  System.out.println("Enter the number of labs:");
		  int numlabs=sc.nextInt();
		  
		  
		  Department department=new Department(departmentname,departmenthead,numlabs);
		  university.adddepartment(department);
	  }
	  
	  public static void addcampus(Scanner sc,University uni)
	  {
		  System.out.println("Enter Campus Name:");
		  String campusname=sc.nextLine();
		  sc.nextLine();
		  
		  System.out.println("Enter Campus Location:");
		  String location=sc.nextLine();
		  sc.nextLine();
		  Campus campus=new Campus(campusname,location);
		  university.addcampus(campus);
	  }
	  
	  public static Pclab createlab(Scanner sc)
	  {
		  System.out.println("Enter Lab name:");
		  String labname=sc.nextLine();
		  sc.nextLine();
		  
		  System.out.println("Enter Lab Assistant name:");
		  String assistantname=sc.nextLine();
		  
		  System.out.println("Enter Lab Incharge name:");
		  String incharge=sc.nextLine();
		  
          System.out.println("Enter number of  Pc's to add:");
		  int numpc=sc.nextInt();
		  sc.nextLine();
		  
		  Pclab L=new Pclab(labname,numpc,assistantname,incharge);
		  Pclab l=(Pclab)L.clone();
		  for(int i=0;i<numpc;i++)
		  {
			  System.out.println("Enter PC details:");
			  addpc(sc,L);
		  }
		  return L;
		  
	  }
	  
	  public static void addpc(Scanner sc,Pclab L)
	  {
		  System.out.println("Enter Pc Id:");
          int id=sc.nextInt();
		  sc.nextLine();
		  
		  System.out.println("Enter CPU Model:");
          String cpumodel=sc.nextLine();
		  
		  System.out.println("Enter RAM Size:");
          int ramsize=sc.nextInt();
		  
		  System.out.println("Enter Hsrddisk Size:");
          int hdsize=sc.nextInt();
		  sc.nextLine();
		  
		  System.out.println("Enter LCD Model:");
          String lcdmodel=sc.nextLine();
		  
		  System.out.println("Does it have GPU(true/false):");
          boolean gpu=sc.nextBoolean();
		  
		  L.addpc(id,cpumodel,ramsize,hdsize,lcdmodel,gpu);
	  }
	  
	  
	  
	}  