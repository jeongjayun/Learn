package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        Student student1; //학생을 담아 둘 변수 선언
        student1 = new Student(); //학생 클래스를 새로 만든다.
        student1.name = "학생1"; //클래스의 내부 변수에는 .을 통해 접근
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); //새로만든 학생2
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;


        System.out.println("이름 : " + students[0].name + " 나이 : " + students[0].age + " 성적 : " + students[0].grade);
        System.out.println("이름 : " + students[1].name + " 나이 : " + students[1].age + " 성적 : " + students[1].grade);

        System.out.println(students[0]);
        System.out.println(student1);
        System.out.println("=============");
        System.out.println(students[1]);
        System.out.println(student2);
    }
}
