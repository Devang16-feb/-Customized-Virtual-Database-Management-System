import java.util.*;


class program665
{
    public static void main(String Arg[])
    {
        System.out.println("-------- Customized Database Management System --------");

        try (Scanner sobj = new Scanner(System.in)) 
        {
            MarvellousDBMS mobj = new MarvellousDBMS();

            int iOption = 0;
            int Salary;
            int EID;

            String Name;
            String Address;

            while(true)
            {
                System.out.println("----------------------------------------------------------");
                System.out.println("Please select your choice based on your requirement: ");
                System.out.println("----------------------------------------------------------");

                System.out.println("1 : Insert new record into the table");

                System.out.println("2 : Display all records");
                
                System.out.println("3 : Display all records having specific EID");
                
                System.out.println("4 : Display all records having specific Name");
                
                System.out.println("5 : Delete the record based on EID");
                
                System.out.println("6 : Delete the record based on Employee name");

                System.out.println("7 : Display Sum of all salary");

                System.out.println("8 : Display Average of all salary");
                
                System.out.println("9 : Display Minimum from all salary");

                System.out.println("10 : Display Maximum from all salary");

                System.out.println("11 : Display the Count of records");

                System.out.println("12 : Display record in Ascending order based on Esalary");

                System.out.println("13 : Display record in Descending order based on Esalary");

                System.out.println("14: Update the data from the record");

                System.out.println("15 : Display Help");

                System.out.println("16 : Display About");

                System.out.println("17 : Terminate the DBMS");
                System.out.println("----------------------------------------------------------");

                iOption = sobj.nextInt();

                switch(iOption)
                {
                    // 1 : Insert new record into the table"
                    case 1 : 
                        System.out.println("Please enter the information of emplyee : ");

                        System.out.println("Please enter Employee name : ");
                        sobj.nextLine();
                        Name = sobj.nextLine();

                        System.out.println("Please enter Employee Address : ");
                        Address = sobj.nextLine();

                        System.out.println("Please enter Employee Salary : ");
                        Salary = sobj.nextInt();

                        mobj.InsertIntoTable(Name,Address,Salary);

                        break;

                    // 2 : Display all records
                    case 2 : 
                        mobj.SelectStar();

                        break;

                    // 3 : Display all records having specific EID
                    case 3 : 
                        System.out.println("Please enter the Employee ID whose information that you want to display");

                        EID = sobj.nextInt();

                        mobj.SelectSpecific(EID);

                        break;

                    // 4 : Display all records having specific Name
                    case 4 : 
                        System.out.println("Please enter the Employee name whose information that you want to display");
                        sobj.nextLine();

                        Name = sobj.nextLine();

                        mobj.SelectSpecific(Name);

                        break;

                    // 5 : Delete the record based on EID
                    case 5 : 
                        System.out.println("Please enter the Employee ID whose information that you want to delete");

                        EID = sobj.nextInt();

                        mobj.DeleteFrom(EID);

                        break;

                    // 6 : Delete the record based on Employee name
                    case 6 : 
                        System.out.println("Please enter the Employee name whose information that you want to delete");
                        sobj.nextLine();

                        Name = sobj.nextLine();

                        mobj.DeleteFrom(Name);

                        break;

                    // 7 : Display Sum of all salary
                    case 7 : 
                        mobj.AggregateSum();

                        break;

                    // 8 : Display Average of all salary
                    case 8 : 
                        mobj.AggregateAvg();

                        break;

                    // 9 : Display Minimum from all salary
                    case 9 : 
                        mobj.AggregateMin();

                        break;

                    // 10 : Display Maximum from all salary
                    case 10 : 
                        mobj.AggregateMax();

                        break;  

                    // 11 : Display Count from all salary
                    case 11 : 
                        mobj.AggregateCount();

                        break;
                     
                    // 12 : Display record in Ascending order based on Esalary    
                    case 12:
                        mobj.OrderByClauseAsc();

                        break;

                    // 13 : Display record in Descending order based on Esalary    
                    case 13:
                        mobj.OrderByClauseDes();

                        break;

                    // 14 : Update the record of employee according to user    
                    case 14:
                        System.out.println();
                        System.out.println("--------------------------------------------------");
                        System.out.println("What do you want to changed ? Enter the choice :");
                        System.out.println("1 : Update Address of the employee.");
                        System.out.println("2 : Update name of the employee.");
                        System.out.println("3 : Update salary of the employee");
                        System.out.println("--------------------------------------------------");

                        int iChoice = sobj.nextInt();
                        int ID = 0;
                        
                        if(iChoice == 1)
                        {
                            System.out.println("Enter ID of the employe whose Address you want to change : ");
                            ID = sobj.nextInt();
                            sobj.nextLine();

                            System.out.println("Enter the changed address :");
                            String UpdateAddress = sobj.nextLine();

                            mobj.UpdateRecordAddress(UpdateAddress, ID);
                        }
                        else if(iChoice == 2)
                        {
                            System.out.println("Enter ID of the employe whose Name you want to change : ");
                            ID = sobj.nextInt();
                            sobj.nextLine();

                            System.out.println("Enter the changed Name :");
                            String UpdateName = sobj.nextLine();

                            mobj.UpdateRecordName(UpdateName, ID);
                        }
                        else if(iChoice == 3)
                        {
                            System.out.println("Enter ID of the employe whose Salary you want to change : ");
                            ID = sobj.nextInt();

                            System.out.println("Enter the new salary amount for that employee :");
                            int NewAmount = sobj.nextInt();

                            mobj.UpdateRecordSalary(NewAmount, ID);
                        }
                        else
                        {
                            System.out.println("You have Entered wrong choice !!");
                        }

                        break;

                    case 15 : 
                        System.out.println("This project implements the DBMS for employee records");
                        System.out.println("We implement all SQL queries");
                        System.out.println("All data gets stored in Data structres");
                        System.out.println("Complete implemenrtation is on Primary storage");
                       
                        break;

                    case 16 : 
                        System.out.println("This project developed by Devang Bhalerao");
                        System.out.println("All copyrights reserved..");

                        break;
                        
                    case 17 : 
                        System.out.println("Thank you for using the Customized DBMS");
                        mobj = null;

                        System.gc(); 

                        System.exit(0);           
                }
            }
        }
        
    }
}


