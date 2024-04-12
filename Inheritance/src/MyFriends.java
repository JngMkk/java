class Friend {
    protected String name, phone;
    public Friend(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    public void showInfo() {
        System.out.println("이름: " + this.name);
        System.out.println("전화: " + this.phone);
    }
}

class UnivFriend extends Friend {
    private String major;
    public UnivFriend(String name, String phone, String major) {
        super(name, phone);
        this.major = major;
    }
    public void showInfo() {
        super.showInfo();
        System.out.println("전공: " + this.major);
    }
}

class CompFriend extends Friend {
    private String department;
    public CompFriend(String name, String phone, String department) {
        super(name, phone);
        this.department = department;
    }
    public void showInfo() {
        super.showInfo();
        System.out.println("부서: " + this.department);
    }
}

public class MyFriends {
    public static void main(String[] args) {
        Friend[] friends = new Friend[10];
        int cnt = 0;

        friends[cnt++] = new UnivFriend("LEE", "010-1111-1111", "Computer");
        friends[cnt++] = new UnivFriend("SEO", "010-2222-2222", "Electronics");
        friends[cnt++] = new CompFriend("PARK", "010-3333-3333", "R&D 1");
        friends[cnt++] = new CompFriend("YOON", "010-4444-4444", "R&D 2");

        for (int i = 0; i < cnt; i++) {
            friends[i].showInfo();
            System.out.println();
        }
    }
}