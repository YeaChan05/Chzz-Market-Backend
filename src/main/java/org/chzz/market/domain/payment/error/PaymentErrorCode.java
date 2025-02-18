package org.chzz.market.domain.payment.error;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.chzz.market.common.error.ErrorCode;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum PaymentErrorCode implements ErrorCode {
    INVALID_METHOD(HttpStatus.BAD_REQUEST, "결제 수단이 옳지 않습니다."),
    ALREADY_EXIST(HttpStatus.INTERNAL_SERVER_ERROR, "이미 존재하는 orderId 입니다."),
    CREATION_FAILURE(HttpStatus.INTERNAL_SERVER_ERROR, "orderId 생성에 실패했습니다. 다시 시도해주세요."),
    DUPLICATED_REQUEST(HttpStatus.INTERNAL_SERVER_ERROR,"이미 결제했던 내역이 있습니다");

    private final HttpStatus httpStatus;
    private final String message;

    public static class Const {
        public static final String INVALID_METHOD = "INVALID_METHOD";
        public static final String ALREADY_EXIST = "ALREADY_EXIST";
        public static final String CREATION_FAILURE = "CREATION_FAILURE";
        public static final String DUPLICATED_REQUEST = "DUPLICATED_REQUEST";
    }
}
