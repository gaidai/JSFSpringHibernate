package sgaidai.springhibernate.dao;

import java.util.List;
import sgaidai.springhibernate.model.Friend;

 
public interface FriendDAO {
 
    public void addFriend(Friend f);
    public void deleteFriend(Friend f);
    public void editFriend(Friend f);
    
    

    public List<Friend> listFriends();
}