import edu.princeton.cs.introcs.StdDraw;



public class Rectangle {

    private double height;
    private double width;

    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    public double Perimeter(){
        return(2*height + 2*width);
    }

    public double Area(){
        return(height*width);
    }

    public boolean Compare(Rectangle r){
        if (this.Area() > r.Area()){
            return true;
        } else{
            return false;
        }
    }

    public boolean Square(){
        if (this.height == this.width){
            return true;
        }
        return false; 
    }

    public void Draw(){
        StdDraw.rectangle(this.height, this.width);
    }



    public static void main(String[] args){
        Rectangle r1 = new Rectangle(5, 4);
        System.out.println(r1.Perimeter());
        System.out.println(r1.Area());
        Rectangle r2 = new Rectangle(3, 3);
        r2.Perimeter();
        r2.Area();
        System.out.println(r1.Compare(r2));
        System.out.println(r2.Square());

    }
}
