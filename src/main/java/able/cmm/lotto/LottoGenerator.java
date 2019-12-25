package able.cmm.lotto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * <pre>
 * Statements
 * </pre>
 *
 * @ClassName   : LottoGenerator.java
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

public class LottoGenerator {
    public List<Integer> getLottoNumber(){
        List<Integer> lottoNumber = new ArrayList<Integer>();
        Set<Integer> lottoNumberSet = new HashSet<Integer>();
        Random random = new Random();
        int tmp;
        while(lottoNumberSet.size() < 6){
            tmp = random.nextInt(45) + 1;
            lottoNumberSet.add(tmp);
        }
        lottoNumber.addAll(lottoNumberSet); 
        lottoNumber.sort(null);
        return lottoNumber;
    }
}
