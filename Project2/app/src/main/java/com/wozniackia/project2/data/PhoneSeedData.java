package com.wozniackia.project2.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PhoneSeedData {
    public final static List<Phone> phoneList = new ArrayList<>(
            Arrays.asList(
                    new Phone(
                            "Xiaomi",
                            "Xiaomi 13 Pro",
                            1,
                            "https://www.mi.com/pl/product/xiaomi-13-pro/"),
                    new Phone(
                            "Xiaomi",
                            "Xiaomi 12T",
                            2,
                            "https://www.mi.com/pl/product/xiaomi-12t/"),
                    new Phone(
                            "Xiaomi",
                            "Redmi Note 12 Pro+ 5G",
                            3,
                            "https://www.mi.com/pl/product/redmi-note-12-pro-plus-5g/")
            ));
}
