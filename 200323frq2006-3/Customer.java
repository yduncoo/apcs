public class Customer
{
    // constructs a Customer with given name and ID number
    public Customer(String name, int idNum)
    { 
        customerName = name;
        customerID = idNum;
        /* implementation not shown */
    }

    // returns the customer's name
    public String getName() 
    { 
        return customerName;
        /* implementation not shown */ 
    }

    // returns the customer's id
    public int getID() 
    { 
        return customerID;
        /* implementation not shown */ 
    }

    // returns 0 when this customer is equal to other;
    // a positive integer when this customer is greater than other;
    // a negative integer when this customer is less than other
    public int compareCustomer(Customer other)
    { 
        int nameComp = getName().compareTo(other.getName());

        if(nameComp == 0)
        {
            return getID() - other.getID();
        }
        else
        {
            return nameComp;
        }
        /* to be implemented in part (a) */ 
    }
    
    // There may be fields, constructors, and methods that are not shown.
    private String customerName;
    private int customerID;
}
