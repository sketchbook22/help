insert into ape(version, id, color) values (1, 1, 'apricot')
insert into bat(version, id, color, zooKeeper) values (1, 1, 'brown', 1)
insert into bat(version, id, color, zooKeeper) values (1, 1, 'blue', 1)
insert into sample_person(version, id, ape, bats, c, d, e) values (1, 1, 1, ARRAY [1, 2], 'c', 'd', 'e')
