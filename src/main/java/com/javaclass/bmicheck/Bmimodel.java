package com.javaclass.bmicheck;

public class Bmimodel {
    private double inputweight;
    private double inputheight;

        public Bmimodel(double inputweight, double inputheight){
        this.inputweight = inputweight;
        this.inputheight = inputheight;
    }

    public double getWeight() {
        return inputweight;
    }

    public double getHeight() {
        return inputheight;
    }

    public void Bmi() {
        int twiceHeight = (int) (getHeight() * getHeight());

        double myBMI = (getWeight() / twiceHeight) * 10000 ;

        if (myBMI >= 25.0){
            System.out.println("You are overweight");
        } else if (myBMI >= 18.5 && myBMI <=24.9) {
            System.out.println("Your BMI is normal");
        } else {
            System.out.println("You are under weight");
        }

        System.out.println(myBMI);

    }

    @Override
    public String toString() {
        return "BmiInputs{" +
                "inputweight=" + inputweight +
                ", inputheight=" + inputheight +
                '}';
    }
}
