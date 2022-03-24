#docker image used :
https://hub.docker.com/r/oracleinanutshell/oracle-xe-11g

#DDL
src\main\resources\ddl.sql

#endpoint :
http://localhost:8080/person

#produced error :
"Internal Server Error: SQL Error executing Query: ORA-00972: identifier is too long\n"

#problematic SQL :
SELECT P."ID",P."NAME",P."AGE",P."ADDRESS_ID",a."VERY_LONG_COLUMN_NAME_30_CHARS" AS avery_long_column_name_30_chars,a."ANOTHER_VERY_LONG_COLUMN_NAME" AS aanother_very_long_column_name FROM "PERSON" P LEFT JOIN "ADDRESS" a ON P."ADDRESS_ID"=a."ID"
