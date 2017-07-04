package sgaidai.springhibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import sgaidai.springhibernate.model.Friend;



@Repository
public class FriendDAOImpl implements FriendDAO{
	
	private static final Logger logger = LoggerFactory.getLogger(FriendDAOImpl.class);
	 
    private SessionFactory sessionFactory;
     
    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }
 
    @Override
    public void addFriend(Friend f) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(f);
        logger.info("Friend saved successfully, Friend Details="+f);
    }
 
    @SuppressWarnings("unchecked")
    @Override
    public List<Friend> listFriends() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Friend> friendList = session.createQuery("from Friend").list();
        for(Friend f : friendList){
            logger.info("Friend List::"+f);
        }
        return friendList;
    }
 
}
