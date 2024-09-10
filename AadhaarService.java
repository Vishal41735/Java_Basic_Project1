package Core_Java_mini_project1;

import java.util.HashMap;
import java.util.Map;

public class AadhaarService {
    private static Map<String, Aadhar> aadhaarMap = new HashMap<>();

    static {
        aadhaarMap.put("12323564789", new Aadhar("12323564789", "Vishal", "Mr Mahesh", "Aagra"));
        aadhaarMap.put("988882595232", new Aadhar("988882595232" , "Aditya" , "Mr Arvind" , "Bihar"));
    }

     public Aadhar getAadhaarByNumber (String aadhaarNumber){
        return aadhaarMap.get(aadhaarNumber);
     }
}
