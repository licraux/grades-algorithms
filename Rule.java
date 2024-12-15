import java.util.Comparator;

public class Rule implements Comparator<StudentGrade>{
    
    public Rule(){}

    public int compare(StudentGrade a, StudentGrade b){
        
        if(a.getGrade().contains("+") || a.getGrade().contains("-") || b.getGrade().contains("-") || b.getGrade().contains("+")){

            if (getMainScore(a.getGrade()).equals(getMainScore(b.getGrade()))) return getWeight(a)>getWeight(b) ? -1 : getWeight(a)<getWeight(b) ? 1 : getWeight(a)==getWeight(b) ? (a.getName().compareTo(b.getName())):(a.getGrade().compareTo(b.getGrade()));
            else return (getMainScore(a.getGrade()).compareTo(getMainScore(b.getGrade())));
        }
        else return getMainScore(a.getGrade()).equals(getMainScore(b.getGrade())) ?  (a.getName().compareTo(b.getName())):(getMainScore(a.getGrade()).compareTo(getMainScore(b.getGrade())));

    }


    public int getWeight(StudentGrade b1){

        if(b1.getGrade().contains("+") && b1.getGrade().contains("-")){
            int wei = 0;
            char pos = "+".toCharArray()[0];
            char neg = "-".toCharArray()[0];
            for (char sign : b1.getGrade().toCharArray()){
                if(sign == pos) wei++;
                else if(sign == neg) wei--;
            }
            return wei;
        }
        else{
        if(b1.getGrade().contains("+")){
            return b1.getGrade().length();
        }
        if(b1.getGrade().contains("-")){
            return (b1.getGrade().length())*(-1);
        }
        else return 0;
    }
    }

    public String getMainScore(String c){

        
        return c.contains("+") ? c.replace("+","") : c.contains("-") ? c.replace("-","") : c;  

    }

}
