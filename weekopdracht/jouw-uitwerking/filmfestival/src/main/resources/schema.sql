create table vertoning (
    id int auto_increment primary key,
    film varchar(255),
    starttijd time,
    eindtijd time
);

create table dagplanning (
     id int auto_increment primary key,
     versie int,
     datum date
);

create table onderdeel (
    dagplanning int,
    vertoning varchar(255),
    starttijd time,
    eindtijd time,

    foreign key (dagplanning) references dagplanning (id),
    foreign key (vertoning) references vertoning(id)
);
