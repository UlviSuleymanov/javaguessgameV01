package bean;

import java.io.Serializable;

public class Config implements Serializable {
    private User[] users=new User[0];
    private static boolean loggedIn;
    private static Config config=null;

    public User[] getUsers() {
        return users;
    }
    public void appendUser(User u){
       User[] newUsers = new User[users.length+1];
       for(int i=0; i<users.length; i++){
           newUsers[i]=users[i];
       }
       newUsers[newUsers.length-1]=u;
       users=newUsers;
    }
    public void setUsers(User[] users) {
        this.users = users;
    }
    public static Config getInstance(){
        if (config==null){
            config=new Config();
        }
        return config;
    }

    public static boolean isLoggedIn() {
        return loggedIn;
    }

    public static void setLoggedIn(boolean loggedIn) {
        Config.loggedIn = loggedIn;
    }
}
