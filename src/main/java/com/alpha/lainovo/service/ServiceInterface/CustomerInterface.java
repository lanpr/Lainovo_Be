package com.alpha.lainovo.service.ServiceInterface;

import com.alpha.lainovo.dto.request.ChangePasswordDTO;
import com.alpha.lainovo.model.Customer;
import jakarta.servlet.http.HttpServletRequest;

public interface CustomerInterface {
    Customer findByEmail(String email);

    Customer findById(Integer userId);

    Customer findByRefreshToken(String token);

    int changePassword(ChangePasswordDTO changePasswordDTO, HttpServletRequest request);

    void resetPassword(String email, String code);

    Customer findByPasswordResetToken(String code);

    boolean validateCodePassword(String code, String newPassword);
}
