package able.cmm.lotto.service.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import able.cmm.lotto.service.vo.LottoNumberVO;


/**
 * <pre>
 * Statements
 * </pre>
 *
 * @ClassName   : LottoNumber.java
 * @Description : 클래스 설명을 기술합니다.
 * @author 6791481
 * @since 2019. 12. 22.
 * @version 1.0
 * @see
 * @Modification Information
 * <pre>
 *     since          author              description
 *  ===========    =============    ===========================
 *  2019. 12. 22.     6791481     	최초 생성
 * </pre>
 */

public class LottoNumberDAO {    

    public List<LottoNumberVO> selectLottoNumberList(){
        List<LottoNumberVO> lottoNumberList = new ArrayList<LottoNumberVO>();
        Connection conn = null;
        Statement stmt = null;
        String sql = "select * from lotto_number";
        ResultSet rs = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");  
            String url = "jdbc:mysql://localhost:3306/study?characterEncoding=UTF-8&serverTimezone=UTC";
            // @param  getConnection(url, userName, password);
            // @return Connection
            conn = DriverManager.getConnection(url, "root", "1234");
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            
            while(rs.next()){
               LottoNumberVO vo = new LottoNumberVO();
               vo.setId(rs.getInt(1));
               vo.setNumber1(rs.getInt(2));
               vo.setNumber2(rs.getInt(3));
               vo.setNumber3(rs.getInt(4));
               vo.setNumber4(rs.getInt(5));
               vo.setNumber5(rs.getInt(6));
               vo.setNumber6(rs.getInt(7));
               
               lottoNumberList.add(vo);
            }
        }
        catch(ClassNotFoundException e){
            System.out.println("드라이버 로딩 실패 : " + e);
        }
        catch(SQLException e){
            System.out.println("에러: " + e);
        }
        finally{
            try{
                if( conn != null && !conn.isClosed()){
                    conn.close();
                }
            }
            catch( SQLException e){
                e.printStackTrace();
            }
        }
        return lottoNumberList;
    }
    
    public void insertLottoNumber(List<Integer> lottoNumberList){
        String sql = "insert into lotto_number(number1,number2,number3,number4,number5,number6)"
                + "value(?,?,?,?,?,?)";
        Connection conn = null;
        PreparedStatement psmt = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");  
            String url = "jdbc:mysql://localhost:3306/study?characterEncoding=UTF-8&serverTimezone=UTC";
            // @param  getConnection(url, userName, password);
            // @return Connection
            conn = DriverManager.getConnection(url, "root", "1234");
            psmt = conn.prepareStatement(sql);
            for(int i=0;i< lottoNumberList.size();i++){
                psmt.setInt(i+1,lottoNumberList.get(i));
            }
            psmt.executeUpdate();
            psmt.close();
            conn.close();
        }
        catch(ClassNotFoundException e){
            System.out.println("드라이버 로딩 실패 : " + e);
        }
        catch(SQLException e){
            System.out.println("에러: " + e);
        }
        finally{
            try{
                if( conn != null && !conn.isClosed()){
                    conn.close();
                }
            }
            catch( SQLException e){
                e.printStackTrace();
            }
        }
    }        
}
