create table employees (
    id int primary key auto_increment,
    first_name varchar(255) not null,
    last_name varchar(255) not null
);

create table address (
    id int primary key auto_increment,
    line1 varchar(255) not null,
    line2 varchar(255),
    city varchar(255) not null,
    state varchar(255) not null,
    country varchar(255) not null,
    zip_code varchar(255) not null,
    employee_id int not null,
    foreign key (employee_id) references employees(id)
);