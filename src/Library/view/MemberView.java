package Library.view;

public class MemberView {
    // 1) 싱글톤
    private MemberView(){}
    private static final MemberView instance = new MemberView();
    public static MemberView getInstance(){
        return instance;
    }
}
