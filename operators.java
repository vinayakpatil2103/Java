public class operators {
    public static void main(String[] args) {
//        Arithmetic Operators :
//                * : Multiplication
//                / : Division
//                % : Modulo
//                + : Addition
//                – : Subtraction
//
//        // Arithmetic operators on integers
//        int a = 10;
//        int b = 3;
//
//        // Arithmetic operators on Strings
//        String num1 = "15";
//        String num2 = "25";
//
//        // Convert Strings to integers
//        int a1 = Integer.parseInt(num1);
//        int b1 = Integer.parseInt(num2);
//
//        System.out.println("a + b = " + (a + b));
//        System.out.println("a - b = " + (a - b));
//        System.out.println("a * b = " + (a * b));
//        System.out.println("a / b = " + (a / b));
//        System.out.println("a % b = " + (a % b));
//        System.out.println("a1 + b1 = " + (a1 + b1));
        //********************************************************




//        ***Unary Operators:***
//        – : Unary minus
//        + : Unary plus
//        ++ : Increment operator
//        – –  : Decrement operator
//        ! : Logical not operator
//
//        // Interger declared
//        int a = 10;
//        int b = 10;
//
//        // Using unary operators
//        System.out.println("Postincrement : " + (a++));
//        System.out.println("Preincrement : " + (++a));
//
//        System.out.println("Postdecrement : " + (b--));
//        System.out.println("Predecrement : " + (--b));
        //**********************************************************





//        Assignment Operator:
//        +=, for adding the left operand with the right operand and then assigning it to the variable on the left.
//        -=, for subtracting the right operand from the left operand and then assigning it to the variable on the left.
//        *=, for multiplying the left operand with the right operand and then assigning it to the variable on the left.
//        /=, for dividing the left operand by the right operand and then assigning it to the variable on the left.
//        %=, for assigning the modulo of the left operand by the right operand and then assigning it to the variable on the left.

        // Assignment operators
//        int f = 7;
//        System.out.println("f += 3: " + (f += 3));
//        System.out.println("f -= 2: " + (f -= 2));
//        System.out.println("f *= 4: " + (f *= 4));
//        System.out.println("f /= 3: " + (f /= 3));
//        System.out.println("f %= 2: " + (f %= 2));
//        System.out.println("f &= 0b1010: " + (f &= 0b1010));
//        System.out.println("f |= 0b1100: " + (f |= 0b1100));
//        System.out.println("f ^= 0b1010: " + (f ^= 0b1010));
//        System.out.println("f <<= 2: " + (f <<= 2));
//        System.out.println("f >>= 1: " + (f >>= 1));
//        System.out.println("f >>>= 1: " + (f >>>= 1));
        //*****************************************************************





//        Relational Operators:
//                 ==, Equal to returns true if the left-hand side is equal to the right-hand side.
//                !=, Not Equal to returns true if the left-hand side is not equal to the right-hand side.
//                <, less than: returns true if the left-hand side is less than the right-hand side.
//                <=, less than or equal to returns true if the left-hand side is less than or equal to the right-hand side.
//                >, Greater than: returns true if the left-hand side is greater than the right-hand side.
//                >=, Greater than or equal to returns true if the left-hand side is greater than or equal to the right-hand side.
        // Comparison operators
//        int a = 10;
//        int b = 3;
//        int c = 5;
//
//        System.out.println("a > b: " + (a > b));
//        System.out.println("a < b: " + (a < b));
//        System.out.println("a >= b: " + (a >= b));
//        System.out.println("a <= b: " + (a <= b));
//        System.out.println("a == c: " + (a == c));
//        System.out.println("a != c: " + (a != c));
        //*************************************************************************




////        Logical Operators:
//                &&, Logical AND: returns true when both conditions are true.
//                ||, Logical OR: returns true if at least one condition is true.
//                !, Logical NOT: returns true when a condition is false and vice-versa
        // Logical operators
//        boolean x = true;
//        boolean y = false;
//
//        System.out.println("x && y: " + (x && y));
//        System.out.println("x || y: " + (x || y));
//        System.out.println("!x: " + (!x));
        //*******************************************************************************





//        Ternary Operator:
//                The ternary operator is a shorthand version of the if-else statement. It has three operands and hence the name Ternary.
//                The general format is:
//                condition ? if true : if false

//        int a = 20, b = 10, c = 30, result;
//
//        // result holds max of three
//        // numbers
//        result
//                = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
//        System.out.println("Max of three numbers = "
//                + result);
        //**************************************************************************************





//        Bitwise Operators:
//             &, Bitwise AND operator: returns bit by bit AND of input values.
//             |, Bitwise OR operator: returns bit by bit OR of input values.
//             ^, Bitwise XOR operator: returns bit-by-bit XOR of input values.
//             ~, Bitwise Complement Operator: This is a unary operator which returns the one’s complement representation of the input value, i.e., with all bits inverted.
        // Bitwise operators
//        int d = 0b1010;
//        int e = 0b1100;
//        System.out.println("d & e: " + (d & e));
//        System.out.println("d | e: " + (d | e));
//        System.out.println("d ^ e: " + (d ^ e));
//        System.out.println("~d: " + (~d));
//        System.out.println("d << 2: " + (d << 2));
//        System.out.println("e >> 1: " + (e >> 1));
//        System.out.println("e >>> 1: " + (e >>> 1));
//        //**********************************************************************************************





//        Shift Operators:
//                <<, Left shift operator: shifts the bits of the number to the left and fills 0 on voids left as a result. Similar effect as multiplying the number with some power of two.
//                >>, Signed Right shift operator: shifts the bits of the number to the right and fills 0 on voids left as a result. The leftmost bit depends on the sign of the initial number. Similar effect to dividing the number with some power of two.
//                >>>, Unsigned Right shift operator: shifts the bits of the number to the right and fills 0 on voids left as a result. The leftmost bit is set to 0.
//        int a = 10;
//
//        // using left shift
//        System.out.println("a<<1 : " + (a << 1));
//
//        // using right shift
//        System.out.println("a>>1 : " + (a >> 1));
        //*****************************************************************************************************






//        instance of operator:
//                The instance of the operator is used for type checking. It can be used to test if an object is an instance of a class, a subclass, or an interface. General format-
//                object instance of class/subclass/interface

        
//        Person obj1 = new Person();
//        Person obj2 = new Boy();
        // As obj is of type person, it is not an
        // instance of Boy or interface
//        System.out.println("obj1 instanceof Person: "
//                + (obj1 instanceof Person));
//        System.out.println("obj1 instanceof Boy: "
//                + (obj1 instanceof Boy));
//        System.out.println("obj1 instanceof MyInterface: "
//                + (obj1 instanceof MyInterface));
//
//        // Since obj2 is of type boy,
//        // whose parent class is person
//        // and it implements the interface Myinterface
//        // it is instance of all of these classes
//        System.out.println("obj2 instanceof Person: "
//                + (obj2 instanceof Person));
//        System.out.println("obj2 instanceof Boy: "
//                + (obj2 instanceof Boy));
//        System.out.println("obj2 instanceof MyInterface: "
//                + (obj2 instanceof MyInterface));
//    }
//}
//
//class Person {
//}
//
//class Boy extends Person implements MyInterface {
//}
//
//interface MyInterface {
//}
    }
}
