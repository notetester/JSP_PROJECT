SELECT * FROM EMPLOYEES;
SELECT JOB_ID, COUNT(JOB_ID) AS 직무별사원수, SUM(SALARY) AS 직무별급여합, AVG(SALARY) AS 직무별급여평균 FROM EMPLOYEES GROUP BY JOB_ID;
CREATE TABLE board (
    bno NUMBER(10,0) CONSTRAINT board_bno_pk PRIMARY KEY, 
    writer VARCHAR2(10) CONSTRAINT board_writer_user_id_fk REFERENCES user(id), 
    title VARCHAR2(20), 
    content VARCHAR2(20), 
    regdate DATE DEFAULT SYSDATE, 
    updatedate DATE DEFAULT SYSDATE
);
CREATE TABLE 댓글 (
    rno NUMBER(10,0) CONSTRAINT 댓글_rno_pk PRIMARY KEY, 
    bno NUMBER(10,0) CONSTRAINT 댓글_bno_board_bno_fk REFERENCES board(bno), 
    writer VARCHAR2(10), 
    content VARCHAR2(20), 
    regdate DATE DEFAULT SYSDATE
);
SELECT RNUM, bno, writer, title, content, regdate, updatedate 
FROM (SELECT ROWNUM AS RNUM, bno, writer, title, content, regdate, updatedate 
    FROM (SELECT bno, writer, title, content, regdate, updatedate
        FROM board
        ORDER BY bno DESC)
    )
WHERE RNUM BETWEEN 1 AND 10;
SELECT B.bno, B.writer, B.title, B.content, B.regdate, B.updatedate, 
    (SELECT COUNT(R.bno) 
    FROM 댓글 R 
    WHERE R.bno=B.bno 
    GROUP BY R.bno)
FROM board B;
SELECT J.JOB_ID, 
    (SELECT COUNT(E.JOB_ID)
    FROM EMPLOYEES E
    WHERE E.JOB_ID=J.JOB_ID
    GROUP BY E.JOB_ID)
FROM JOBS J;
SELECT *
FROM JOBS J
LEFT OUTER JOIN employees E ON j.job_id=E.job_id
LEFT OUTER JOIN job_history H ON j.job_id=H.job_id;