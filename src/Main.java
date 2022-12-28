public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        String name = "Sigitas";
        String surname = "Siriukaitis";
        System.out.println("As esu " + name + " " + surname);

        int birth = 1987;
        int year = 2022;
        int age = (year - birth);
        System.out.println("As esu " + name + " " + surname + ". Man yra " + age + " metai");

//==============2 ==============

        int a = (int) (Math.round(Math.random() * 4));
        int b = (int) (Math.round(Math.random() * 4));


        System.out.println(a + " " + b);

        if (a != 0 && b != 0) {
            if (a > b) {
                System.out.println(a + "yra didesnis uz" + b);
                double notRounded = (double) a / b;
                System.out.println(notRounded);
                System.out.println(Math.round(notRounded + 100) / 100.0);
            } else {
                System.out.println(a + "yra mazesnis uz" + b);
                double notRounded = (double) b / a;
                System.out.println(notRounded);
                System.out.println(Math.round(notRounded + 100) / 100.0);

            }
        } else {
            System.out.println("dalyba is nuio negalima");
        }

//==========================3 uzd=========

        int num1 = (int) (Math.round(Math.random() * 25));
        int num2 = (int) (Math.round(Math.random() * 25));
        int num3 = (int) (Math.round(Math.random() * 25));


        System.out.println(num1 + " " + num2 + " " + num3);
        if ((num1 > num2 && num1 < num3) || (num1 < num2 && num1 > num3)) {
            System.out.println(num1 + " yra vidurinis skaicius");
        }
        if ((num2 > num1 && num2 < num3) || (num2 < num1 && num2 > num3)) {
            System.out.println(num2 + " yra vidurinis skaicius");
        }
        if ((num3 > num1 && num3 < num2) || (num3 < num1 && num3 > num2)) {
            System.out.println(num3 + " yra vidurinis skaicius");
        } else if ((num1 == num2 || num1 == num3 || num2 == num3)) {
            System.out.println("du arba visi trys vienodi skaiciai");


        }

//=======================4uzd=================

        int sideA = (int) (Math.round(Math.random() * 9) + 1);
        int sideB = (int) (Math.round(Math.random() * 9) + 1);
        int sideC = (int) (Math.round(Math.random() * 9) + 1);

        System.out.println(sideA + " " + sideB + " " + sideC);
        if (sideA + sideB < sideC || sideA + sideC < sideB || sideB + sideC < sideA) {
            System.out.println("Negalima sudaryti trikampio");
        } else {
            System.out.println("Galima sudaryti trikampi");
        }

        //=============== 5 uzduotis==============

        int numQ = (int) (Math.round(Math.random() * 2));
        int numW = (int) (Math.round(Math.random() * 2));
        int numE = (int) (Math.round(Math.random() * 2));
        int numR = (int) (Math.round(Math.random() * 2));

        System.out.println(numQ + " " + numW + " " + numE + " " + numR);

        int zeros = 0;

        if (numQ == 0) {
            zeros++;
        }

        if (numW == 0) {
            zeros++;
        }

        if (numE == 0) {
            zeros++;
        }

        if (numR == 0) {
            zeros++;
        }

        int ones = 0;

        if (numQ == 1) {
            ones++;
        }

        if (numW == 1) {
            ones++;
        }

        if (numE == 1) {
            ones++;
        }

        if (numR == 1) {
            ones++;
        }

        int twos = 0;

        if (numQ == 2) {
            twos++;
        }

        if (numW == 2) {
            twos++;
        }

        if (numE == 2) {
            twos++;
        }

        if (numR == 2) {
            twos++;
        }

        System.out.println("Nuliu yra " + zeros + ". Vienetu yra " + ones + ". Dvejetu yra " + twos);


//       int sk = 0;
//        sk = sk + 10;
//        sk += 10;
//        sk++;
//
//
//        sk = sk - 3;
//        sk -= 3;
//        sk--;


        ////===========6uzduotis==============

        int numZ = (int) (Math.round(Math.random() * 20) + -10);
        int numX = (int) (Math.round(Math.random() * 20) + -10);
        int numC = (int) (Math.round(Math.random() * 20) + -10);

        System.out.println(numZ + " " + numX + " " + numC);

        if (numZ < 0) {
            System.out.println("[" + numZ + "]");
        } else if (numZ == 0) {
            System.out.println("(" + numZ + ")");
        } else if (numZ > 0) {
            System.out.println("{" + numZ + "}");
        }

        if (numX < 0) {
            System.out.println("[" + numX + "]");
        } else if (numX == 0) {
            System.out.println("(" + numX + ")");
        } else if (numX > 0) {
            System.out.println("{" + numX + "}");
        }

        if (numC < 0) {
            System.out.println("[" + numC + "]");
        } else if (numC == 0) {
            System.out.println("(" + numC + ")");
        } else if (numC > 0) {
            System.out.println("{" + numC + "}");
        }



//        System.out.print("[" + numZ + "]");
//        System.out.print("[" + numZ + "]");
//        System.out.print("[" + numZ + "]");
//        System.out.print("[" + numZ + "]");

       //========== 7 uzd =========================

        int candles = (int) (Math.round(Math.random() * 2995) + 5);

        System.out.println(candles);


        candles = 2991;

        int price= candles;
        System.out.println(price);
        if ( candles < 1000){
            System.out.println(price);
        }
        if (candles > 1000 && candles < 2000){
            System.out.println( Math.round(  price*0.97  * 100)/100.0  );

        }
        if (candles > 2000){
            System.out.println( Math.round(  price*0.96  * 100)/100.0  );

        }
            /*
            candles = 1418;
            ar pirkta maziau nei 1k?
            ar pirkta daugiau nei 1k bet maziau nei 2k - jei taip skaiciuoju kaina su nuolaida 3%
             ar pirkta daugiau nei 2k? -jei taip skaiciuoju kaina su nuolaida 4%


             */

//==============8 uzd===================
        int numV = (int) (Math.round(Math.random() * 100));
        int numB = (int) (Math.round(Math.random() * 100));
        int numN = (int) (Math.round(Math.random() * 100));


        System.out.println(numV + " " + numB + " " + numN);

        int average = (numV+numB+numN)/3;
        System.out.println(average);

        int average2 = (numV+numB+numN)/3;
        if (numV > 10 && numV < 90 && numB > 10 && numB < 90 && numN > 10 && numN > 90 ){
            System.out.println(average2);
        }

       // git config //
      //  --global user.name "ssiriukaitis"
      //  git config --global user.email "sigitas.siriukaitis@gmail.com"












    }
}