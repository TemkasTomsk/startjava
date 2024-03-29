SELECT * FROM robots;
SELECT * FROM robots WHERE kaijukill > '5';
SELECT * FROM robots WHERE kaijukill = (SELECT max(kaijukill) FROM robots);
SELECT * FROM robots WHERE kaijukill = (SELECT min(kaijukill) FROM robots);
SELECT * FROM robots ORDER BY kaijukill;
SELECT * FROM robots ORDER BY kaijukill DESC;
SELECT modelname, mark, origin FROM robots ORDER BY mark;
SELECT modelname, mark, origin FROM robots WHERE origin = 'USA' ORDER BY mark;
SELECT modelname, mark, origin FROM robots WHERE origin = 'USA' ORDER BY mark DESC;
SELECT modelname, mark, origin FROM robots WHERE origin = 'USA' AND mark = 'mark-1' ORDER BY mark;
SELECT * FROM robots WHERE launch = (SELECT min(launch) FROM robots);
SELECT * FROM robots WHERE launch = (SELECT max(launch) FROM robots);
SELECT avg(weight) FROM robots;
UPDATE robots SET status = 'Operated' WHERE modelname = 'Striker Eureka';
UPDATE robots SET kaijukill = kaijukill + 1 WHERE status = 'Operated';
DELETE FROM robots WHERE status = 'Destroyed';
