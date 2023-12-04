public class Oops{
    public static void main(String[] args) {
        Student s1 = new Student("Moin",19,new Address("Abdul hakim Chowk","400055"));
        s1.getStudentDetails();
        s1.setMark(89, 82, 91);
        int marks[] = s1.getMark();
        for (int i : marks) {
            System.out.print(i+" ");
        }
        System.out.println("Percentage is "+s1.getPercentage(marks));

    }
}

class Address{
    String streetName;
    String pincode;

    Address(String sn,String pc){
        this.streetName = sn;
        this.pincode = pc;
    }
}

class Student{
    private String name;
    private int age;
    int mark[] = new int[3];
    private Address address;

    Student(String name,int age,Address address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    void getStudentDetails(){
        System.out.println("My name is "+ this.name+" I am "+ this.age+" years old!");
        System.out.println("StreetName "+ this.address.streetName + " and Pincode is "+ this.address.pincode );
    }

    void setMark(int sci,int phy,int chem){
        this.mark[0] = sci;
        this.mark[1] = phy;
        this.mark[2] = chem;
    }

    int[] getMark(){
        return this.mark;
    }

    int getPercentage(int mark[]){
        return (this.mark[0] + this.mark[1] + this.mark[2]) / 3;
    }
    
}