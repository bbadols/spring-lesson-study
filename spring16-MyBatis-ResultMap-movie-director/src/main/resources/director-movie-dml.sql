-- director-movie-dml.sql

-- 통계 SQL(statistics) 감독별 통계 정보 조회 : SUM(), ROUND(AVG())
-- director_id 감독아이디, director name 감독이름, totalAttendance 총 관객수, averageAttendance 평균 관객수

SELECT
d.director_id AS directorId,
d.director_name AS directorName,
SUM(m.attendance) AS totalAttendance,
ROUND(AVG(m.attendance),0) AS averageAttendance
FROM director d
INNER JOIN movie m ON d.director_id = m.director_id
GROUP BY d.director_id,d.director_name
ORDER BY totalAttendance DESC;

-- GROUP BY d.director_id,d.director_name : 감독 아이디와 감독명의 복합 정보를 기준으로 그룹화 한다

-- movie_id로 movie 정보만 조회해본다
SELECT * FROM movie WHERE movie_id=1;

SELECT * FROM director WHERE director_id=1;

-- 위 두 SQL 문을 joine 하여 한번에 1번 아이디 영화의 영화정보와 해당 감독 정보를 함께 조회한다
-- 전체 영화(감독) 리스트 : 게시물 리스트 화면에 필요한 항목(column)만 조회
SELECT m.movie_id,m.title,d.director_id,d.director_name
FROM movie m
INNER JOIN director d ON m.director_id = d.director_id
ORDER BY m.movie_id ASC;

-- 개별 영화(감독) 조회 : 상세 게시물 조회( 많은 컬럼을 상세히 조회)
SELECT m.movie_id,m.title,m.genre,m.attendance,d.director_id,d.director_name,d.intro
FROM movie m
INNER JOIN director d ON m.director_id = d.director_id
WHERE m.movie_id = 1



SELECT
  m.movie_id AS movieId,
  m.title AS movieName,
  m.genre AS movieGenre,
  d.director_name AS directorName
FROM movie m
INNER JOIN director d ON d.director_id = m.director_id
ORDER BY d.director_Name, m.title DESC;


