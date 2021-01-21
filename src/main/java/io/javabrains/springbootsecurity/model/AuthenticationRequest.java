package io.javabrains.springbootsecurity.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author Nazar Lelyak.
 */
@Getter
@AllArgsConstructor
@ToString(of = {"username"})
public class AuthenticationRequest implements Serializable {

    private static final long serialVersionUID = 0L;

    private final String username;
    private final String password;
}
