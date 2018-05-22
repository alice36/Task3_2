public class Rectangle {
    int BokKrotszy;
    int BokDluzszy;

    public Rectangle(int bokKrotszy, int bokDluzszy) {
        BokKrotszy = bokKrotszy;
        BokDluzszy = bokDluzszy;
    }

    void showInfo(){
        System.out.println(BokDluzszy + " " + BokDluzszy);
    }
}
