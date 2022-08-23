public class Main {
    public static void main(String[] args){

        // Задание 1
        int cat = 2;
        byte dog = 3;
        short mouse = 4;
        long elephant = 111l;
        double sugarWeight = 4.5;
        float saltWeight = 1.5f;
        boolean dogIsAdult = dog < 10;
        char znak = 36;
        System.out.println(dogIsAdult);

        // Задание 2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weightOfAllBoxers = boxer1 + boxer2;
        double weightFifference = boxer2 - boxer1;
        System.out.println("Общий вес боксеров " + weightOfAllBoxers);
        System.out.println("Разница в весе боксеров " + weightFifference);

        // Задание 3
        byte bananas = 5; // 1 банан = 80 гр.
        short milk = 200; // 100 мл. = 105 гр.
        byte iceCream = 2; // 1 брикет = 100 гр.
        byte egge = 4; // 1 яйцо = 70 гр.
        float allBreakfast = (float)((bananas * 80) + ((milk / 100) * 105) + (iceCream * 100) + (egge * 70)) / 1000;
        System.out.println(allBreakfast);

        // Задание 4
        byte excessWeight = 7; // 1 кг. = 1000 гр.
        short WeightInGrams = 1000 * 7;
        System.out.println("В 7 кг. " + WeightInGrams + " граммов");
        short minWeightLossPerDay = 250;
        short maxWeightLossPerDay = 500;
        int maxNumberOfDays = WeightInGrams / minWeightLossPerDay;
        System.out.println("Колличество дней для похудения, если худеть по 250 гр. в день = " + maxNumberOfDays);
        int mixNumberOfDays = WeightInGrams / maxWeightLossPerDay;
        System.out.println("Колличество дней для похудения, если худеть по 500 гр. в день = " + mixNumberOfDays);
        int averageValue = (maxNumberOfDays + mixNumberOfDays) / 2;
        System.out.println("Колличество дней для похудения для похудения " + averageValue);

        //Задание 5
        int Masha = 67760;
        int Denis = 83690;
        int Kristina = 76230;
        byte percentageOfSalaryIncrease = 10;
        int MashaSalaryIncrease = (Masha * 10) / 100;
        int DenisSalaryIncrease = (Denis * 10) / 100;
        int KristinaSalaryIncrease = (Kristina * 10) / 100;
        int MashaNewSalary = Masha + MashaSalaryIncrease;
        System.out.println("Маша теперь получает " + MashaNewSalary + " рублей. Годовой доход вырос на " + MashaSalaryIncrease + " рублей");
        int DenisNewSalary = Denis + DenisSalaryIncrease;
        System.out.println("Денис теперь получает " + DenisNewSalary + " рублей. Годовой доход вырос на " + DenisSalaryIncrease + " рублей");
        int KristinaNewSalary = Kristina + KristinaSalaryIncrease;
        System.out.println("Кристина теперь получает " + KristinaNewSalary + " рублей. Годовой доход вырос на " + KristinaSalaryIncrease + " рублей");









    }
}
