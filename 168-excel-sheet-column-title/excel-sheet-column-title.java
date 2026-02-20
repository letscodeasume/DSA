class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder str = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;

            int remainder = columnNumber % 26;
            char ch = (char) (remainder + 'A');
            str.append(ch);
            columnNumber /= 26;

        }
        return str.reverse().toString();
    }
}