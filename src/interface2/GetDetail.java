package interface2;

/* Interface Extending another interface */

interface GetDetail {
    String city = "New Delhi";

    void getCollegeName(String s);

    void getCollegeCode(int a);
}

interface ShowDetail extends GetDetail {
    void showCollegeName();

    void showCollegeCode();
}

/* class ViewDetail implements ShowDetail, getDetail */

class ViewDetail implements ShowDetail {
    String name;
    int code;

    @Override
    public void getCollegeName(String s) {
        name = s;
    }

    @Override
    public void getCollegeCode(int a) {
        code = a;
    }

    @Override
    public void showCollegeName() {
        System.out.println("College Name is " + name);
    }

    @Override
    public void showCollegeCode() {
        System.out.println("College code " + code);
    }

    public void showCollegeCity() {
        System.out.println("College city " + city);
    }

    public void callAllShow() {
        showCollegeName();
        showCollegeCode();
        showCollegeCity();
    }

}

class DemoInterface {
    public static void main(String[] args) {
        ViewDetail view = new ViewDetail();
        view.getCollegeName("ABC");
        view.getCollegeCode(123);
        view.callAllShow();


    }
}

