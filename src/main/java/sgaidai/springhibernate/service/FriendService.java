package sgaidai.springhibernate.service;

import java.util.List;
import sgaidai.springhibernate.model.Friend;


 
public interface FriendService {
 
    public void addFriend(Friend f);
    public void deleteFriend(Friend f);
    public List<Friend> listFriends();
     
}