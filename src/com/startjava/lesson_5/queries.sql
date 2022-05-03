SELECT * FROM jaegers;
SELECT * FROM jaegers WHERE status != 'Destroyed';
SELECT * FROM jaegers WHERE mark in ('Mark-1', 'Mark-5');
SELECT * FROM jaegers WHERE mark in ('Mark-1', 'Mark-5') ORDER BY mark DESC;
SELECT * FROM jaegers WHERE launch in (SELECT min(launch) FROM jaegers);
SELECT * FROM jaegers WHERE kaijuKill in (SELECT min(kaijuKill) FROM jaegers UNION SELECT max(kaijuKill) FROM jaegers);
SELECT avg(weight) FROM jaegers;
UPDATE jaegers SET kaijuKill = kaijuKill + 1 WHERE status != 'Destroyed';
DELETE FROM jaegers WHERE status = 'Destroyed';