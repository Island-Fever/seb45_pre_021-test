package com.teamtwentyone.exception;

public enum ExceptionCode {
    INVALID_INPUT_VALUE(400, "유효성 검증에 실패했습니다."),
    USER_NOT_FOUND(404, "유저를 찾을 수 없습니다."),
    USER_EXISTS_EMAIL(409, "사용중인 이메일 입니다."),
    USER_EXISTS_NICKNAME(409, "사용중인 닉네임 입니다."),
    USER_EXISTS_PHONENUM(409, "사용중인 번호 입니다."),
    NOT_RESOURCE_OWNER(403, "리소스의 소유자가 아닙니다.");
    // 참고용
//    BOARD_NOT_FOUND(404, "게시글을 찾을 수 없습니다."),
//    ANSWER_NOT_FOUND(404, "답변을 찾을 수 없습니다."),
//    NOT_IMPLEMENTATION(501, "해당 기능은 구현되지 않았습니다.");

    private final int status;

    private final String message;

    ExceptionCode(int code, String message) {
        this.status = code;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}
