package Ray.Andy;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("float min value " + myMinFloatValue);
        System.out.println("float max value " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("double min value " + myMinDoubleValue);
        System.out.println("double max value " + myMaxDoubleValue);


//        int myInvValue = 5;
//        float myFloatValue = 5f;
//        double myDoubleValue = 5d;
//
//        System.out.println("MyIntValue= " + myInvValue);
//        System.out.println("MyFloatValue= " + myFloatValue);
//        System.out.println("MyDoubleValue= " + myDoubleValue);


//        int myInvValue = 5 / 2;
//        float myFloatValue = 5f / 2f;
//        double myDoubleValue = 5d / 2d;
//
//        System.out.println("MyIntValue= " + myInvValue);
//        System.out.println("MyFloatValue= " + myFloatValue);
//        System.out.println("MyDoubleValue= " + myDoubleValue);

        int myInvValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;

        System.out.println("MyIntValue= " + myInvValue);
        System.out.println("MyFloatValue= " + myFloatValue);
        System.out.println("MyDoubleValue= " + myDoubleValue);


        //Challenge
        double ratio = 0.45359237;
        double numberPounds = 7;
        double convertedKg = numberPounds * ratio;
        System.out.println(convertedKg);









    }
}