class Employee
{
    public int EID;
    public String Ename;
    public String EAddress;
    public int ESalary;

    private static int Counter;

    static
    {
        Counter = 0;
    }

    public Employee(String B, String C, int D)
    {
        this.EID = ++Counter;
        this.Ename = B;
        this.EAddress = C;
        this.ESalary = D;
    }

    void DisplayInfo()
    {
        System.out.println(EID+"\t"+Ename+"\t"+EAddress+"\t"+ESalary);
    }
}

class MarvellousDBMS
{
    public LinkedList <Employee> lobj;

    public MarvellousDBMS()
    {
        System.out.println("Marvellous DBMS started succesfully...");
        lobj = new LinkedList<Employee>();
    }

    // Insert into Employee values(1,"Sagar","Pune",11000);
    public void InsertIntoTable(String name, String Address, int Salary)
    {
        Employee eobj = new Employee(name,Address,Salary);
        lobj.add(eobj);
    }

    // Select * from emplyee;
    public void SelectStar()
    {
        System.out.println("Data from the Employee Databsae : ");

        System.out.println("\n----------------------------------------------------------");
        System.out.println("EID\tEname\t\tEaddress\t\tEsalary");
        System.out.println("----------------------------------------------------------");

        for(Employee eref : lobj)
        {
            eref.DisplayInfo();
        }

        System.out.println("----------------------------------------------------------");
    }

    // Select * from emplyee where Eid = 3;
    public void SelectSpecific(int ID)
    {
        System.out.println("Information of Employee whose EID is : "+ID);

        for(Employee eref : lobj)
        {
            if(eref.EID == ID)
            {
                eref.DisplayInfo();
                break;
            }
        }
    }

    // Select * from emplyee where Ename = "Sagar";
    public void SelectSpecific(String Name)
    {
        System.out.println("Information of Employee whose Name is : "+Name);

        for(Employee eref : lobj)
        {
            if(Name.equals(eref.Ename))
            {
                eref.DisplayInfo();
            }
        }
    }

    // delete from Emplyee where EID = 3;
    public void DeleteFrom(int ID)
    {
        int index = 0;
        boolean bflag = false;

        for(Employee eref : lobj)
        {
            if(eref.EID == ID)
            {
                bflag = true;
                break;
            }
            index++;
        }

        if(bflag == false)
        {
            System.out.println("Unable to delete the element from database as given id is not present");
        }
        else
        {
            lobj.remove(index);
        }
    }

    // delete from Emplyee where Ename = "Sagar";
    public void DeleteFrom(String Name)
    {
        int index = 0;
        boolean bflag = false;

        for(Employee eref : lobj)
        {
            if(Name.equals(eref.Ename))
            {
                bflag = true;
                break;
            }
            index++;
        }

        if(bflag == false)
        {
            System.out.println("Unable to delete the element from database as given id is not present");
        }
        else
        {
            lobj.remove(index);
        }
    }

    // Select Sum(ESalary) from Employee;
    public void AggregateSum()
    {
        int iSum = 0;

        for(Employee eref : lobj)
        {
            iSum = iSum + eref.ESalary;
        }

        System.out.println("Summation of salary : "+iSum);
    }

    // Select Max(ESalary) from Employee;
    public void AggregateMax()
    {
        int iMax = 0;

        for(Employee eref : lobj)
        {
            if(eref.ESalary > iMax)
            {
                iMax = eref.ESalary;
            }
        }

        System.out.println("Maximum salary : "+iMax);
    }

