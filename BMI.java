import java.util.Scanner;

public class BMI {
    static final double POUNDTOKG = 0.45359237;
    static final double INCHTOCM = 0.0254;
    private double weight;
    private double height;
    private double bmi;

    public BMI() {
    }

    public double CalculateBmi() {
        bmi = weight / (height * height);
        return bmi;
    }

    public String InterpretBmi() {
        if(bmi < 18.5){
            return "Underweight";
        } else if(bmi < 25) {
            return "Normal";
        } else if(bmi < 30) {
            return "Overweight";
        } else return "Obese";
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height * INCHTOCM;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight * POUNDTOKG;
    }

    public static void main(String[] args) {
        BMI bmi = new BMI();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weight in pounds: ");
        bmi.setWeight(input.nextDouble());
        System.out.print("Enter your height in inches: ");
        bmi.setHeight(input.nextDouble());
        input.close();
        System.out.printf("BMI is %.1f\n", bmi.CalculateBmi());
        System.out.println(bmi.InterpretBmi());
    }
}
