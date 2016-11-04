package wzorceProjektowe.strategia.ImplLatanie;

import wzorceProjektowe.strategia.LatanieInterefejs;

/**
 * Created by kkramarz on 28.07.16.
 */
public class LatamBoMamSkrzydla implements LatanieInterefejs {

    public void lec(){

        int month = 45;
        String monthString="nic";
        switch (month) {
            case 1:  monthString = "January";
                break;
            case 2:  monthString = "February";
                break;
            case 3:  monthString = "March";
                break;
            case 4:  monthString = "April";
                break;
            case 5:  monthString = "May";
                break;
            case 6:  monthString = "June";
                break;
            case 7:  monthString = "July";
                break;
            case 8:  monthString = "August";
                break;
            case 9:  monthString = "September";
                break;
            case 10: monthString = "October";
                break;
            case 11: monthString = "November";
                break;
            case 12: monthString = "December";
                break;

        }

    System.out.println("Mam skrzydla i latam!! :)");


    }

}
