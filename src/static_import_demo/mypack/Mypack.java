package static_import_demo.mypack;

import static  static_import_demo.DemoPack.count;

public class Mypack {
    public static void main(String[] args) {
        De d = new De();
        d.getStaticFromPack();
    }
}

class  De {
    void getStaticFromPack() {
        System.out.println(count);
    }

}