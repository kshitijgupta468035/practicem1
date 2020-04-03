package interface1;

// Interface

public class StudentDetail {
    int rollNo;
    String name;

    public void getDetail(int x, String s) {
        rollNo = x;
        name = s;
    }

    public void showDetail() {
        System.out.println("Roll Number is " + rollNo);
        System.out.println("Name is " + name);
    }


}

class Fullinfo extends StudentDetail implements Sports {

    @Override
    public void showDetail() {
        super.showDetail();
    }

    public void viewAll() {
        showDetail();
        showSport();
    }

    @Override
    public void getSport(String s) {

    }

    @Override
    public void showSport() {

    }
}

class DemoInterFace {
    public static void main(String[] args) {
        Fullinfo info = new Fullinfo();
        info.getDetail(1234, "Amit");
        info.getSport("Cricket");
        info.viewAll();


    }
}