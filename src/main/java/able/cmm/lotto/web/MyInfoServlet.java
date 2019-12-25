package able.cmm.lotto.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import able.cmm.lotto.service.dao.LottoNumberDAO;
import able.cmm.lotto.service.vo.LottoNumberVO;

/**
 * <pre>
 * Statements
 * </pre>
 *
 * @ClassName   : MyInfoServlet.java
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

@WebServlet("/my-info")
public class MyInfoServlet extends HttpServlet {
    private static final long serialVersionUID = 8030254263469632316L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LottoNumberDAO lnDao = new LottoNumberDAO();
        List<LottoNumberVO> lottoNumberList = lnDao.selectLottoNumberList();
        request.setAttribute("lottoNumberList", lottoNumberList);
        System.out.println(lottoNumberList.toString());
        RequestDispatcher dispatcher = request.getRequestDispatcher(
                "/WEB-INF/jsp/myInfo.jsp");
        dispatcher.forward(request, response);
    }
}