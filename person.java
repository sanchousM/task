package groupid;

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
        div= new division(staff[4],Integer.parseInt(staff[5]));
        salary=staff[6];
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
