package FangTianxia;

import java.io.Serializable;

/**
 * 对应小区信息
 * @author yangJun
 *
 */
public class CommunityInfo implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    /**
     * 楼盘详细信息url
     */
    private String propertyInfoUrl;
    /**
     * 楼盘名称
     */
    private String propertyName;
    /**
     * 二手房
     */
    private String secondHandHousing;
    /**
     * 租房
     */
    private String rental;
    /**
     * 物业类型
     */
    private String propertyType;
    /**
     * 绿化率
     */
    private String greeningRate;
    /**
     * 物业费
     */
    private String propertyFee;
    /**
     * 物业公司
     */
    private String propertyCompany;
    /**
     * 开发商
     */
    private String developers;
    /**
     * 此楼盘此月均价
     */
    private String averagePrice;
    /**
     * 环比上月
     */
    private String thanLastMonth;
    /**
     * 同比上年
     */
    private String yearOverYear;

}