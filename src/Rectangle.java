public class Rectangle {
    double bokKrotszy;
    double bokDluzszy;

    public Rectangle(double bokKrotszy, double bokDluzszy) {
        this.bokKrotszy = bokKrotszy;
        this.bokDluzszy = bokDluzszy;
    }

    void showInfo(){
        System.out.println(bokKrotszy + " " + bokDluzszy);
    }
}
