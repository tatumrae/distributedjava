drop table product;

create table product (
    id varchar(5) primary key,
    name varchar(50),
    imageURL varchar(100),
    description varchar(500),
    price decimal(10,2)
);

insert into product(id, name, imageURL, description, price) values (
'1', 'Donkey Tail', 'images/Donkey_Tail_600_400.jpg', 'A trailing plant with wiry stems densely covered with short thick leaves. Similar to Burrito except with larger, longer leaves. Silvery lime-green color, sometimes with a yellowish tint. Ideal for hanging baskets. Not frost hardy.'
, 3.95
);
insert into product(id, name, imageURL, description, price) values (
'2', 'Portulacaria Afra Variegata', 'images/PORTULACARIA_AFRA_VARIEGATA_600_400.jpg', 'Sprawling, slow grower. Easily controlled by container size. Excellent bonsai choice. Light green 3/4 long leaves with creamy white edges and purplish red stems. Drought tolerant. Tender soft succulent - will not tolerate frost.'
, 3.95
);
insert into product(id, name, imageURL, description, price) values (
'3', 'Parva', 'images/Parva_600_400.jpg', 'grows in a mat of icy blue rosettes. Bright red spots of color adorn the leaf tips. This is a smaller echeveria variety (in latin, parva means dwarf). For best results plant in full to partial sun. Bicolor bell shaped golden and orange flowers appear in spring and early summer.'
, 2.95
);
insert into product(id, name, imageURL, description, price) values (
'4', 'Echeveria Perle Von Nurnberg', 'images/Perle_Von_Nurnberg_600_400.jpg', 'Lovely pink color and elegant leaf shape. Drought tolerant. Tender soft succulent - will not tolerate frost. Great for weddings.'
, 3.45
);
insert into product(id, name, imageURL, description, price) values (
'5', 'Powder Puff Graptoveria', 'images/Powder_Puff_Graptoveria_600_400.jpg', 
'Echeveria hybrid. Plump gray-green leaves with blushes of pink. Heat and drought tolerant. Moderate growth rate. Not frost hardy. Formerly listed as Pachyphytum sp.'
, 4.45
);
insert into product(id, name, imageURL, description, price) values (
'6', 'Sedevaria Jet Bead', 'images/Sedevaria_Jet_Bead_600_400.jpg', 
'Small pointed leaves with a color range of dark bronze green to black. Short, semi upright stems. Drought and heat tolerant. Nice in containers. Good houseplant with easy care.'
, 4.45
);
insert into product(id, name, imageURL, description, price) values (
'7', 'Zebra Haworthia', 'images/Zebra_Haworthia_600_400.jpg', 'White ridges formed horizontally across dark green foliage resembles zebra striping. Forms 6 to 8 inch clumps, 3 to 4 inches tall. Great indoor plant on sunny or bright windowsills. Needs good drainage. Heat and drought tolerant. Tender soft succulent - will not tolerate frost.'
, 3.95
);
insert into product(id, name, imageURL, description, price) values (
'8', 'Echeveria Black Prince', 'images/black_prince_600_400.jpg', 'Beautiful dark green to black rosettes. Drought tolerant. Frost tender succulent.'
, 3.95
);
insert into product(id, name, imageURL, description, price) values (
'9', 'Jelly Bean', 'images/jelly_bean_600_400.jpg', 'Small bead-like leaves in lovely shades of pale green, pink and cream. Grows easily from pieces when they drop onto the soil. Tender soft succulent. Not frost hardy.'
, 3.95
);
insert into product(id, name, imageURL, description, price) values (
'10', 'Panda Ear', 'images/panda_ear_600_400.jpg', 'Long, fuzzy, felt like, oval shaped leaves. Soft gray with chocolate brown margins and tips. Drought tolerant. Water when dry. Adequate drainage. Will not tolerate frost.'
, 4.45
);
insert into product(id, name, imageURL, description, price) values (
'11', 'String of Pearls', 'images/string_of_pearls_600_400.jpg', 'Strands of pearl shaped green beads. Trailing habit, excellent in hanging containers. Not frost hardy.'
, 3.95
);
    