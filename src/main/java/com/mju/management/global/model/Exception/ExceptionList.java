package com.mju.management.global.model.Exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ExceptionList {

    UNKNOWN(-9999, "알 수 없는 오류가 발생하였습니다."),

    EMPTY_USER(-5051, "유저 정보를 입력해 주세요."),
    NOT_CORRECT_USER(-5052, "수강생이 아닙니다. 수강생으로 로그인 다시 부탁드립니다."),
    NOT_ACCESS_USER(-5053, "접근할 수 없는 유저 입니다."),
    EMPTY_JWT(-5054, "토큰이 없습니다. 확인부탁드립니다."),
    NOT_EXISTENT_USER(-5055, "존재하지 않는 유저입니다."),

    NON_EXISTENT_CHECKLIST(5005, "내용이 존재하지 않습니다."),

    // SCHEDULE
    NON_EXISTENT_SCHEDULE(6000, "일정이 존재하지 않습니다."),
    NON_EXISTENT_SCHEDULELIST(6001, "일정 목록이 존재하지 않습니다."),
    START_DATE_AFTER_END_DATE_EXCEPTION(6002, "시작일이 종료일의 이후입니다."),
    INVALID_DATE_FORMAT(6003, "유효하지 않은 날짜 형태입니다."),
    OUT_OF_PROJECT_SCHEDULE_RANGE(6004, "프로젝트의 일정 범위를 벗어났습니다."),

    NON_EXISTENT_PROJECT(5008, "프로젝트가 존재하지 않습니다."),
    INVALID_INPUT_VALUE(5009, "유효성 검사에 실패하였습니다."),
    // PROJECT
    INVALID_PROJECT_ID(5010, "요청으로 들어온 Project의 식별자가 유효하지 않습니다."),

    // USER
    INVALID_USER_ID(5011, "요청으로 들어온 User의 식별자가 유효하지 않습니다."),

    // PROJECT & TEAM
    NOT_TEAM_MEMBER(5012, "요청으로 들어온 User는 해당 Project의 팀원이 아닙니다."),

    // POST
    INVALID_POST_ID(5013, "요청으로 들어온 Post의 식별자가 유효하지 않습니다."),
    NO_PERMISSION_TO_EDIT_POST(5014, "게시글 수정 권한이 없습니다.");





    private final int code;
    private final String message;
}
