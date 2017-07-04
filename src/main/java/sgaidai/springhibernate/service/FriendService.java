package sgaidai.springhibernate.service;

import java.util.List;
import sgaidai.springhibernate.model.Friend;

import sgaidai.springhibernate.model.Person;
 
public interface FriendService {
 
    public void addFriend(Friend f);
    public List<Friend> listFriends();
     
}