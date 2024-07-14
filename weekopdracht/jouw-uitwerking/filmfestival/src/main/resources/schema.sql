create table film (
    id   int auto_increment primary key ,
    titel varchar(255),
    duur bigint
);

create table dag_agenda (
    id int auto_increment primary key,
    versie int,
    datum date
);

create table vertoning (
    dag_agenda int,
    film varchar(255),
    locatie varchar(255),
    starttijd time,
    eindtijd time,

);
