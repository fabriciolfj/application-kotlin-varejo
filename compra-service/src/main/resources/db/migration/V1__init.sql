create table product(
id bigint not null auto_increment,
code varchar(100) not null,
describe_name varchar(100) not null,
price decimal(14,5) not null,
primary key (id)
)engine=InnoDB default charset=utf8;