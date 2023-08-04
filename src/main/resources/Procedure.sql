create PROCEDURE sp_create_mechanic(
    uuid RAW,
    createdAt TIMESTAMP,
    lastModifiedAt TIMESTAMP,
    documentType VARCHAR,
    documentId VARCHAR,
    firstName VARCHAR,
    secondName VARCHAR,
    lastName VARCHAR,
    cellphone VARCHAR,
    address VARCHAR,
    email VARCHAR,
    status VARCHAR
)
IS
    message VARCHAR(40);
--  uuid raw(16);
BEGIN

--   select SYS_GUID()into uuid from dual;

--  dbms_output.put_line( uuid || 'uuid generado ');

INSERT
INTO MECHANIC
(
    "UUID",
    "CREATED_AT",
    "LAST_MODIFIED_AT",
    "DOCUMENT_TYPE",
    "DOCUMENT_ID",
    "FIRST_NAME",
    "SECOND_NAME",
    "LAST_NAME",
    "CELLPHONE",
    "ADDRESS",
    "EMAIL",
    "STATUS"
)
VALUES
    (
        uuid,
        createdAt,
        lastModifiedAt,
        documentType,
        documentId,
        firstName,
        secondName,
        lastName,
        cellphone,
        address,
        email,
        status
    );
commit;
EXCEPTION
   WHEN OTHERS THEN
      dbms_output.put_line( SQLERRM );
END;
/

