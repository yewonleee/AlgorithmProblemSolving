package pps_10;

//https://leetcode.com/problems/add-binary/

public class PPS_10_6 {
	public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            carry = sum / 2;
            res.insert(0, String.valueOf(sum % 2));
        }

        if (carry == 1) res.insert(0, '1');
        return res.toString();
    }
}
