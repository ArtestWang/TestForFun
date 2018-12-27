package Statistics;


import Entity.SessionUser;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

@WebListener
    public class UserServletRequestListener implements ServletRequestListener {

        private ArrayList<SessionUser> userList;   //在线用户的列表

        @Override
        public void requestDestroyed(ServletRequestEvent arg0) {

        }

        @Override
        public void requestInitialized(ServletRequestEvent arg0) {
            //获取在线用户列表
            userList = (ArrayList<SessionUser>) arg0.getServletContext().getAttribute("userList");

            if (userList == null)   // 如果当前在线用户列表为空，则新建一个
                userList = new ArrayList<SessionUser>();

            HttpServletRequest request = (HttpServletRequest) arg0.getServletRequest();
            String sessionIdString = request.getSession().getId();

            //判断这个 request 请求是否是新的用户发起的
            if (SessionUtil.getUserBySessionId(userList, sessionIdString) == null) {
                SessionUser user = new SessionUser();
                user.setSessionIdString(sessionIdString);
                user.setFirstTimeString(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
                user.setIpString(request.getRemoteAddr());
                userList.add(user);
            }
            arg0.getServletContext().setAttribute("userList", userList); //更新在线用户列表
            for (int i = 0;  i < userList.size();i++) {
                System.out.println(userList.get(i).getSessionIdString());
            }
        }
    }


