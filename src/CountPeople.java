import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountPeople {

    public static void main(String[] args){
        String s = "zhangbin@zed.com<zhangbin@zed.com>,qining@zed.com<qining@zed.com>,luhuijun@zed.com<luhuijun@zed.com>,   zhouzipu@zed.com<zhouzipu@zed.com>,   lijinzhong@zed.com<lijinzhong@zed.com>,   zhanglingfei@zed.com<zhanglingfei@zed.com>,   jiangtao@zed.com<jiangtao@zed.com>,   zhushuai@zed.com<zhushuai@zed.com>,   jiangwenbo@zed.com<jiangwenbo@zed.com>,   yulei@zed.com<yulei@zed.com>,   chuyizhou@zed.com<chuyizhou@zed.com>,   baoke@zed.com<baoke@zed.com>,   duhao@zed.com<duhao@zed.com>,   dongjinxin@zed.com<dongjinxin@zed.com>,   wanghaoran@zed.com<wanghaoran@zed.com>,   huangyuan@zed.com<huangyuan@zed.com>,   jianglongxiang@zed.com<jianglongxiang@zed.com>,   luojun@zed.com<luojun@zed.com>,   guoxiaoxiao@zed.com<guoxiaoxiao@zed.com>,   qinxinchen@zed.com<qinxinchen@zed.com>,   zhuzhenpeng@zed.com<zhuzhenpeng@zed.com>,   taoshaoyang@zed.com<taoshaoyang@zed.com>,   xufenghua@zed.com<xufenghua@zed.com>,   leixiaoju@zed.com<leixiaoju@zed.com>,   wangxingdong@zed.com<wangxingdong@zed.com>,   sunsihui@zed.com<sunsihui@zed.com>,   dinghailei@zed.com<dinghailei@zed.com>,   wangxiaolong@zed.com<wangxiaolong@zed.com>,   xichen@zed.com<xichen@zed.com>,   songhuan@zed.com<songhuan@zed.com>,   zhuconglin@zed.com<zhuconglin@zed.com>,   haoqixin@zed.com<haoqixin@zed.com>,   qiudongsen@zed.com<qiudongsen@zed.com>,   luqi@zed.com<luqi@zed.com>,   heyuanliang@zed.com<heyuanliang@zed.com>,   zhaodawei@zed.com<zhaodawei@zed.com>,   zhangteng@zed.com<zhangteng@zed.com>,   wangshengxu@zed.com<wangshengxu@zed.com>,   yuanzheng@zed.com<yuanzheng@zed.com>,   lishouzhong@zed.com<lishouzhong@zed.com>,   suwenming@zed.com<suwenming@zed.com>,   geyingfeng@zed.com<geyingfeng@zed.com>,   yechao@zed.com<yechao@zed.com>,   chenjinwei@zed.com<chenjinwei@zed.com>,   yanxu@zed.com<yanxu@zed.com>,   zengqingwang@zed.com<zengqingwang@zed.com>,   zhaojiarui@zed.com<zhaojiarui@zed.com>,   dengfan@zed.com<dengfan@zed.com>,   nichengxiang@zed.com<nichengxiang@zed.com>,   zengyanjun@zed.com<zengyanjun@zed.com>,   cailei@zed.com<cailei@zed.com>,   chengxinhao@zed.com<chengxinhao@zed.com>,   zhanglinghua@zed.com<zhanglinghua@zed.com>,   hanjushu@zed.com<hanjushu@zed.com>,   yangguibing@zed.com<yangguibing@zed.com>,   liuxiaobo@zed.com<liuxiaobo@zed.com>,   renwei@zed.com<renwei@zed.com>,   hulanzhu@zed.com<hulanzhu@zed.com>,   zhoujiezhong@zed.com<zhoujiezhong@zed.com>,   xuxiangdong@zed.com<xuxiangdong@zed.com>,   xiaopeng@zed.com<xiaopeng@zed.com>,   manlizhen@zed.com<manlizhen@zed.com>,   zhanghongyuan@zed.com<zhanghongyuan@zed.com>,   wangguoqing@zed.com<wangguoqing@zed.com>,   huyifan@zed.com<huyifan@zed.com>,   gaoshihong@zed.com<gaoshihong@zed.com>,   luyanglin@zed.com<luyanglin@zed.com>,   dongdaobo@zed.com<dongdaobo@zed.com>,   zhanglinjun@zed.com<zhanglinjun@zed.com>,   panpan@zed.com<panpan@zed.com>,   zhangchunjuan@zed.com<zhangchunjuan@zed.com>,   linwenbin@zed.com<linwenbin@zed.com>,   xucaimin@zed.com<xucaimin@zed.com>,   wuchenchen@zed.com<wuchenchen@zed.com>,   zhaoguo@zed.com<zhaoguo@zed.com>,   liwei@zed.com<liwei@zed.com>,   fanwentao@zed.com<fanwentao@zed.com>,   yangjin@zed.com<yangjin@zed.com>,   piyong@zed.com<piyong@zed.com>,   fengyirui@zed.com<fengyirui@zed.com>,   liangweipeng@zed.com<liangweipeng@zed.com>,   zhengfuhai@zed.com<zhengfuhai@zed.com>,   meihan@zed.com<meihan@zed.com>,   dingfangming@zed.com<dingfangming@zed.com>,   wuyuxuan@zed.com<wuyuxuan@zed.com>,   zhangliang@zed.com<zhangliang@zed.com>,   liuyang@zed.com<liuyang@zed.com>,   xiegu@zed.com<xiegu@zed.com>,   xiongkunlun@zed.com<xiongkunlun@zed.com>,   xuliang@zed.com<xuliang@zed.com>,   wangzixiong@zed.com<wangzixiong@zed.com>,   liujiayi@zed.com<liujiayi@zed.com>,   sunpanning@zed.com<sunpanning@zed.com>,   liuyan@zed.com<liuyan@zed.com>,   zhangyinlong@zed.com<zhangyinlong@zed.com>,   yuxiao@zed.com<yuxiao@zed.com>,   '；yangyijun<'；yangyijun@zed.com'>,   yuqingxi@zed.com<yuqingxi@zed.com>,   xukunlun@zed.com<xukunlun@zed.com>,   zhubo@zed.com<zhubo@zed.com>,   lijie@zed.com<lijie@zed.com>,   dongdan@zed.com<dongdan@zed.com>";
        List<String> list = new ArrayList();
        String a[] = s.split(",");
        list = Arrays.asList(a);
        int count = 0 ;
        for(String b :list){
//            System.out.println(b);
            String c = b.substring(0,b.indexOf("<")).replace("@zed.com","").trim();
//            System.err.println(c);
            String d = c.substring(0,4);
            if(d.contains("wang")){
                count++;
                System.out.println(c);
            }
            //System.out.println(b.replace("@zed.com","").replace("<","").replace(">",""));
        }
        System.err.println(count);
        System.err.println(list.size());


    }

}
