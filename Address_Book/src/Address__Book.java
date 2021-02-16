        import java.util.ArrayList;
		import java.util.Collections;
		import java.util.Scanner;
		
		
		
public class Address__Book {
	
	
	ArrayList<InformationInput> book =new ArrayList<InformationInput>();
	Scanner s = new Scanner(System.in);
	
	public void Add()
	{	
		InformationInput Info = new InformationInput();
		
		System.out.println("Enter First name:");		
		Info.setFirstName(s.next());
		
		System.out.println("Enter last name:");		
		Info.setLastName(s.next());
		
		System.out.println("Enter your address:");
		Info.setAddress(s.next());
		
		System.out.println("Enter your city:");
		Info.setCity(s.next());
		
		System.out.println("Enter your state:");
		Info.setState(s.next());
		
		System.out.println("Enter your ZIP code:");
		Info.setZip(s.next());
		
		System.out.println("Enter your phone number");
		Info.setPhone(s.next());
	
		book.add(Info);
	
	}
	
	public void Delete()
	{
		String temp=null;
		System.out.println("Enter the LastName of the record you want to delete");
		temp=s.next();
		if(book.isEmpty())
		{
			System.out.println("No records to delete");
			return;
		}
		for(int i=0;i<book.size();i++)
		{
			if(book.get(i).getLastName().equals(temp))
			{
				book.remove(i);
				break;
			}
		}
	}
	
	public void Edit()
	{
		String temp=null;
		System.out.println("Enter the Phone number of the record u want to Edit");
		temp=s.next();
		if(book.isEmpty())
		{
			System.out.println("No records to edit");
			return;
		}
		
			for(int i=0;i<book.size();i++)
			{
				if(book.get(i).getPhone().equals(temp))
				{
					InformationInput Info=new InformationInput();
					
					System.out.println(temp);
					System.out.println("Enter First name:");
					Info.setFirstName(s.next());
					System.out.println("Enter last name:");
					Info.setLastName(s.next());
					System.out.println("Enter your address:");
					Info.setAddress(s.next());
					System.out.println("Enter your city:");
					Info.setCity(s.next());
					System.out.println("Enter your state:");
					Info.setState(s.next());
					System.out.println("Enter your ZIP code:");
					Info.setZip(s.next());
					System.out.println("Enter your phone number");
					Info.setPhone(s.next());
					book.remove(i);
					book.add(i, Info);
					break;
				}
				
			}
		
	}
	
	public void Sort_Zip()
	{
		ArrayList<String> Zip = new ArrayList<>();
		for(int i=0;i<book.size();i++)
		{
			Zip.add(book.get(i).getZip());
		}
		Collections.sort(Zip);
		System.out.println(Zip);
	}
	
	public void Sort_Name()
	{
		ArrayList<String> Name = new ArrayList<>();
		
		for(int i=0;i<book.size();i++)
		{
			Name.add(book.get(i).getLastName());
		}
		Collections.sort(Name);
		System.out.println(Name);
	}
	
	public void Display()
	{
		for(int i=0;i<book.size();i++)
		{
			System.out.println(book.get(i));
		}
	}
	public class InformationInput {
		
		private String firstName;
		private String lastName;
		private String address;
		private String city;
		private String state;
		private String zip;
		private String phone;
		
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getZip() {
			return zip;
		}
		public void setZip(String zip) {
			this.zip = zip;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		
		public void copy(InformationInput temp)
		{
			this.address=temp.address;
			this.firstName=temp.firstName;
			this.lastName=temp.lastName;
			this.city=temp.city;
			this.state=temp.state;
			this.zip=temp.zip;
			this.phone=temp.phone;
		}
		@Override
		public String toString() {
			return "InformationInput [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
					+ ", state=" + state + ", zip=" + zip + ", phone=" + phone + "]";
		}
		
	}	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		{
			int  userInput;
			int ans;
			 Address__Book obj = new  Address__Book();
			
			Scanner s = new Scanner(System.in);
			do {
				System.out.println("1.Add record");
				System.out.println("2.Edit record");
				System.out.println("3.Delete record");
				System.out.println("4.Sort by zip record");
				System.out.println("5.Sort by lastname record");
				System.out.println("6.Display record");
				userInput = s.nextInt();
				switch(userInput)
				{
					case 1:
						obj.Add();
						break;
					case 2:
						obj.Edit();
						break;
					case 3:
						obj.Delete();
						break;
					case 4:
						obj.Sort_Zip();
						break;
					case 5:
						obj.Sort_Name();
						break;
					case 6:
						obj.Display();
						break;
					default:System.out.println("Invalid option");
				}
				
				System.out.println("press 1 to start \n press 0 to disconnect");
				ans=s.nextInt();
			}while(ans==1);
					
		}

	}
	}
	

		

	
