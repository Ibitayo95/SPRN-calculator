import java.util.ArrayList;

public class RandomNo {

    // r prints out next pseudorandom number and adds it to stack
    static int counter = 0; // set static counter to 0
    ArrayList<Integer> randomList = new ArrayList<Integer>(); // create array list

    public RandomNo() {
        /*
         * constructor that populates array list with pseudorandom numbers (these are
         * the same as the ones produced by the C library's random() function when the
         * seed is set to 1)
         */
        randomList.add(1804289383);
        randomList.add(846930886);
        randomList.add(1681692777);
        randomList.add(1714636915);
        randomList.add(1957747793);
        randomList.add(424238335);
        randomList.add(719885386);
        randomList.add(1649760492);
        randomList.add(596516649);
        randomList.add(1189641421);
        randomList.add(1025202362);
        randomList.add(1350490027);
        randomList.add(783368690);
        randomList.add(1102520059);
        randomList.add(2044897763);
        randomList.add(1967513926);
        randomList.add(1365180540);
        randomList.add(1540383426);
        randomList.add(304089172);
        randomList.add(1303455736);
        randomList.add(35005211);
        randomList.add(521595368);
        randomList.add(294702567);
        randomList.add(1726956429);
        randomList.add(336465782);
        randomList.add(861021530);
        randomList.add(278722862);
        randomList.add(233665123);
        randomList.add(2145174067);
        randomList.add(468703135);
        randomList.add(1101513929);
        randomList.add(1801979802);
        randomList.add(1315634022);
        randomList.add(635723058);
        randomList.add(1369133069);
        randomList.add(1125898167);
        randomList.add(1059961393);
        randomList.add(2089018456);
        randomList.add(628175011);
        randomList.add(1656478042);
        randomList.add(1131176229);
        randomList.add(1653377373);
        randomList.add(859484421);
        randomList.add(1914544919);
        randomList.add(608413784);
        randomList.add(756898537);
        randomList.add(1734575198);
        randomList.add(1973594324);
        randomList.add(149798315);
        randomList.add(2038664370);
        randomList.add(1129566413);
        randomList.add(184803526);
        randomList.add(412776091);
        randomList.add(1424268980);
        randomList.add(1911759956);
        randomList.add(749241873);
        randomList.add(137806862);
        randomList.add(42999170);
        randomList.add(982906996);
        randomList.add(135497281);

    }

    public int getRandomNo() {
        // method that gets the next random number. After the 22nd value, reset counter
        // to 0 and return first number.
        int myNo = randomList.get(counter);
        if (counter == 21) {
            counter = 0;
        } else {
            counter++;
        }
        return myNo;
    }
}