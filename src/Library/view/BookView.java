package Library.view;

public class BookView {
    // 1) 싱글톤
    private BookView(){}
    private static final BookView instance = new BookView();
    public static BookView getInstance(){
        return instance;
    }
}
