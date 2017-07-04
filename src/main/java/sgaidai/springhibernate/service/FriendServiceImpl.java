package sgaidai.springhibernate.service;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sgaidai.springhibernate.dao.FriendDAO;
import sgaidai.springhibernate.model.Friend;



@Service
@ManagedBean(name="friendService")
@SessionScoped
public class FriendServiceImpl implements FriendService {

	private FriendDAO friendDAO;
	 
    public void setFriendDAO(FriendDAO friendDAO) {
        this.friendDAO = friendDAO;
    }
 
    @Override
    @Transactional
    public void addFriend(Friend f) {
        this.friendDAO.addFriend(f);
    }
 
    @Override
    @Transactional
    public List<Friend> listFriends() {
        return this.friendDAO.listFriends();
    }
 
}
