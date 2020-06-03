--LOWER(소문자), INITCAP(앞글자만 대문자로), UPPER(대문자)
SELECT 'asdDEF' FROM DUAL;
SELECT 'asdDEF',LOWER('asdDEF'),UPPER('asdDEF') FROM DUAL;
SELECT LAST_NAME,LOWER(LAST_NAME),UPPER(LAST_NAME),INITCAP(LAST_NAME) FROM EMPLOYEES;
SELECT * FROM EMPLOYEES WHERE LOWER(LAST_NAME)='abel';
--LENGTH(길이), INSTR(문자 찾기)
SELECT 'abcdef' AS EXAMPLE, LENGTH('abcdef'), INSTR('abcdef','b') FROM DUAL;
SELECT FIRST_NAME, LENGTH(FIRST_NAME), INSTR(FIRST_NAME,'a') FROM EMPLOYEES;
--SUBSTR(문자열 자르기), CONCAT(문자열 연결)
SELECT 'abcdef' AS EXAMPLE, SUBSTR('abcdef',1,3), CONCAT('안녕','하세요') FROM DUAL;
SELECT FIRST_NAME,SUBSTR(FIRST_NAME,1,2),CONCAT(FIRST_NAME,LAST_NAME) FROM EMPLOYEES;
--LPAD, RPAD (좌 우측 지정문자열로 채우기)
SELECT LPAD('abc',10,'*') FROM DUAL;
SELECT RPAD('abc',10,'*') FROM DUAL;
--LTRIM,RTRIM,TRIM(공백제거)
SELECT LTRIM('javascript_java','java') FROM DUAL;--좌측 제거
SELECT RTRIM('javascript_java','java') FROM DUAL;--우측 제거
SELECT TRIM('    java    ') FROM DUAL;--양 옆 공백을 제거
--REPLACE(문자열)
SELECT REPLACE('my dream is a president','president','doctor')FROM DUAL;
SELECT REPLACE('my dream is a president',' ','')FROM DUAL;
SELECT REPLACE(REPLACE('my dream is a president','president','doctor'),' ','')FROM DUAL;
SELECT REPLACE(CONCAT('hello ','world'),' ','')FROM DUAL;