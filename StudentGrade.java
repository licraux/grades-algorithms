public class StudentGrade{

    String name;
    String grade;

    public StudentGrade (String input){

        String[] splitedIn = input.split(" ");
        
        this.name = splitedIn[0];
        
        this.grade = splitedIn[1].contains("FX") ? splitedIn[1].replace("FX","EZ"):splitedIn[1];

    }

    public String getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }


    
}
