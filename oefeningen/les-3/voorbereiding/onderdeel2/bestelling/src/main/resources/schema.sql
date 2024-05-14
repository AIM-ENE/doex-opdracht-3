create table product (
    id int auto_increment primary key,
    versie int,
    naam varchar(255),
    aantal_centen integer,
    valuta varchar(255)
);

create table bestelling (
    id int auto_increment primary key,
    versie int,
    aantal_centen int,
    valuta varchar(255),
    status varchar(255)
);

create table bestelregel (
    bestelling int,
    product int,
    aantal int,
    aantal_centen integer,
    valuta varchar(255),
    foreign key (bestelling) references bestelling(id),
    foreign key (product) references product(id)
);

