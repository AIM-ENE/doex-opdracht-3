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

    -- Bestelling -> Geld

    status varchar(255)
);

create table bestelregel (
    bestelling int,
    product int,
    aantal int,

    -- Bestelregel -> Geld

    -- Bestelling -> Bestelregel

    -- Bestelregel -> Product

);

