
### JPA authorisation with MySql DB

- firstly you have to create `springsecurity` DB in MySql
- run following SQL insert for users creation:

    INSERT INTO user(user_name, password, active, roles)  
    VALUES ('user', 'pass', true, 'ROLE_USER');
    
    INSERT INTO user(user_name, password, active, roles)  
    VALUES ('admin', 'pass', true, 'ROLE_ADMIN');
    
- run the app 
- login with credentials: 

    user  
    pass