public class Main {
    public static void main(String[] args) {
        String date;
        String name1;
        String name2;
        String emotion1;
        String emotion2;
        String gerund;
        String guests;
        String place;
        String plNoun;
        String verb1;
        String verb2;
        String verb3;
        name1 = console.readLine("What is the groom's name?  ");
        name2 = console.readLine("What is the bride-to-be's name?  ");
        verb1 = console.readLine("Enter a third-person plural verb: ");
        place = console.readLine("Name a kind of place:  ");
        date = console.readLine("Enter the wedding date:  ");
        guests = console.readLine("Enter a guest's name:  ");
        verb2 = console.readLine("Enter a third-person plural verb:  ");
        emotion1 = console.readLine("Enter an emotion:  ");
        emotion2 = console.readLine("Enter another emotion:  ");
        verb3 = console.readLine("Enter an infinitive:  ");
        plNoun = console.readLine("Enter a plural noun:  ");
        gerund = console.readLine("Enter a gerund");
        System.out.printf("When %s and %s %s down the %s, on %s, %s will be there %s them. We were so %s to receive our invite. We're very %s for %s and %s and wish them many %s of %s", name1, name2, verb1, place, date, guests, verb2, verb3, emotion1, emotion2, name1, name2, plNoun, gerund);
    }
}

