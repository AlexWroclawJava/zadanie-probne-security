INSERT INTO USER(id, username, password, enabled) values(1, 'user','user', true);
INSERT INTO USER(id, username, password, enabled) values(2, 'admin','admin', true);
INSERT INTO USER_ROLE(id, username, role) values(1,'admin', 'ROLE_ADMIN');
INSERT INTO USER_ROLE(id, username, role) values(2, 'user', 'ROLE_USER');

INSERT INTO USER(id, username, password, name, lastname, phone, enabled) VALUES(3, 'alex', 'usera', 'Alex', 'Szlachcic', 662662582, true);
INSERT INTO USER(id, username, password, name, lastname, phone, enabled) VALUES(4, 'konrad', 'userk', 'Konrad', 'Wudkowski',662652582, true);
INSERT INTO USER(id, username, password, name, lastname, phone, enabled) VALUES(5, 'darex', 'userd', 'Darek', 'Paliczko', 145264578, true);
INSERT INTO USER(id, username, password, name, lastname, phone, enabled) VALUES(6, 'michal', 'userm', 'MIchal', 'Piechot', 516487597, true);
INSERT INTO USER(id, username, password, name, lastname, phone, enabled) VALUES(7, 'lukasz', 'userl', 'Lukasz', 'Martin', 516485798, true);


-- dla admina haslo
-- $2a$10$oTeuiys8LQBg/eHXgq2ByOs6sRZzZYeNLVzZc11zaYWvmWzYn2l/2

-- dla usera haslo
-- $2a$10$oTeuiys8LQBg/eHXgq2ByOs6sRZzZYeNLVzZc11zaYWvmWzYn2l/2



