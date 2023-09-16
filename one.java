abstract class Geomentry{
    static final double PI = 3.1414592;
    public abstract double area();
    public abstract double circumference();
}


class circle extends Geomentry{
    public double r;
    public circle(double r) {
        this.r = r;
    }
    public double circumference(){
        return 2*PI*r;
    }
    public double area(){
        return PI*r*r;
    }
}



class rectangle extends Geomentry{
    protected double l,w;
    public rectangle(double l,double w){
        this.l = l;
        this.w = w;
    }

    public double area(){
        return l*w;
    }
    public double circumference(){
        return 2*(l+w);
    }
}


class  ellipse extends Geomentry{
    protected double a,b;

    public ellipse(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double area(){
        return PI*a*b;
    }

    public double circumference(){
        return PI*(a*b);
    }
}



public class one {
    public static void main(String[] args)
    {
        Geomentry [] geo = new Geomentry[3];
        geo[0] = new circle(2.6);
        geo[1] = new rectangle(1.0, 3.0);
        geo[2] = new ellipse(4.0,2.0);
        double total = 0.0;
        for (int i = 0; i < geo.length; i++){
            total += geo[i].area();
        }
        System.out.println(total);
    }
}
