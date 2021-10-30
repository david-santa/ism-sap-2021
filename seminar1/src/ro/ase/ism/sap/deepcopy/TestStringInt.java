package ro.ase.ism.sap.deepcopy;

public class TestStringInt {
    public static class Account{
        String username;
        String password;
    }


    public static void main(String[] args) {

        Account aliceAcc = new Account();
        Account johnAcc = new Account();

        String fileName = "myPasswords.txt";
        String anotherFile = "myPasswords.txt";

        //here you check references
        if(fileName == anotherFile){
            System.out.println("We found it !");
        }
        else{
            System.out.println("It's different !");
        }

        //here you compare content
        if(fileName.equals(anotherFile)){
            System.out.println("We found it !");
        }
        else{
            System.out.println("It's different !");
        }

        int aIntValue = 23;
        Integer aIntObject = aIntValue;
        int initialValue = aIntObject;

        System.out.println("Initial int value is " + initialValue);

        //small integers up to 127 are managed as Strings
        Integer smallInt = 12;
        Integer anotherSmallInt = 12;

        if(smallInt == anotherSmallInt){
            System.out.println("The 2 int values are the same");
        }
        else{
            System.out.println("They are different");
        }

        if(smallInt.equals(anotherSmallInt)){
            System.out.println("The 2 int values are the same");
        }
        else{
            System.out.println("They are different");
        }

        String message = "Hello";
        String message2 = message;

        message2 = "Bye";

        message2 = "This " + "is " + "a " + "message";
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("This ").append("is ").append("a ").append("message");
        message2 = stringBuffer.toString();
        System.out.println(message2);
    }
}
