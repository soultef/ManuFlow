package com.soultech.user_service.DTOs;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

/**
 * Data Transfer Object (DTO) for user authentication requests.
 *
 * <p>
 * This class encapsulates the data required for user login or registration requests.
 * It contains only the essential fields needed to process the user credentials.
 * </p>
 *
 * <p>
 * Fields:
 * <ul>
 *   <li><b>username</b> - the unique identifier for the user, typically used for login.</li>
 *   <li><b>password</b> - the secret key used for authenticating the user.</li>
 * </ul>
 * </p>
 *
 * <p>
 * This DTO is typically used in controller layers to transfer data from client requests
 * to the service layer. It should include validation annotations if applicable to
 * ensure data integrity.
 * </p>
 *
 * @author Solomon
 * @version 1.0
 * @since 2025-08-19
 */
public class UserRequestDTO {

    /**
     * The user's email used as the login username.
     * Must be a non-empty string and a valid email format.
     */
    @NotBlank(message = "Username is required")
    @Email(message = "Username must be a valid email address")
    private String username;

    /**
    * The user's password used for authentication.
    * Must be at least 8 characters long and not blank.
     * The user's password.
     *  <p>
     *  Must meet the following criteria:
     *  <ul>
     *   <li>Minimum 8 characters</li>
     *    <li>At least one uppercase letter</li>
     *    <li>At least one number</li>
     *    <li>At least one special character (@, $, !, %, *, ?, &)</li>
     *  </ul>
     * </p>
    */
    @NotBlank(message = "Password is required")
    @Size(min = 8, max = 100, message = "Password must be between 8 and 100 characters")
    @Pattern(regexp = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",
            message = "Password must be 8+ chars, with uppercase, number, and special character")
    private String password;


    /**
     * Gets the username.
     * @return the username string
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the username.
     * @param username the username string to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Gets the password.
     * @return the password string
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password.
     * @param password the password string to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
