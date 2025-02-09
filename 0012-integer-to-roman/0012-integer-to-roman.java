class Solution {
    public static String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        int octet = 1;

        while (num > 0) {
            StringBuilder token = new StringBuilder();
            int lastNum = num % 10;
            num /= 10;

            switch (octet) {
                case 1:
                    if (lastNum == 4) {
                        token.append("IV");
                    } else if (lastNum == 9) {
                        token.append("IX");
                    } else {
                        if (lastNum >= 5) {
                            token.append("V");
                            lastNum -= 5;
                        }
                        token.append("I".repeat(lastNum));
                    }
                    sb.insert(0, token);
                    break;

                case 2:
                    if (lastNum == 4) {
                        token.append("XL");
                    } else if (lastNum == 9) {
                        token.append("XC");
                    } else {
                        if (lastNum >= 5) {
                            token.append("L");
                            lastNum -= 5;
                        }
                        token.append("X".repeat(lastNum));
                    }
                    sb.insert(0, token);
                    break;

                case 3:
                    if (lastNum == 4) {
                        token.append("CD");
                    } else if (lastNum == 9) {
                        token.append("CM");
                    } else {
                        if (lastNum >= 5) {
                            token.append("D");
                            lastNum -= 5;
                        }
                        token.append("C".repeat(lastNum));
                    }
                    sb.insert(0, token);
                    break;

                case 4:
                    token.append("M".repeat(lastNum));
                    sb.insert(0, token);
                    break;
            }

            octet += 1;
        }
        return sb.toString();
    }
}