    // Select Min(ESalary) from Employee;
    public void AggregateMin()
    {
        Employee temp = lobj.get(0);

        int iMin = temp.ESalary;

        for(Employee eref : lobj)
        {
            if(eref.ESalary < iMin)
            {
                iMin = eref.ESalary;
            }
        }

        System.out.println("Minimum salary : "+iMin);
    }

    // Select Avg(ESalary) from Employee;
    public void AggregateAvg()
    {
        int iSum = 0;

        for(Employee eref : lobj)
        {
            iSum = iSum + eref.ESalary;
        }

        System.out.println("Average salary : "+(iSum / lobj.size()));
    }

    // Select Count(ESalary) from Employee;
    public void AggregateCount()
    {
        System.out.println("Number of Employees: "+lobj.size());
    }

    // Select * from Employee order by ESalary (Ascending order)
    public void OrderByClauseAsc()
    {
        LinkedList<Employee> erefList = new LinkedList<>();
        Employee FirstSalary = null;
        Employee SecondSalary = null;
        Employee iTemp = null;

        for(Employee eref : lobj)
        {
            erefList.add(eref);
        }

        System.out.println("Data from employee in Ascending order with there Esalary :");
        System.out.println("\n----------------------------------------------------------");
        System.out.println("EID\tEname\t\tEaddress\t\tEsalary");
        System.out.println("----------------------------------------------------------");
        for(int i=0; i<erefList.size()-1; i++)
        {
            for(int j=i+1; j<erefList.size(); j++)
            {
                FirstSalary = erefList.get(i);
                SecondSalary = erefList.get(j);

                if(FirstSalary.ESalary > SecondSalary.ESalary)
                {
                    iTemp = FirstSalary;
                    erefList.set(i, SecondSalary);
                    erefList.set(j, iTemp);
                }
            }
        }

        for(Employee e : erefList) 
        {
            e.DisplayInfo();
        }

        System.out.println("----------------------------------------------------------");
        erefList.clear();
    }

    // Select * from Employee order by ESalary (Descending order)
    public void OrderByClauseDes()
    {
        LinkedList<Employee> erefList = new LinkedList<>();
        Employee FirstSalary = null;
        Employee SecondSalary = null;
        Employee iTemp = null;

        for(Employee eref : lobj)
        {
            erefList.add(eref);
        }

        System.out.println("Data from employee in Descending order with there Esalary :");
        System.out.println("\n----------------------------------------------------------");
        System.out.println("EID\tEname\t\tEaddress\t\tEsalary");
        System.out.println("----------------------------------------------------------");
        for(int i=0; i<erefList.size()-1; i++)
        {
            for(int j=i+1; j<erefList.size(); j++)
            {
                FirstSalary = erefList.get(i);
                SecondSalary = erefList.get(j);

                if(FirstSalary.ESalary < SecondSalary.ESalary)
                {
                    iTemp = FirstSalary;
                    erefList.set(i, SecondSalary);
                    erefList.set(j, iTemp);
                }
            }
        }

        for(Employee e : erefList) 
        {
            e.DisplayInfo();
        }

        System.out.println("----------------------------------------------------------");
        erefList.clear();
    }

    // update Employee set Address = "Bardi Nagpur     ", where EID = 5;
    public void UpdateRecordAddress(String str, int ID)
    {
        boolean bFlag = false;

        for(Employee eref : lobj)
        {
            if(eref.EID == ID)
            {
                bFlag = true;
                eref.EAddress = str;
                break;
            }
        }

        if(bFlag == false)
        {
            System.out.println("Entered ID not present in record !!");
        }
        else
        {
            System.out.println("Succefully updated the Address of employee....");
        }
    }


    // update Employee set Name = "Mansi Joshi    ", where EID = 5;
    public void UpdateRecordName(String str, int ID)
    {
        boolean bFlag = false;

        for(Employee eref : lobj)
        {
            if(eref.EID == ID)
            {
                bFlag = true;
                eref.Ename = str;
                break;
            }
        }

        if(bFlag == false)
        {
            System.out.println("Entered ID not present in record !!");
        }
        else
        {
            System.out.println("Succefully updated the Name of employee....");
        }
    }

    // update Employee set Name = "Mansi Joshi    ", where EID = 5;
    public void UpdateRecordSalary(int NewAmount, int ID)
    {
        boolean bFlag = false;

        for(Employee eref : lobj)
        {
            if(eref.EID == ID)
            {
                bFlag = true;
                eref.ESalary = NewAmount;
                break;
            }
        }

        if(bFlag == false)
        {
            System.out.println("Entered ID not present in record !!");
        }
        else
        {
            System.out.println("Succefully updated the Salary of employee....");
        }
    }

}

