public class Task {
  //put your task here
    public static void main(String[] args) {
//
        System.out.println(binToDec("110101"));
        System.out.println(decToBin(53));
    }
    public static int binToDec(String binary) {
        String[] strArr = binary.split(""); // initiates array
        if (strArr.length == 1) { // case to stop recursion
//            return (Integer.parseInt(strArr[0])) * (int) Math.pow(2, (0));
            return 1;
        } else if (strArr.length == 0) { // if the length is 0 return 0
            return 0;
        }
//        (Integer.parseInt(arr[strArr.length - 1])) * (int) Math.pow(2,((arr.length - 1) - strArr.length - 1));
        String str = ""; // starts string off with nothing
        for (int i = 1; i < strArr.length; i++) { // loops from the second index and goes until the end of the array
            str += strArr[i]; // adds that index to the string
        }
        return ((Integer.parseInt(strArr[0])) * (int) Math.pow(2,(strArr.length - 1))) + binToDec(str); // finds the 1 or 0 in the index, multiplies it by 2 ^ the length of the array. then uses recursion to fdo it again
//        (Integer.parseInt(strArr[0]));

    }
    public static String decToBin(int decimal) { // started to try and code decimal to binary but got stuck looping back through the array so that each time you hit an index that cannot be used, and add a 0 to the string
        if (decimal == 1) {
            return "1";
        }
        String str = ""; // starts str with nothing
        for (int i = 2; i > 0; i = i * 2) { // loop from 2 to infinity going up by factors of 2
            if (i > decimal && i < (decimal + i/2)) { // decimal + i * 2 // if decimal is bigger than the last loop but larger than i
                return String.valueOf(decToBin(decimal - i/2)) + str + "1"; // returns 1 plus the recursion
            } else {
                str += "0"; // if not, add 0
            }
        }
//        for (int i = decimal; i > 0; i = i--) {
//
//        }
        return "";
    }
}

// my testing for creating the binary to decimal with iteration
// int base10 = 0;
////        for (int i = 0; i < arr.length; i++) {
////            base10 += (Integer.parseInt(arr[i])) * (int) Math.pow(2,((arr.length - 1) - i)); // multiplies the current index of the array (1 or 0) and 2 to the power of the index counting down from the top of the array
//////            System.out.println(base10 + " = " + arr[i] + " * 2 ^ " + ((arr.length - 1) - i) + " = " + base10 + " * " + (2^((arr.length - 1) - i)));
//////            int[] strArr = {Integer.parseInt(arr[i]), (arr.length - 1), ((arr.length - 1) - i)};
////
////        }
//////        for (int i = arr.length - 1; i > -1; i--) {
//////            base10 += Integer.parseInt(arr[arr.length - i]) * 2^i;
//////        }
////        System.out.println(base10);
