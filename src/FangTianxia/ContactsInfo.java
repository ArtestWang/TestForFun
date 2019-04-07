package FangTianxia;

import java.io.Serializable;

/**
 * 对应经纪人信息
 * @author yangJun
 *
 */
public class ContactsInfo  implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * 名称
     */
    private String name;

    /**
     * 好评率
     */
    private String rateOfPraise;
    /**
     * 真实度
     */
    private String truthDegree;
    /**
     * 满意度
     */
    private String satisDegree;
    /**
     * 专业度
     */
    private String professDegree;
    /**
     * 电话
     */
    private String phone;
    /**
     * 详细信息页面
     */
    private String detailedInfoUrl;
    /**
     * 头像地址
     */
    private String photoUrl;


}