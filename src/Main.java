public class Main {
    public static void main(String[] args) {
        //задание 1
        int myInt = 1876456342;
        System.out.println("Значение переменной myInt с типом int равно" + myInt);
        byte myByte = -14;
        System.out.println("значение переменной myByte с типом byte равно" + myByte);
        short myShort = -12127;
        System.out.println("значение переменной myShort с типом short равно" + myShort);
        long myLong = 378645656;
        System.out.println("значение переменной myLong с типом long равно" + myLong);
        float myFloat = 5.228f;
        System.out.println("значение переменной myFloat с типом float равно" + myFloat);
        double myDouble = 1.234543;
        System.out.println("значение переменной myDouble с типом double равно" + myDouble);
        //задание 2
        float firstFlot = 27.12f;
        long firstLong = 987678965549L;
        double firstDouble = 2.786;
        short firstShort = 569;
        int firstInt = -159;
        short firstShortTwo = 27897;
        byte firstByte = 67;
        //задание 3
        int firstClass = 23;
        int secondClass = 27;
        int threeClass = 30;
        int paper = 480;
        System.out.println("на каждого ученика рассчитано" + paper / (firstClass + secondClass + threeClass));
        //задание 4
        int bottles = 16;
        int time = 2;
        int oneMinute = bottles / time;
        int twentyMinutes = 20 * oneMinute;
        System.out.println("за 20 минут машина произведет" + twentyMinutes + "штук бутылок");
        int day = 24 * 60 * oneMinute;
        System.out.println("за сутки машина произведет" + day + "штук бутылок");
        int threeDays = day * 3;
        System.out.println("за 3 дня машина произведет" + threeDays + "штук бутылок");
        int oneMonth = 31 * day;
        System.out.println("за месяц 31день, машина произведет" + oneMonth + "штук бутыло");
        //задача 5
        byte totalClasses = 120 / 6;
        int whitePaint = totalClasses * 2;
        int brownPaint = totalClasses * 4;
        System.out.println("В школе,где" + totalClasses + "классов,нужно" + whitePaint + "банок белой краски и" + brownPaint + "банок коричневой");
        // задача 6
        short banana = 5 * 80;
        short milk = 100 * 105 * 2;
        short iceCream = 2 * 100;
        short eggs = 4 * 70;
        int grams = banana + milk + iceCream + eggs;
        float kilograms = grams / 1000f;
        System.out.println("вес завтрака в граммах" + grams + "вес завтрака в килограммах" + kilograms);
        //задача 7
        int totalWeight = 7 * 1000;
        int a = totalWeight / 250;
        int b = totalWeight / 500;
        System.out.println("спортсмен похудеет за" + a + "дней, если будет худеть по 250грамм в день и за" + b + "дней,если буднт худеть по 500 грамм");
        //задача 8
        int masha=67760;
        int denis=83690;
        int kristina=76230;
        long salaryMasha=(masha*10/100)+masha;
        long salaryDenis=(denis*10/100)+denis;
        long salaryKrisyina=(kristina*10/100)+kristina;
        System.out.println("зарплата Маши после повышения"+salaryMasha);
        System.out.println("зарплата Дениса после повышения"+salaryDenis);
        System.out.println("зарплата Кристины после повышения"+salaryKrisyina);
        long differenceMasha=(salaryMasha*12)-(masha*12);
        long differenceDenis=(salaryDenis*12)-(denis*12);
        long differenceKristina=(salaryKrisyina*12)-(kristina*12);
        System.out.println("разница в зарплате Маши равна"+differenceMasha);
        System.out.println("разница в зарплате Дениса равна"+differenceDenis);
        System.out.println("разница в зарплате Кристины равнв"+differenceKristina);

    }
}