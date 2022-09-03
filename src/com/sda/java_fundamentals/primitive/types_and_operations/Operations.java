package com.sda.java_fundamentals.primitive.types_and_operations;

public class Operations {


    public static void main(String[] args) {
        //data data types
        final int localVariable = 10;

        System.out.println("variabila locala: " + localVariable);

        byte myFirstByte = 7;
        System.out.println("my first byte: " + myFirstByte);

        byte mySecondByte = (byte) 256;
        System.out.println("my second byte: " + mySecondByte);

        short myFirstShort = (short) 32768;
        System.out.println("my first short: " + myFirstShort);

        int myFirstInt = (int) 2147483648L;
        System.out.println("my first int: " + myFirstInt);

        long myFirstLong = 21474836480L;
        System.out.println("my first long: " + myFirstLong);

        float myFirstFloat = 2.147483F;
        System.out.println("my first float: " + myFirstFloat);

        double myFirstDouble = 2.147000048360048;
        System.out.println("my first double: " + myFirstDouble);

        double mySecondDouble = 10.9;
        System.out.println("my second double: " + mySecondDouble);

        //boolean data type - se denumeste ca o conditie "areAllStudentsPresent"
        boolean myFirstBoolean = true; //can be true or false
        System.out.println("my first boolean: " + myFirstBoolean);

        //char data type
        char myFirstChar = 'a'; //fiecare caracter are o valoare in tabel ASCII in decimal si hex/oct
        System.out.println("my first char: " + myFirstChar);

        char charAsInt = 97;
        System.out.println("my first char: " + charAsInt);

        char tab = '\t';
        char enter = '\n';
        System.out.print("test0" + '\n');
        System.out.println("test1" + tab + "test2" + enter +  "test3");

        //string data type - este primul obiect pe care-l folosim
        String myString = "Ana are mere";
        System.out.println("my first \t string: " + myString);


        //simple operations

        int firstNumber = 9;
        int secondNumber = 3;
        int sum = firstNumber + secondNumber;
        System.out.println(sum);
        int difference = firstNumber - secondNumber;
        System.out.println(difference);
        int multiplication = firstNumber * secondNumber;
        System.out.println(multiplication);
        int devided = firstNumber / secondNumber;
        System.out.println(devided);
        int secondDevided = secondNumber / firstNumber;
        System.out.println(secondDevided);
        int rest = 10 % 4;
        System.out.println("rest: " + rest);

        float secondMultiplication = 3F * 5.5F;
        System.out.println("second multiplication: " + secondMultiplication);
        float thirdDevided = 3f / 7f;
        System.out.println("third devided: " + thirdDevided);

        // shorter operation and assignment
        int counter = 0;
        System.out.println("counter " + counter);
        counter = counter + 1;
        System.out.println("counter " + counter);
        counter = counter + 1;
        System.out.println("counter " + counter);
        counter += 1;
        System.out.println("counter " + counter);
        counter -= 1;
        System.out.println("counter " + counter);
        counter *= 2; // counter = counter * 2
        System.out.println("counter " + counter);
        counter /= 2;
        System.out.println("counter " + counter);
        System.out.println(" ");

        //incrementing
        int secondCounter = 0;
        secondCounter = secondCounter + 1; //sepoate adauga oricat
        secondCounter += 1; //se paote dauga oricat
        secondCounter++; //mereu cu 1
        System.out.println("second counter " + secondCounter);

        //decrementing
        secondCounter = secondCounter - 1;
        secondCounter -= 1;
        secondCounter--;
        System.out.println("second counter " + secondCounter);
        System.out.println("-----------------");

        int number = 0;
        System.out.println(number++);
        //number = 0
        //printeaza valoarea lui number, number = 0;
        //incrementeaza number. number = 1;
        System.out.println(++number);
        //numar = 1
        //incrementeaza number, number =2 si apoi printeaza valoare alui number
        System.out.println(number);
        System.out.println(' ');
        System.out.println("-----------------");
        System.out.println(' ');

        //compare operations
        int a = 100;
        int b = 200;
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(' ');
        b = 100;
        System.out.println(a == b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(' ');
        System.out.println("-----------------");

        int c = 100;
        int d = 101;
        System.out.println(c != d);
        System.out.println((c == d));
        System.out.println(!(c == d));
        System.out.println(' ');
        //negare variabila booleana
        boolean myFirstBool = true;
        System.out.println("my first Bool: " + !myFirstBool);
        boolean mySecondBool = false;
        System.out.println("my first Bool: " + !mySecondBool);
        System.out.println(' ');
        System.out.println("-----------------");

        //logical operators
        //logic AND
        boolean isPersonOver18 = true;
        boolean isPersonNotDriving = false;
        boolean canConsumeAlchol = isPersonOver18 && isPersonNotDriving;
        System.out.println(canConsumeAlchol);
        System.out.println(' ');

        //logic OR
        boolean isPersonAdult = false;
        boolean isWithParent = false;
        boolean canPersonWatchMovieOver12 = isPersonAdult || isWithParent;
        System.out.println(canPersonWatchMovieOver12);
        System.out.println(' ');
        System.out.println("-----------------");

        //exemplu
        if (canPersonWatchMovieOver12){
            System.out.println("He can watch the movie");
        }else {
            System.out.println("He can NOT watch the movie");
        }

        System.out.println(' ');
        System.out.println("-----------------");
        System.out.println(' ');
        System.out.println(' ');
        System.out.println(' ');

        //Conditional statement
        if (canPersonWatchMovieOver12){
            System.out.println("He can watch the movie");
        }

    }
}