package able.cmm.lotto.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import able.cmm.lotto.LottoGenerator;
import able.cmm.lotto.service.dao.LottoNumberDAO;

/**
 * <pre>
 * Statements
 * </pre>
 *
 * @ClassName   : LottoGenServlet.java
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
@WebServlet("/lotto-gen")
public class LottoGenServlet extends HttpServlet {
    private static final long serialVersionUID = 8030254262469632316L;
    private void process(int count){
        LottoGenerator lottoGenerator = new LottoGenerator();
        for(int i=0; i<count; i++){
            LottoNumberDAO lnDao = new LottoNumberDAO();
            lnDao.insertLottoNumber(lottoGenerator.getLottoNumber());
        } 
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher;
        System.out.println("test5");
        if (request.getParameter("count") == null){
            dispatcher= request.getRequestDispatcher(
                    "/WEB-INF/jsp/lottoGen.jsp");
            dispatcher.forward(request, response);            
        } else {
            int count = Integer.parseInt(request.getParameter("count"));
            LottoGenerator lottoGenerator = new LottoGenerator();
            for(int i=0; i<count; i++){
                LottoNumberDAO lnDao = new LottoNumberDAO();
                lnDao.insertLottoNumber(lottoGenerator.getLottoNumber());
            }
            response.sendRedirect(request.getContextPath() + "/my-info");
        }
    }
    
}
