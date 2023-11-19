package src.com.teachmeskills.lesson5.task2;
/**Create a class to describe a student in our group.
 * Class fields: first name, last name, passport number, group name.
 * Create objects of this class for each student in our group.
 * Place all these objects into an array.
 * Loop through the array with a for-each loop and output information to the console.*/
public class Program {

    public static void main(String[] args) {
        Student student1 = new Student("Dmitry", "Second Name", 1001);
        Student student2 = new Student("Mark", "Second Name", 1002);
        Student student3 = new Student("Anna", "Shumaleva", 1003);
        Student student4 = new Student("Daniil", "Pendo", 1004);
        Student student5 = new Student("Oleg", "Second Name", 1005);
        Student student6 = new Student("Arthur", "Dadayan", 1006);
        Student student7 = new Student("Stepan", "Second Name", 1007);
        Student student8 = new Student("Polina", "Petrova", 1008);
        Student student9 = new Student("Ivan", "Second Name", 1009);
        Student student10 = new Student("Elisaveta", "Rogovchenko", 1010);
        Student student11 = new Student("Sergey", "Second Name", 1011);
        Student student12 = new Student("Fedor", "Second Name", 1012);

        Student[] all = {student1, student2, student3, student4, student5, student6, student7, student8, student9, student10, student11, student12};
        for(Student counter : all){
            System.out.println(counter.name +" "+ counter.secondName + ", Passport Number: " + counter.passportNumber + ", Group number: " + counter.groupName);
        }
    }

}
