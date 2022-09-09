package Buoi3;

public class TriangleExam {
    public double AdgeA;
    public double AdgeB;
    public double AdgeC;

    public void Triangle(double AdgeA, double AdgeB, double AdgeC) {
        this.AdgeA = AdgeA;
        this.AdgeB = AdgeB;
        this.AdgeB = AdgeC;
    }
    public double getAdgeA() {
        return AdgeA;
    }
    public double getAdgeB() {
        return AdgeB;
    }
    public double getAdgeC() {
        return AdgeC;
    }

    public void setAdgeA(double AdgeA) {
        this.AdgeA = AdgeA;
    }

    public void setAdgeB(double AdgeB) {
        this.AdgeB = AdgeB;
    }

    public void setAdgeC(double AdgeC) {
        this.AdgeC = AdgeC;
    }
    public float Perimeter() {
        return (float) (AdgeA + AdgeB + AdgeC);
    }
}
