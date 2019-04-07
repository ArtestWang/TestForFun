package TimerTask;

import java.util.*;

public class Task extends TimerTask {

    public void run(){
            System.out.println("失效站点清理开始");
            try {
                List<Map<String, Object>> outTimeList = new ArrayList<>();
//                outTimeList = roleApplyService.getOutTimeList();
                List<Map<String, Integer>> disableList = new ArrayList<>();
                List<String> sl = new ArrayList<>();
                Integer id;
                String sites = null;
                int a = 0;
                if (outTimeList.size() > 0) {
                    for (Map<String, Object> ot : outTimeList) {
                        Map<String, Integer> params = new HashMap<>();
                        id = (Integer) ot.get("id");
                        sites = ot.get("sites").toString();
                        if (sites.contains(",")) {
                            sl = new ArrayList<>(Arrays.asList(sites.split(",")));
                            HashSet h = new HashSet(sl);
                            sl.clear();
                            sl.addAll(h);
                            for (String site : sl) {
                                params = new HashMap<>();
                                params.put("id", id);
                                params.put("site", Integer.parseInt(site));
                                disableList.add(params);
                            }
                        } else {
                            params.put("id", id);
                            params.put("site", Integer.parseInt(sites));
                            disableList.add(params);
                        }
                    }
//                    a = roleApplyService.deleteSites(disableList);
                    System.out.println("已经清理"+a+"个失效站点");
                    System.out.println("失效站点清理结束");
                }
            } catch (Exception e) {
//                CommonMethod.logger.warn(e);
            }
        }
    }

