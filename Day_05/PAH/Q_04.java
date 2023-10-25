import java.util.*;

class Patient {
    public String id, name, age, gender, address, mob;
    public void displayData() {}
}

class In_Patient extends Patient {
    public String room, doa, dischargeDate;
    public double consulationFee, testFee, roomRent;
    public int noOfDays;
    public void displayData() {}
}

class Bill extends In_Patient {
    public String dateOfBill;
    public double totalAmount;
    
    public void displayData() {
        System.out.println("PID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Mobile Number: " + mob);
        System.out.println("Room Number: " + room);
        System.out.println("Consultation Fee: " + consulationFee);
        System.out.println("Test Fee: " + testFee);
        System.out.println("DOA: " + doa);
        System.out.println("Discharge Date: " + dischargeDate);
        System.out.println("Number of Days: " + noOfDays);
        System.out.println("Room Rent: " + roomRent);
        System.out.println("Date of bill: " + dateOfBill);
    }
    
    public double calculateTotalBillAmount() {
        return consulationFee + testFee + (noOfDays * roomRent);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Bill bill = new Bill();
        
        bill.id = sc.next();
        bill.name = sc.next();
        bill.age = sc.next();
        bill.gender = sc.next();
        bill.address = sc.next();
        bill.mob = sc.next();
        bill.room = sc.next();
        bill.consulationFee = sc.nextDouble();
        bill.testFee = sc.nextDouble();
        bill.doa = sc.next();
        bill.dischargeDate = sc.next();
        bill.noOfDays = sc.nextInt();
        bill.roomRent = sc.nextDouble();
        bill.dateOfBill = sc.next();
        
        bill.displayData();
        System.out.println("Total amount: " + bill.calculateTotalBillAmount());
    }
}