  class Shape {
        public String color = "Red";
        public boolean filled = true;

        public Shape(){

        }

        public Shape(String color, boolean filled){
            this.color = color;
            this.filled = filled;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public boolean isFilled() {
            return filled;
        }

        public void setFilled(boolean filled) {
            this.filled = filled;
        }

        @Override
        public String toString() {
            return "Shape[color=" + color + ",filled=" + filled;
        }
    }
    class Circle extends Shape{
        private double radius = 1.0;

        public Circle(){}

        public Circle(double radius){this.radius = radius;}

        public Circle(double radius , String color , boolean filled){
            super(color , filled);
            this.radius = radius;
        }

        public double getRadius(){
            return radius;
        }

        public void setRadius(double radius){
            this.radius = radius;
        }

        public double getArea(){
            return 3.14*this.radius*this.radius;
        }

        public double getPerimeter(){
            return (int)(2 * Math.PI * radius * 100) /100.0;
        }

        @Override
        public String toString() {
            return "Circle[" + super.toString() + ", radius=" + this.radius + "]";

        }
    }
    class Restangle extends Shape {
        double weight = 1.0;
        double length = 1.0;
        Restangle(){}
        Restangle(double weight , double height){
            this.weight = weight;
            this.length = height;
        }
        Restangle(double weight , double length , String color , boolean filled){
            super(color , filled);
            this.weight = weight;
            this.length = length;
        }
        double getArea(){
            return weight * length;
        }
        double getPerimeter(){
            return (weight + length)*2;
        }
        void setWeight(double weight){
            this.weight = weight;
        }
        void setLength(double length){
            this.length = length;
        }
        double getWeight(){
            return this.weight;
        }
        double getLength(){
            return this.length;
        }

        @Override
        public String toString() {
            return "Rectangle[" + super.toString() + ", width=" + this.weight + ", length=" + this.length + "]";
        }
    }
    class Square extends Restangle{
        Square(){}

        Square(double side){
            super(side , side);
        }
        Square(double side , String color , boolean filled){
            super(side ,side);
            this.filled = filled;
            this.color = color;
        }

        public double getSide(){
            return this.length;
        }

        public void setSide(double side){
            this.length = side;
            this.weight = side;
        }

        public void setWeight(double side){
            this.weight = side;
            this.length = side;
        }

        public void setLength(double side){
            this.weight = side;
            this.length = side;
        }

        @Override
        public String toString() {
            return "Square[" + super.toString() + "]";

        }
    }
    public class Main {
        public static void main(String[] args) {

            Shape shape = new Shape("red" , false);

            Circle circle = new Circle(5.5 , "red" ,false  );

            System.out.println(circle);
            System.out.println(circle.getArea());
            System.out.println(circle.getPerimeter());
            System.out.println(circle.getColor());
            System.out.println(circle.filled);
            System.out.println(circle.getRadius());
            System.out.println();

            Restangle restangle = new Restangle(3.8 , 2.5 , "green" , false);
            System.out.println(restangle);
            System.out.println(restangle.getArea());
            System.out.println(restangle.getPerimeter());
            System.out.println(restangle.getLength());
            System.out.println(restangle.getColor());
            System.out.println();

            Square square = new Square(6.6 , "black" , true);
            System.out.println(square);
            System.out.println(square.getArea());
            System.out.println(square.getColor());
            System.out.println(square.getLength());

        }}
