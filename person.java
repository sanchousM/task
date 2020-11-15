package groupid;
import java.io.IOException;

public class person {
        private String id;
        private String name;
        private String gender;
        private division div;
        private String salary;
        private String BirtDate;
    public person(String[] staff,division division) {

        id=staff[0];
        name=staff[1];
        gender=staff[2];
        BirtDate=staff[3];
        div= division;
       // div= new division(staff[4],Integer.parseInt(staff[5]));
        salary=staff[5];

    }
    // @Override
    public String toString() {
        return ((id)+" "
                +name+" "
                +gender+" "
                +BirtDate+" "
                +div.toString()+" "
                +(salary));
    }
}
