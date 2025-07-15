package Library.model.dao;

public class MemberDao {
    // 1) 싱글톤
    private MemberDao(){}
    private static final MemberDao instance = new MemberDao();
    public static MemberDao getInstance(){
        return instance;
    }
}
