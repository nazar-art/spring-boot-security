package io.javabrains.springbootsecurityjwt.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

/**
 * @author Nazar Lelyak.
 */
@Getter
@AllArgsConstructor
public class AuthenticationResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String jwt;
}
