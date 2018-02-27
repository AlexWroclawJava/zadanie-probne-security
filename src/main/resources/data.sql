INSERT INTO USER(username, password, enabled) values('admin', '$2a$10$oTeuiys8LQBg/eHXgq2ByOs6sRZzZYeNLVzZc11zaYWvmWzYn2l/2', true);
INSERT INTO USER(username, password, enabled) values('user', '$2a$10$oTeuiys8LQBg/eHXgq2ByOs6sRZzZYeNLVzZc11zaYWvmWzYn2l/2', true);
INSERT INTO USER_ROLE(username, role) values('admin', 'ROLE_ADMIN');
INSERT INTO USER_ROLE(username, role) values('user', 'ROLE_USER');

