


/* 02/23/2015 */

alter table cut_offs add date_to datetime;
update cut_offs set date_to=date_added;

/*02/13/2015 */

drop table if exists cut_offs;
create table cut_offs(
id int auto_increment primary key
,date_added datetime
,added_by varchar(100)
);

