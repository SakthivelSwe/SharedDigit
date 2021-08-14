public class SharedDigit {
    public static boolean hasSharedDigit(int fNum, int sNum) {
        if((fNum < 10 || fNum > 99 )||(sNum < 10 || sNum > 99)) {
            return false;
        }
        int realsNum= sNum;
        while (fNum > 0) {
            int numADigit = fNum % 10;
            while (sNum > 0) {
                int numBDigit = sNum % 10;
                if(numADigit == numBDigit) {
                    return true;
                }
                sNum /= 10;
            }
            fNum /= 10;
            sNum = realsNum;
        }
        return false;
    }
}
