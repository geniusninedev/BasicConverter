package com.nineinfosys.basicconverter.Engin;

import java.util.HashMap;

/**
 * Created by Diego on 15/03/17.
 */

public class RomanConverter {

    private HashMap<Character, String> units;
    private HashMap<Character, String> dozens;
    private HashMap<Character, String> hundred;
    private HashMap<Character, String> thousand;

    private int thousandIndex;

    public RomanConverter() {
        units = new HashMap<>();
        units.put('1', "I");
        units.put('2', "II");
        units.put('3', "III");
        units.put('4', "IV");
        units.put('5', "V");
        units.put('6', "VI");
        units.put('7', "VII");
        units.put('8', "VIII");
        units.put('9', "IX");

        dozens = new HashMap<>();
        dozens.put('1', "X");
        dozens.put('2', "XX");
        dozens.put('3', "XXX");
        dozens.put('4', "XL");
        dozens.put('5', "L");
        dozens.put('6', "LX");
        dozens.put('7', "LXX");
        dozens.put('8', "LXXX");
        dozens.put('9', "XC");

        hundred = new HashMap<>();
        hundred.put('1', "C");
        hundred.put('2', "CC");
        hundred.put('3', "CCC");
        hundred.put('4', "CD");
        hundred.put('5', "D");
        hundred.put('6', "DC");
        hundred.put('7', "DCC");
        hundred.put('8', "DCCC");
        hundred.put('9', "CM");

        thousand = new HashMap<>();
        thousand.put('1', "M");
        thousand.put('2', "MM");
        thousand.put('3', "MMM");
    }

    public String numberToRoman(String input) {
        StringBuilder ret = new StringBuilder("");
        thousandIndex = 0;
        if (!input.isEmpty()) {
            for (int i = 0; i < input.length(); i++) {
                char digit = input.charAt(i);
                if (digit != '0') {
                    int countRight = input.length() - 1 - i;
                    if (countRight == 0) {
                        ret.append(units.get(digit));
                    } else if (countRight == 1) {
                        ret.append(dozens.get(digit));
                    } else if (countRight == 2) {
                        ret.append(hundred.get(digit));
                    } else if (countRight == 3) {
                        ret.append(thousand.get(digit));
                    } else if (countRight == 4) {
                        String thousandStr = thousand.get(digit);
                        thousandIndex = thousandStr.length() - 1;
                    }
                }
            }
        }
        return ret.toString();
    }

    public int getThousandIndex() {
        return thousandIndex;
    }
}
