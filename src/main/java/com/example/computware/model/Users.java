package com.example.computware.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "users")
public class Users implements UserDetails  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id",unique = true)
    private Long userId;

    @Column(nullable = false,name = "full_name")
    private String fullName;

    @Column(nullable = false,unique = true)
    private String email;

    @Column(nullable = false)
    @JsonIgnore
    private  String password;

    @Column(length = 6)
    private int keyValue;

    @Column
    private String schoolName;

    @Column(length = 10,unique = true)
    private Long mobileNo;

    @Column(nullable = false)
    private String country;

    @Column(nullable = false)
    private String state;

    @Column(nullable = false)
    private String district;

    @Temporal(TemporalType.TIMESTAMP)
    @JsonIgnore
    private Date registerTime;

    @Temporal(TemporalType.TIMESTAMP)
    @JsonIgnore
    private  Date deletionTime;

    @Column
    private boolean isActive= true;

    @Column(nullable = false,name = "role")
    private  String Role = "USER";





    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return fullName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return isActive;
    }
}
