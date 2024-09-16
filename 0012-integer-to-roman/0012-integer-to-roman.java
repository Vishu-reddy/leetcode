class Solution {
    public String intToRoman(int num) {
        String[] m={"","M","MM","MMM"};
        String[] c={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] x={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] i={"","I","II","III","IV","V","VI","VII","VIII","IX"};
        StringBuilder str = new StringBuilder();
        str.append(m[num / 1000]);
        str.append(c[(num % 1000) / 100]);
        str.append(x[(num % 100) / 10]);
        str.append(i[num % 10]);
        return str.toString();
    }
}