package FangTianxia;

import java.io.Serializable;

/**
 * 房源信息
 * @author yangJun
 *
 */
public class HouseInfo  implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * 标题
     */
    private String title;

    /**
     * 总价
     */
    private String finalPrice;
    /**
     * 参考首付
     */
    private String referPay;
    /**
     * 参考月供
     */
    private String referMonth;

    /**
     * 户型
     */
    private String apartmentLayout;
    /**
     * 建筑面积
     */
    private String buildMeasureOfArea;
    /**
     * 使用面积
     */
    private String useMeasureOfArea;
    /**
     * 年代
     */
    private String years;
    /**
     * 朝向
     */
    private String orientation;
    /**
     * 楼层
     */
    private String floor;
    /**
     * 结构
     */
    private String structure;
    /**
     * 装修
     */
    private String renovation;
    /**
     * 住宅类别
     */
    private String residCategory;
    /**
     * 建筑类别
     */
    private String architCategory;
    /**
     * 产权性质
     */
    private String propertyRight;
    /**
     * 楼盘名称
     */
    private String propertyName;
    /**
     * 配套设施
     */
    private String suppFacil;


    /**
     * 房源描述
     */
    private String describe;
    /**
     * 联系电话
     */
    private String phone;
    /**
     * 联系人名称
     */
    private String persionName;
    /**
     * 地址
     */
    private String address;
    /**
     * 交通状况
     */
    private String traffic;
    /**
     * 来源url
     */
    private String houserFromUrl;
    /**
     * 更新时间
     */
    private String updateTime;
    /**
     * 爬取时间
     */
    private String climbingTime;


}