package com.kodilla.good.patterns.challenge2;

import java.util.HashMap;

public class BuyersUtility {
    public static HashMap<String, Buyer> generateBuyersMap() {

        HashMap<String, Buyer> buyersMap = new HashMap<>();

        buyersMap.put("JoaKam", new Buyer("JoaKam", "Joanna Kamienik", "111222333", "joakam@costam.cos"));
        buyersMap.put("Vera8", new Buyer("Vera8", "Weronika Kowalska", "444555666", "vera@costam.cos"));
        buyersMap.put("Milko", new Buyer("Milko", "Adam Milkoszynski", "777888999", "a.milko@costam.cos"));
        buyersMap.put("XYZ", new Buyer("XYZ", "Jan Wojcik", "000111222", "xyz@costam.cos"));

        return buyersMap;
    }
}
