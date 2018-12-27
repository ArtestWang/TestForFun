package Statistics;

import Entity.SessionUser;

import java.util.ArrayList;

public class SessionUtil {

    public static Object getUserBySessionId(ArrayList<SessionUser> userList, String sessionIdString) {
        for (int i = 0; i < userList.size(); i++) {
            SessionUser sessionUser = userList.get(i);
            if (sessionUser.getSessionIdString().equals(sessionIdString)) {
                return sessionUser;
            }
        }
        return null;
    }
}