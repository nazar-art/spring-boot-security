INSERT IGNORE INTO  user(user_name, password, active, roles)
VALUES ('user', 'pass', true, 'ROLE_USER'),
       ('admin', 'pass', true, 'ROLE_ADMIN');
