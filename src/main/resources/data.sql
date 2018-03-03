INSERT INTO USER(username, password, enabled) values('admin','admin', true);
INSERT INTO USER(username, password, enabled) values('user', 'user', true);
INSERT INTO USER_ROLE(username, role) values('admin', 'ROLE_ADMIN');
INSERT INTO USER_ROLE(username, role) values('user', 'ROLE_USER');

-- dla admina haslo
-- $2a$10$oTeuiys8LQBg/eHXgq2ByOs6sRZzZYeNLVzZc11zaYWvmWzYn2l/2

-- dla usera haslo
-- $2a$10$oTeuiys8LQBg/eHXgq2ByOs6sRZzZYeNLVzZc11zaYWvmWzYn2l/2



