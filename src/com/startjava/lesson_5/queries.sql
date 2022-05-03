select * from jaegers;
select * from jaegers where status != 'Destroyed';
select * from jaegers where mark in ('Mark-1', 'Mark-5');
select * from jaegers where mark in ('Mark-1', 'Mark-5') order by mark desc;
select * from jaegers where launch in (select min(launch) from jaegers);
select * from jaegers where kaijuKill in (select min(kaijuKill) from jaegers union select max(kaijuKill) from jaegers);
select avg(weight) from jaegers;
update jaegers set kaijuKill = kaijuKill + 1 where status != 'Destroyed';
delete from jaegers where status = 'Destroyed';