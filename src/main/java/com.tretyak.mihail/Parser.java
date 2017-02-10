package com.tretyak.mihail;

public class Parser {

    public Parser() {
    }

    public int parseStr(String stringToParse) {
        int result = 0;
        int currentNumber = 0;
        stringToParse.toLowerCase();
        String[] splitArr = stringToParse.split("[ ]+");
        if (splitArr.length > 6) return -1;
        for (int i = 0; i < splitArr.length; ++i) {
            switch (splitArr[i]) {
                case "one":
                    if (currentNumber != 0) {
                        return -1;
                    }
                    currentNumber = 1;
                    break;
                case "two":
                    if (currentNumber != 0) {
                        return -1;
                    }
                    currentNumber = 2;
                    break;
                case "three":
                    if (currentNumber != 0) {
                        return -1;
                    }
                    currentNumber = 3;
                    break;
                case "four":
                    if (currentNumber != 0) {
                        return -1;
                    }
                    currentNumber = 4;
                    break;
                case "five":
                    if (currentNumber != 0) {
                        return -1;
                    }
                    currentNumber = 5;
                    break;
                case "six":
                    if (currentNumber != 0) {
                        return -1;
                    }
                    currentNumber = 6;
                    break;
                case "seven":
                    if (currentNumber != 0) {
                        return -1;
                    }
                    currentNumber = 7;
                    break;
                case "eight":
                    if (currentNumber != 0) {
                        return -1;
                    }
                    currentNumber = 8;
                    break;
                case "nine":
                    if (currentNumber != 0) {
                        return -1;
                    }
                    currentNumber = 9;
                    break;
                case "ten":
                    if (currentNumber != 0 || splitArr.length - 1 != i || result % 100 > 10) {
                        return -1;
                    }
                    return result + 10;
                case "eleven":
                    if (currentNumber != 0 || splitArr.length - 1 != i || result % 100 > 10) {
                        return -1;
                    }
                    return result + 11;
                case "twelve":
                    if (currentNumber != 0 || splitArr.length - 1 != i || result % 100 > 10) {
                        return -1;
                    }
                    return result + 12;
                case "thirteen":
                    if (currentNumber != 0 || splitArr.length - 1 != i || result % 100 > 10) {
                        return -1;
                    }
                    return result + 13;
                case "fourteen":
                    if (currentNumber != 0 || splitArr.length - 1 != i || result % 100 > 10) {
                        return -1;
                    }
                    return result + 14;
                case "fifteen":
                    if (currentNumber != 0 || splitArr.length - 1 != i || result % 100 > 10) {
                        return -1;
                    }
                    return result + 15;
                case "sixteen":
                    if (currentNumber != 0 || splitArr.length - 1 != i || result % 100 > 10) {
                        return -1;
                    }
                    return result + 16;
                case "seventeen":
                    if (currentNumber != 0 || splitArr.length - 1 != i || result % 100 > 10) {
                        return -1;
                    }
                    return result + 17;
                case "eighteen":
                    if (currentNumber != 0 || splitArr.length - 1 != i || result % 100 > 10) {
                        return -1;
                    }
                    return result + 18;
                case "nineteen":
                    if (currentNumber != 0 || splitArr.length - 1 != i || result % 100 > 10) {
                        return -1;
                    }
                    return result + 19;
                case "twenty":
                    if (currentNumber == 0 && splitArr.length - 1 == i) {
                        return result + 20;
                    }
                    if (currentNumber != 0 || splitArr.length - 2 != i) {
                        return -1;
                    }
                    result += 20;
                    break;
                case "thirty":
                    if (currentNumber == 0 && splitArr.length - 1 == i) {
                        return result + 30;
                    }
                    if (currentNumber != 0 || splitArr.length - 2 != i) {
                        return -1;
                    }
                    result += 30;
                    break;
                case "fourty":
                    if (currentNumber == 0 && splitArr.length - 1 == i) {
                        return result + 40;
                    }
                    if (currentNumber != 0 || splitArr.length - 2 != i) {
                        return -1;
                    }
                    result += 40;
                    break;
                case "fifty":
                    if (currentNumber == 0 && splitArr.length - 1 == i) {
                        return result + 50;
                    }
                    if (currentNumber != 0 || splitArr.length - 2 != i) {
                        return -1;
                    }
                    result += 50;
                    break;
                case "sixty":
                    if (currentNumber == 0 && splitArr.length - 1 == i) {
                        return result + 60;
                    }
                    if (currentNumber != 0 || splitArr.length - 2 != i) {
                        return -1;
                    }
                    result += 60;
                    break;
                case "seventy":
                    if (currentNumber == 0 && splitArr.length - 1 == i) {
                        return result + 70;
                    }
                    if (currentNumber != 0 || splitArr.length - 2 != i) {
                        return -1;
                    }
                    result += 70;
                    break;
                case "eighty":
                    if (currentNumber == 0 && splitArr.length - 1 == i) {
                        return result + 80;
                    }
                    if (currentNumber != 0 || splitArr.length - 2 != i) {
                        return -1;
                    }
                    result += 80;
                    break;
                case "ninety":
                    if (currentNumber == 0 && splitArr.length - 1 == i) {
                        return result + 90;
                    }
                    if (currentNumber != 0 || splitArr.length - 2 != i) {
                        return -1;
                    }
                    result += 90;
                    break;
                case "hundred":
                    if (currentNumber == 0 || (result % 1000 > 100)) {
                        return -1;
                    }
                    result += currentNumber * 100;
                    currentNumber = 0;
                    break;
                case "thousand":
                    if (currentNumber == 0 || result != 0) {
                        return -1;
                    }
                    result += currentNumber * 1000;
                    currentNumber = 0;
                    break;
                default:
                    return -1;
            }
        }
        result += currentNumber;
        return result;
    }
}