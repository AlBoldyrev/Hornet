CREATE TABLE words_table
(
    id UUID PRIMARY KEY,
    value TEXT
);

CREATE TABLE word_translations_table
(
    id            UUID PRIMARY KEY,
    word_id       UUID REFERENCES words_table (id),
    language_code VARCHAR(10),
    value         TEXT
);

CREATE TABLE users_table
(
    id         UUID PRIMARY KEY,
    first_name VARCHAR(100),
    last_name  VARCHAR(100),
    email      VARCHAR(255)
);
