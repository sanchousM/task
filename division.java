package groupid;

public class division{
    private int division_id;
    private String division_name;
    public division(String Name, int ID) {
        division_name=Name;
        division_id= ID;
    }
    @Override
    public String toString() {
        return (division_id+" "
               +division_name+" ");
    }
}