package io.javabrains.springbootsecurityjwt.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author Nazar Lelyak.
 */
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AuthenticationRequest implements Serializable {

    private static final long serialVersionUID = 0L;

    private String username;
    private String password;
}
