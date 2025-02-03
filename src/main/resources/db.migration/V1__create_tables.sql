CREATE SEQUENCE IF NOT EXISTS account_course_seq START WITH 1 INCREMENT BY 50;

CREATE SEQUENCE IF NOT EXISTS account_rating_seq START WITH 1 INCREMENT BY 50;

CREATE SEQUENCE IF NOT EXISTS course_seq START WITH 1 INCREMENT BY 50;

CREATE SEQUENCE IF NOT EXISTS like_seq START WITH 1 INCREMENT BY 50;

CREATE SEQUENCE IF NOT EXISTS likes_seq START WITH 1 INCREMENT BY 50;

CREATE SEQUENCE IF NOT EXISTS playlist_seq START WITH 1 INCREMENT BY 50;

CREATE SEQUENCE IF NOT EXISTS rating_seq START WITH 1 INCREMENT BY 50;

CREATE SEQUENCE IF NOT EXISTS tb_like_seq START WITH 1 INCREMENT BY 50;

CREATE SEQUENCE IF NOT EXISTS user_account_seq START WITH 1 INCREMENT BY 50;

CREATE SEQUENCE IF NOT EXISTS users_seq START WITH 1 INCREMENT BY 50;

CREATE SEQUENCE IF NOT EXISTS video_seq START WITH 1 INCREMENT BY 50;

CREATE SEQUENCE IF NOT EXISTS comment_seq START WITH 1 INCREMENT BY 50;

CREATE TABLE IF NOT EXISTS account_course
(
    id         BIGINT NOT NULL,
    id_account BIGINT,
    id_course  BIGINT,
    CONSTRAINT account_course_pkey PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS account_rating
(
    id         BIGINT NOT NULL,
    id_rating  BIGINT,
    id_account BIGINT,
    CONSTRAINT account_rating_pkey PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS course
(
    id   BIGINT NOT NULL,
    name VARCHAR(255),
    CONSTRAINT course_pkey PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS likes
(
    id         BIGINT NOT NULL,
    id_account BIGINT,
    id_video   BIGINT,
    CONSTRAINT likes_pkey PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS playlist
(
    id                BIGINT NOT NULL,
    id_account        BIGINT,
    id_account_course BIGINT,
    CONSTRAINT playlist_pkey PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS rating
(
    id           BIGINT NOT NULL,
    rating_point VARCHAR(255),
    CONSTRAINT rating_pkey PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS tb_like
(
    id         BIGINT NOT NULL,
    id_account BIGINT,
    id_video   BIGINT,
    CONSTRAINT tb_like_pkey PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS user_account
(
    id           BIGINT       NOT NULL,
    email        VARCHAR(255) UNIQUE,
    password     VARCHAR(255) NOT NULL,
    phone_number VARCHAR(255) UNIQUE,
    role         VARCHAR(255),
    status       VARCHAR(50),
    CONSTRAINT user_account_pkey PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS users
(
    id         BIGINT       NOT NULL,
    firstname  VARCHAR(255) NOT NULL,
    lastname   VARCHAR(255) NOT NULL,
    id_account BIGINT,
    CONSTRAINT users_pkey PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS video
(
    id           BIGINT NOT NULL,
    category     VARCHAR(255),
    sum_of_likes BIGINT,
    url          VARCHAR(255),
    views        BIGINT,
    id_account   BIGINT,
    CONSTRAINT video_pkey PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS comment
(
    id BIGINT NOT NULL,
    text TEXT,
    id_video BIGINT,
    id_account BIGINT,
    CONSTRAINT comment_pkey PRIMARY KEY (id)
);

ALTER TABLE users
    ADD CONSTRAINT ukhdsjm6l3ludh1inv75noedbpm UNIQUE (id_account);

ALTER TABLE account_course
    ADD CONSTRAINT fk55huilptn1uxkv6ms5lumh21t FOREIGN KEY (id_account) REFERENCES user_account (id) ON DELETE NO ACTION;

ALTER TABLE tb_like
    ADD CONSTRAINT fkjcvccsktm0b5aeuwir1g01xph FOREIGN KEY (id_account) REFERENCES user_account (id) ON DELETE NO ACTION;

ALTER TABLE users
    ADD CONSTRAINT fkjufg4pssckh87o76nf7y52gra FOREIGN KEY (id_account) REFERENCES user_account (id) ON DELETE NO ACTION;

ALTER TABLE playlist
    ADD CONSTRAINT fklad3bxy6mlcf07cqrn8l4eo24 FOREIGN KEY (id_account) REFERENCES user_account (id) ON DELETE NO ACTION;

ALTER TABLE playlist
    ADD CONSTRAINT fkofegjwrubyfn8vodkwvx1sn2d FOREIGN KEY (id_account_course) REFERENCES account_course (id) ON DELETE NO ACTION;

ALTER TABLE account_course
    ADD CONSTRAINT fkpl8yj0dpgfx6q27qaeqnp2lp3 FOREIGN KEY (id_course) REFERENCES course (id) ON DELETE NO ACTION;

ALTER TABLE video
    ADD CONSTRAINT fkpok81kp9sj5a1o8p714n8np8y FOREIGN KEY (id_account) REFERENCES user_account (id) ON DELETE NO ACTION;

ALTER TABLE account_rating
    ADD CONSTRAINT fkq9iuioq3frqtvcu4k7ybt0w1o FOREIGN KEY (id_rating) REFERENCES rating (id) ON DELETE NO ACTION;

ALTER TABLE tb_like
    ADD CONSTRAINT fkt3w1u0jteu6piv1y1ctpqr8vw FOREIGN KEY (id_video) REFERENCES video (id) ON DELETE NO ACTION;

ALTER TABLE account_rating
    ADD CONSTRAINT fkt9soktknm51cepp6h0k0on12o FOREIGN KEY (id_account) REFERENCES user_account (id) ON DELETE NO ACTION;

ALTER TABLE comment
    ADD CONSTRAINT asjidy8q3ihuadf7uiasd8f29iA FOREIGN KEY (id_video) REFERENCES video (id) ON DELETE NO ACTION;

ALTER TABLE comment
    ADD CONSTRAINT jsahbjjdj8828shjak8f83i2992 FOREIGN KEY (id_account) REFERENCES user_account (id) ON DELETE NO ACTION;
