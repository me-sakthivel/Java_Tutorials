interface GeoAnalizer{
    final static float pi = 3.14f;
    float area();
    float perimeter(); 
}
class Circle implements GeoAnalizer{
    float radius;
    Circle(float r){
        radius = r;
    }
    public float area(){
        return pi * radius * radius;
    }

    public float perimeter() {
        return 2*pi*radius;
    }

}

class Ellipse implements GeoAnalizer{
    float major, minor;
    Ellipse(float major, float minor){
        this.major = major;
        this.minor = minor;
    }
    public float area(){
        return pi * major * minor;
    }

    public float perimeter() {
        return 2*pi*(major + minor);
    }
}

public class two {
    static void display(float x, float y){
        System.out.println(x + " " + y);
    }

    public static void main(String[] args){
        Circle c = new Circle(5.2f);
        Ellipse e = new Ellipse(4.5f,3.6f);
        GeoAnalizer geo;
        geo = c;
        display(geo.area(), geo.perimeter());
        geo = e;
        display(geo.area(), geo.perimeter());

    }
}
