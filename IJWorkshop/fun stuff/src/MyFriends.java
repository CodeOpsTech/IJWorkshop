package start;

class Friend {
    public Friend() {
        System.out.println("Yes, I want friends");
    }
}

class GirlFriend extends Friend {
    public GirlFriend() {
        System.out.println("of course, only girl friends ;-)");
    }
}

public class MyFriends {
    public static void main(String[] args) {
        Friend[] friendsIWant = new GirlFriend[10];
        friendsIWant[0] = new Friend();
        friendsIWant[1] = new GirlFriend();
        System.out.println(friendsIWant);
    }
}
