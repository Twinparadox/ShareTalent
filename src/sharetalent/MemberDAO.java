package sharetalent;
import javax.sql.DataSource;
import java.sql.*;

public class MemberDAO {
    private Connection conn;
    private PreparedStatement pstmt;
    private DataSource dataFactory;

    private static String url = "jdbc:mysql://localhost:3306/sharetalent";
    private static String db_id = "root";
    private static String db_pw = "password";

    public static final int MEMBER_NONEXISTENT = 0;
    public static final int MEMBER_EXISTENT = 1;
    public static final int MEBMER_REGISTER_FAIL = 0;
    public static final int MEMBER_REGISTER_SUCCESS = 1;
    public static final int MEMBER_LOGIN_WRONG = 0;
    public static final int MEMBER_LOGIN_SUCCESS = 1;

    private static MemberDAO instance = new MemberDAO();

    private MemberDAO() { }

    public static MemberDAO getInstance() {
        return instance;
    }

    private Connection getConnection() throws SQLException {
        conn=null;

        try {
            Class.forName("com.mysql.jdbc.Driver");

            conn= DriverManager.getConnection(url,db_id,db_pw);
        }
        catch (ClassNotFoundException e) {
            System.out.println("Failure to Loading Driver");
        }
        return conn;
    }

    public int insertMember(MemberDTO dto) {
        int result = 0;

        PreparedStatement pstmt=null;
        String query = "INSERT INTO member_table VALUES (?, MD5(?),?,?,?,?,?,?,?,?,?,?)";

        try {
            conn = getConnection();

            pstmt = conn.prepareStatement(query);

            pstmt.setString(1, dto.getId());
            pstmt.setString(2, dto.getPw());
            pstmt.setString(3, dto.getName());
            pstmt.setString(4, dto.getPhone());
            pstmt.setString(5, dto.getEmail());
            pstmt.setString(6, dto.getBirthday());
            pstmt.setString(7, dto.getPostcode());
            pstmt.setString(8, dto.getAddress()+" "+dto.getExtraAddress()+" "+dto.getDetailAddress());
            pstmt.setString(9, dto.getAccount());
            pstmt.setString(10, dto.getAccountOwner());
            pstmt.setString(11, dto.getAccountBank());
            pstmt.setTimestamp(12, dto.getRegisterDate());
            pstmt.executeUpdate();

            result = MemberDAO.MEMBER_REGISTER_SUCCESS;
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if( conn != null ) {
                    conn.close();
                }
                if( pstmt != null ) {
                    pstmt.close();
                }
            }
            catch(SQLException e) {
                e.printStackTrace();
            }
        }

        return result;
    }

    public int confirmId(String id) {
        int result = 0;

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet set = null;
        String query = "SELECT id FROM member_table WHERE id = ?";

        try {
            conn = getConnection();
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, id);
            set = pstmt.executeQuery();

            if(set.next()) {
                result = MemberDAO.MEMBER_EXISTENT;
            } else {
                result = MemberDAO.MEMBER_NONEXISTENT;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if( conn != null ) {
                    conn.close();
                }
                if( pstmt != null ) {
                    pstmt.close();
                }
            }
            catch(SQLException e) {
                e.printStackTrace();
            }
        }

        return result;
    }

    public int checkLogin(String id, String pw) {
        int result = 0;
        String dbpw;
        
        return result;
    }
}
