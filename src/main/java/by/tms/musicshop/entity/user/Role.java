package by.tms.musicshop.entity.user;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    GUEST, USER, STAFF, ADMIN;

    @Override
    public String getAuthority() {
        return name();
    }
}
