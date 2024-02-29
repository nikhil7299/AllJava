package Unit1;

class User {
    private final String userId;
    private final String userName;
    private final String emailId;

    private User(UserBuilder userBuilder) {
        this.userId = userBuilder.userId;
        this.userName = userBuilder.userName;
        this.emailId = userBuilder.emailId;

    }

    public String getUserName() {
        return userName;
    }

    public String getUserId() {
        return userId;
    }

    public String getEmailId() {
        return emailId;
    }

    @Override
    public String toString() {
        return this.getUserId() + " : " + this.getUserName() + " : " + this.getEmailId();
    }

    static class UserBuilder {
        private String userId;
        private String userName;
        private String emailId;

        public UserBuilder() {
        }

        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }
}

class Demo {
    public static void main(String[] args) {
        User u1 = new User.UserBuilder()
                .setUserName(" CSE406")
                .setEmailId(" java@lpu.co.in")
                .setUserId("123")
                .build();

        System.out.println(u1);

        User u2 = new User.UserBuilder()
                .setUserName(" CSE406")
                .setUserId("123")
                .build();

        System.out.println(u2);

    }
}
