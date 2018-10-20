package com.company;

//
//class Main {
//    public static void main(String[] args){
//        int first = 10/2;
//        System.out.println(first);
//    }
//}
////while loop
//public class Main {
//    public static void main(String[] args) {
//
//        // do something over and over
//        int count = 0;
//        while (count < 10) {
//            count = count + 1;
//            System.out.println(count);
//
//
//        }
//
//    }
//}
//command option l to align brackets

//break out of loop earlier
//public class Main {
//    public static void main(String[] args) {
//
//        // do something over and over
//        int count = 0;
//        while (count < 10) {
//            count = count + 1;
//            System.out.println(count);
//
//            if (count == 5) {
//                break;
//
//            }
//        }
//
//    }
//}
//
////dowhile loops put condition at bottom so it runs at least once
//
//public class Main {
//    public static void main(String[] args) {
//
////        do {
////            System.out.println("This will print just once, and the while loop will not run, because its condition evaluates to false.");
////        } while(false);
////
////    }
////}
//
//
////dowhile loops put condition at bottom so it runs at least once
//
//import java.sql.SQLOutput;
//import java.util.Scanner;
//
////public class Main {
////    public static void main(String[] args) {
////        Scanner newsScan;
////
////        //dpes String name = neew String("rusi"), == String name = "rusi" both init obect d
////
////        Scanner scan = new Scanner(System.in);//scanner object
////
////        System.out.println("hello name");
////        String first = scan.nextLine();
////
////        System.out.println("hello last");
////        String last = scan.nextLine();
////
////
////        System.out.println("hello " + first + " " + last);
////
////
////    }
////}
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        // getyear();
//        fave();
//    }
//
//    private static void getyear() {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("old? plz use #");
//        int age = scan.nextInt();
//        System.out.println("you were born in ");
//
//        System.out.println(2018 - age);
//    }
//
//
//    private static void fave() {
//        Scanner favenum = new Scanner(System.in);
//        System.out.println("old? plz use #");
//        int fave = 5;
//        int guess = 24; ///y do u init at 0 or 24 y is this random?
//
//        while (guess != 25) {
//            System.out.println("fave # ");
//            guess = favenum.nextInt();
//
//
//            if (guess == fave) {
//                System.out.println("correct");
//
//            } else {
//                System.out.println("try again ");
//
//            }
//
//        }
//    }
//}
//
//class Main {
//   public static void main(String[] args){
//        int count = 0;
//       while( count <= 99) {
//           System.out.println(count);
//
//           count = count +1;
//       }
//
//  }
//}

//class Main {
//    public static void main(String[] args) {
//        int count = 0;
//        while (count <= 100) {
//            if (count % 2 == 0) {
//                System.out.println(count + " even");
//
//            }
//            else{
//                System.out.println(count + " odd");
//
//
//            }
//            count = count +1;
//
//        }
//
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        int count = 1;
//        while (count <= 100) {
//
//
//              if (count % 3 == 0 && count % 5 == 0){
//                System.out.println( "Hey Hey Hey");
//
//
//            }
//            else if (count % 5 == 0) {
//                System.out.println("ney");
//
//            }
//
//            else if (count % 3 == 0){
//                System.out.println(  "yay");
//
//
//            }
//            else{
//                System.out.println(count);
//
//            }
//
//
//            count = count +1;
//
//        }
//
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        int count = 10;
//        while (count >= 0) {
//
//
//            if (count == 0) {
//                System.out.println("Blastoff");
//
//            } else {
//                System.out.println(count);
//
//            }
//
//
//            count = count - 1;
//
//
//        }
//
////    }
////}
//
//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner scanner1 = new Scanner(System.in);
//        String secretWord = "apple";
//        String userChoice;
//        do {
//            System.out.println("whats the secret word??");
//            userChoice = scanner1.nextLine();
//        }
//        while (!userChoice.equals(secretWord));
//        System.out.println("You have guessed the secret word!");
//    }
//
//}

//    }
//}

//for loops
//class Main {
//    public static void main(String[] args) {
//        for(int i = 1; i <= 100; i++) {  //increment happens bef condi check in for loops
//
//                System.out.println(i);
//
//
//        }}}
//
//class Main {
//    public static void main(String[] args) {
//for (int i = 1; i <= 20; i++) {
//        if (i % 2 == 0) {
//        continue; //skips over and just keeps going to top of the loop, doesnt print out
//        }
//        System.out.println(i);
//        }}}

//class Main {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 20; i++) {
//            if (i % 2 == 1) {
//                System.out.println(i);
//
//            }}}}  //does same thing

//class Main {
//    public static void main(String[] args) {
//for (int i = 1; i <= 19; i= i + 2) {
//      if (i % 2 == 0) {
////        continue; //skips over and just keeps going to top of the loop, doesnt print out
//        }
//       System.out.println(i);
//        }}}
//
//for loops when know when end, while when don't know

//methods- when need to run the same thing over and over again? if you see a parentheses most likely its as method .something too
//some methods are defined already and others u can define like in the prog but can only b used by u
//limits scope of where things can get messed up // ? methods are things u can reuse?
//
//class Main {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 19; i= i + 2) {
//            if (i % 2 == 0) {
//            }
//            System.out.println(i);
//
//        }}}
//class Main {
//    public static void main(String[] args) {
//        for(int i = 100; i >= 0; i--) {
//            if(i % 2 == 0){
//                System.out.println(i + " is even");
//
//            } else {
//                System.out.println(i + " is odd");
//            }
//
//        }}}

//
//class Main {
//    public static void main(String[] args) {
//        for(int i = 100; i >= 0; i--) {
//            if(i % 2 == 0){
//                System.out.println(i + " is even");
//
//            } else {
//                System.out.println(i + " is odd");
//            }
//
//        }}}




//        class Main {
//            public static void main(String[] args) {
//                printLetters("mary");
//            }
//
//            public static void printLetters(String name) {
//
//                for (int i = 0; i < name.length(); i++){
//                    System.out.println(name.charAt(i));
//                }
//            }
//        }


class Main {
    public static void main(String[] args) {
        printCapsAlphabet();
    }

    public static void printCapsAlphabet() {
        for (char i = 65; i <= 90; i++) {

            if (i == 'A' || i == 'E' || i == 'I' || i == 'O' || i == 'U') {
                System.out.println("VOWEL");

            } else {
                System.out.println(i);

            }

        }
    }
}

