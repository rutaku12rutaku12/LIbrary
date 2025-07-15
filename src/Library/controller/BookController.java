package Library.controller;

import Library.model.dao.BookDao;
import Library.model.dao.MemberDao;

public class BookController {
    // 1) 싱글톤
    private BookController(){}
    private static final BookController instance = new BookController();
    public static BookController getInstance(){
        return instance;
    }
    // 2) dao 싱글톤 가져오기
    private BookDao bookDao = BookDao.getInstance();


} // class end



