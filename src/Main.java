public class Main {
    public static void main(String[] args) {
        // Задача 1
        int sampleText = 56546565;
        System.out.println(sampleText);
        byte freeze = -40;
        System.out.println(freeze);
        short empty = 0;
        System.out.println(empty);
        long universe = 100000;
        System.out.println(universe);
        float noName = 1988;
        System.out.println(noName);
        double dowJones = 15645.44645666;
        System.out.println(dowJones);
        // Задача 2
        double exone = 27.12;
        long enormous = 987678949;
        float smth = -2.769f;
        boolean hunger = false;
        short car = 569;
        int fail = -159;
        char enon = 27897;
        byte osu = 67;
        // Задача 3
        int teach1 = 23;
        int teach2 = 27;
        int teach3 = 30;
        int sumStudent = teach1 + teach2 + teach3;
        System.out.println("Всего " + sumStudent + " учеников");
        int list = 480;
        int listPerStudent = list / sumStudent;
        System.out.println("На каждого ученика рассчитано " + listPerStudent + " листов бумаги");
        // Задача 4
        int productivityPerTwoMinutes = 16;
        int perTwentyMinutes = productivityPerTwoMinutes * 10;
        System.out.println("За 20 минут машина произвела " + perTwentyMinutes + " бутылок");
        int perDay = productivityPerTwoMinutes * 720;
        System.out.println("За сутки машина произвела " + perDay + " бутылок");
        int perThreeDays = perDay * 3;
        System.out.println("За трое суток машина произвела " + perThreeDays + " бутылок");
        int perMonth = perDay * 30;
        System.out.println("За месяц машина произвела " + perMonth + " бутьлок");
        // Задача 5
        int twoColorsCans = 120;
        int whiteColorPerClass = 2;
        int brownColorPerClass = 4;
        int sumCansPerClass = whiteColorPerClass + brownColorPerClass;
        int sumClass = twoColorsCans / sumCansPerClass;
        int whiteCansPerAll = sumClass * whiteColorPerClass;
        int brownCansPerAll = sumClass * brownColorPerClass;
        System.out.println("В школе, где " + sumClass + " классов, нужно " + whiteCansPerAll + " банок белой краски, и " + brownCansPerAll + " банок коричневой краски");
        // Задача 6
        int banana = 5;
        int weightBanana = 80;
        int weightFiveBananas = banana * weightBanana;
        int onemilk = 105;
        int portionMilk = 2;
        int weightMilk = onemilk * portionMilk;
        int iceCream = 100;
        int portionIceCream = 2;
        int weightIceCream = iceCream * portionIceCream;
        int egg = 70;
        int numEgg = 4;
        int weightEgg = egg * numEgg;
        int weightBreakfast = weightFiveBananas + weightMilk + weightIceCream + weightEgg;
        System.out.println(weightBreakfast);
        double weightKg = weightBreakfast / 1000;
        System.out.println("Общая масса завтрака составляет " + weightKg + " килограммов");
        // Задача 7
        int excessWeight = 7000;
        int weightLossOne = 250;
        int weightLossTwo = 500;
        int overallWeightLossOne = excessWeight / weightLossOne;
        System.out.println("При трате по " + weightLossOne + " граммов в день спортсмен затратит " + overallWeightLossOne + " дней");
        int overallWeightLossTwo = excessWeight / weightLossTwo;
        System.out.println("При трате по " + weightLossTwo + " граммов в день спортсмен затратит " + overallWeightLossTwo + " дней");
        // Задача 8
        int salaryMashaPerMonth = 67760;
        int salaryDenisPerMonth = 83690;
        int salaryKristinaPerMonth = 76230;
        double newSalaryOne = salaryMashaPerMonth + (salaryMashaPerMonth * 0.1);
        double newSalaryTwo = salaryDenisPerMonth + (salaryDenisPerMonth * 0.1);
        double newSalaryThree = salaryKristinaPerMonth + (salaryKristinaPerMonth * 0.1);
        int oldSalaryPerYearOne = salaryMashaPerMonth * 12;
        int oldSalaryPerYearTwo = salaryDenisPerMonth * 12;
        int oldSalaryPerYearThree = salaryKristinaPerMonth * 12;
        double newSalaryPerYearOne = newSalaryOne * 12;
        double newSalaryPerYearTwo = newSalaryTwo * 12;
        double newSalaryPerYearThree = newSalaryThree * 12;
        double differencePerYearOne = newSalaryPerYearOne - oldSalaryPerYearOne;
        double differencePerYearTwo = newSalaryPerYearTwo - oldSalaryPerYearTwo;
        double differencePerYearThree = newSalaryPerYearThree - oldSalaryPerYearThree;
        System.out.println("Маша стала получать " + newSalaryOne + " рублей в месяц, разница между её годовыми доходами составила " + differencePerYearOne + " рублей");
        System.out.println("Денис стал получать " + newSalaryTwo + " рублей в месяц, разница между её годовыми доходами составила " + differencePerYearTwo + " рублей");
        System.out.println("Кристина стала получать " + newSalaryThree + " рублей в месяц, разница между её годовыми доходами составила " + differencePerYearThree + " рублей");





























    }

}