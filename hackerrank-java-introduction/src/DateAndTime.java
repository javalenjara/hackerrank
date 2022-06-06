import java.util.Calendar;

class DateAndTime {
    public static void main(String[] args)
    {
        System.out.println(findDay(12, 14, 2021));
    }

    public static String findDay(int month, int day, int year) {
        final String[] daysOfTheWeek = new String[] {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        Calendar givenDay = Calendar.getInstance();
        givenDay.set(year, month - 1, day);
        int numberedDay = givenDay.get(Calendar.DAY_OF_WEEK);
        return daysOfTheWeek[numberedDay - 1];
    }
}



