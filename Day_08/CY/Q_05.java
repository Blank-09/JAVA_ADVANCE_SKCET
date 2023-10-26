import java.util.*;

class DuplicateMobileNumberException extends Exception {
    @Override
    public String toString() {
        return "DuplicateMobileNumberException: Mobile number and alternate mobile number are same"; 
    }
}

class ContactDetail {
    private String mobile, alternateMobile, landLine, email, address;
    
    ContactDetail(String mobile, String alternateMobile, String landLine, String email, String address) {
        this.mobile = mobile;
        this.alternateMobile = alternateMobile;
        this.landLine = landLine;
        this.email = email;
        this.address = address;
    }

    @Override
    public String toString() {
        return (
            "Mobile: " +  mobile + "\n" +
            "Alternate mobile: " + alternateMobile + "\n" +
            "LandLine: " + landLine + "\n" +
            "Email: " + email + "\n" +
            "Address: " + address
        );
    }
}

public class Main {
    
    static void validate(String mobile, String alternateMobile) throws Exception {
        if (mobile.equals(alternateMobile)) {
            throw new DuplicateMobileNumberException();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] data = sc.nextLine().split(",");
        
        ContactDetail cd = new ContactDetail(data[0], data[1], data[2], data[3], data[4]);
        
        try {
            validate(data[0], data[1]);
            System.out.println(cd);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        System.out.println();
        sc.close();
    }
}