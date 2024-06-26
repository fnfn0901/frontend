package com.example.nidonnaedon;

public class UserDTO {
    private String userId;
    private String name; // name 필드 추가
    private String nickname;

    public UserDTO(String userId, String name, String nickname) {
        this.userId = userId;
        this.name = name; // 생성자에 name 추가
        this.nickname = nickname;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
