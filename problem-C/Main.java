public class Main {

public static void main(String[] args) {
        Person p1 = new Person("Azat", "sdu");
        Student s1 = new Student();
        System.out.println(p1);

        }
}

class Person{
         String name;
         String address;

         public Person(){

         }
         public Person(String name, String address){
                this.name = name;
                this.address = address;
         }

        public String getName() {
                return name;
        }

        public void setAddress(String address) {
                this.address = address;
        }
        public String toString(){
                 return "Person[name="+ this.name + ",address=" + this.address + "]";
        }
}

class Student extends Person{
        private String program;
        private int year;
        private double fee;

        public Student(){
        }
        public Student(String name, String address, String program, int year, double fee){
                super(name,address);
                this.name = name;
                this.address = address;
                this.program = program;
                this.year = year;
                this.fee = fee;
        }

        public String getProgram() {
                return program;
        }

        public void setProgram(String program) {
                this.program = program;
        }

        public int getYear() {
                return year;
        }

        public void setYear(int year) {
                this.year = year;
        }

        public double getFee() {
                return fee;
        }

        public void setFee(double fee) {
                this.fee = fee;
        }
        @Override
        public String toString(){
                return "Student[" + super.toString() + ",program=" + this.program + ",year=" + this.year + ",fee=" +this.fee+"]";
        }
}

class Staff extends Person{
        private String school;
        private double pay;

        public Staff(){

        }
        public Staff(String name, String address, String school, double pay){
                super(name,address);
                this.name = name;
                this.address = address;
                this.school = school;
                this.pay = pay;
        }

        public String getSchool() {
                return school;
        }

        public void setSchool(String school) {
                this.school = school;
        }

        public double getPay() {
                return pay;
        }

        public void setPay(double pay) {
                this.pay = pay;
        }
        @Override
        public String toString(){
                return "Staff[" + super.toString() + ",school=" + this.school + ",pay=" + this.pay + "]";
        }
}
