drop table if exists user;

create table user
(
    id        INT AUTO_INCREMENT
        PRIMARY KEY,
    user_name VARCHAR(255) NULL,
    password  VARCHAR(255) NULL,
    active    BIT          NULL,
    roles     VARCHAR(255) NULL
)