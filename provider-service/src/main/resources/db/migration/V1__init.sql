create table product_price (
id bigint not null auto_increment,
code varchar(100) not null,
price decimal(15,4) not null,
provider varchar(100) not null,
date_update date not null,
primary key (id)
)engine=InnoDB default charset=utf8;
