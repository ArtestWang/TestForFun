package Entity;

public class SessionUser {
    private String sessionIdString; // 该用户的sessionId
    private String ipString;    // 该用户的IP
    private String firstTimeString;  // 首次登陆时间
    public String getSessionIdString() {
        return sessionIdString;
    }
    public void setSessionIdString(String sessionIdString) {
        this.sessionIdString = sessionIdString;
    }
    public String getIpString() {
        return ipString;
    }
    public void setIpString(String ipString) {
        this.ipString = ipString;
    }
    public String getFirstTimeString() {
        return firstTimeString;
    }
    public void setFirstTimeString(String firstTimeString) {
        this.firstTimeString = firstTimeString;
    }

}
