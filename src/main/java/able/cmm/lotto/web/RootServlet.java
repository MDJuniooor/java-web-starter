package able.cmm.lotto.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <pre>
 * Statements
 * </pre>
 *
 * @ClassName   : LottoGenController.java
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
@WebServlet("/index")
public class RootServlet extends HttpServlet{
    private static final long serialVersionUID = 2324211301110151007L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher(
                "/WEB-INF/jsp/main.jsp");
        dispatcher.forward(request, response);
    }
    
    /*
     * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        String mode = request.getParameter("mode");
   
        if ("1".equals(mode)){
            response.sendRedirect(request.getContextPath() + "/lotto-gen");
        }
        else if ("2".equals(mode)){
            response.sendRedirect(request.getContextPath() + "/my-info");
        }
        else {
            this.doGet(request, response);    
        }
    }
}
