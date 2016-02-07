package lab_jdbc;

import com.toedter.calendar.JCalendar;

public class DateHandler {

    public enum Month {

        Jan("Jan"),
        Feb("Feb"),
        Mar("Mar"),
        Apr("Apr"),
        May("May"),
        Jun("Jun"),
        Jul("Jul"),
        Aug("Aug"),
        Sep("Sep"),
        Oct("Oct"),
        Nov("Nov"),
        Dec("Dec");

        private String text;

        Month(String text) {
            this.text = text;
        }

        public String getText() {
            return this.text;
        }

        public static Month fromString(String text) {
            if (text != null) {
                for (Month mon : Month.values()) {
                    if (text.equalsIgnoreCase(mon.text)) {
                        return mon;
                    }
                }
            }
            return null;
        }
    }

    static String castMonth(String month) {
        Month enumMonth = Month.fromString(month);
        ////System.out.println("wypluwam enummonth");
        ////System.out.println(enumMonth);
        //enumMonth
        String resultMonth = new String();
        switch (enumMonth) {
            case Jan:
                resultMonth = "01";
                break;
            case Feb:
                resultMonth = "02";
                break;
            case Mar:
                resultMonth = "03";
                break;
            case Apr:
                resultMonth = "04";
                break;
            case May:
                resultMonth = "05";
                break;
            case Jun:
                resultMonth = "06";
                break;
            case Jul:
                resultMonth = "07";
                break;
            case Aug:
                resultMonth = "08";
                break;
            case Sep:
                resultMonth = "09";
                break;
            case Oct:
                resultMonth = "10";
                break;
            case Nov:
                resultMonth = "11";
                break;
            case Dec:
                resultMonth = "12";
                break;
            default:
                //System.out.println("Something went wrong");
                break;
        }
        return resultMonth;
    }

    static String changeDateFormat(String date, JCalendar jCalendar) {
        String resultDate = new String();

        String tmpDate = jCalendar.getDate().toString();
        ////System.out.println(tmpDate);
        String tmpYear = tmpDate.substring(tmpDate.length() - 4, tmpDate.length());
        String tmpMonth = castMonth(tmpDate.substring(4, 7));
        String tmpDay = tmpDate.substring(8, 10);
        resultDate = "'" + tmpYear + "-" + tmpMonth + "-" + tmpDay + "'";
        ////System.out.println(tmpYear);

        ////System.out.println(tmpDay);
        return resultDate; //resultDate
    }
    
}
