create table product(
id bigint not null auto_increment,
code varchar(100) not null,
describe_name varchar(100) not null,
primary key (id)
)engine=InnoDB default charset=utf8;

create table product_provider(
id bigint not null auto_increment,
product_id bigint not null,
provider varchar(100) not null,
price decimal(14,5) not null,
last_date date not null,
primary key (id),
foreign key (product_id) references product(id)
)engine=InnoDB default charset=utf8;