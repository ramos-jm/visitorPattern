package SoftEng2.visitorPattern;

import java.util.*;

public class TelcoAllowance implements UsagePromo {
    private static final Map<String, Integer> allowanceMap = new HashMap<>();

    static {
        allowanceMap.put("Smart", 15);
        allowanceMap.put("Globe", 10);
        allowanceMap.put("Ditto", 8);
    }

    @Override
    public String showAllowance(String telcoName, double promoPrice) {
        Integer dataAllowance = allowanceMap.getOrDefault(telcoName, 0);
        String allowance = new String();
        allowance += dataAllowance+ "GB of Data by "+ telcoName + " for ₱"+ promoPrice;
        return allowance;
    }
}