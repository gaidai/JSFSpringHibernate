package sgaidai.springhibernate.dao;

import java.util.List;
import sgaidai.springhibernate.model.Friend;

 
public interface FriendDAO {
 
    public void addFriend(Friend p);
    

    public List<Friend> listFriends();
}