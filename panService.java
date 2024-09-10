package Core_Java_mini_project1;

import java.util.HashMap;
import java.util.Map;

public class panService {
    private static Map<String , Pan> panMap = new HashMap<>();
    static {
        panMap.put("ABDJKDI5544N4" , new Pan("ABDJKDI5544N4" ,  "12323564789" , "SBI BANK" , "Stock , ELSS , FD"));
        panMap.put("EDWABCS123N6" , new Pan("EDWABCS123N6" , "988882595232" , "HDFC BANK" , "Stock FD"));
    }
    public Pan getPanByAadhaarNumber(String aadhaarNumber){
            for(Pan pan: panMap.values()){
        if(pan.getAadhaarNumber().equals(aadhaarNumber)) {
            return  pan;
        }
        }
            return null;
    }
}
