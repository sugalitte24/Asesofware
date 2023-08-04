create table MECHANIC
(
    UUID             RAW(255)           not null
        primary key,
    CREATED_AT       TIMESTAMP(6),
    LAST_MODIFIED_AT TIMESTAMP(6),
    ADDRESS          VARCHAR2(255 char),
    CELLPHONE        VARCHAR2(255 char) not null,
    DOCUMENT_ID      VARCHAR2(255 char) not null
        constraint UK_NSNT0VLX0WB97HYJ6M1I8JD71
            unique,
    DOCUMENT_TYPE    VARCHAR2(255 char) not null,
    EMAIL            VARCHAR2(255 char) not null,
    FIRST_NAME       VARCHAR2(255 char) not null,
    LAST_NAME        VARCHAR2(255 char) not null,
    SECOND_NAME      VARCHAR2(255 char),
    STATUS           VARCHAR2(255 char)
)