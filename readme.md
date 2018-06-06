CREATE USER tom WITH PASSWORD 'myPassword';
CREATE DATABASE jerry;
GRANT ALL PRIVILEGES ON DATABASE jerry to tom;
 \q
psql -d jerry -U tom

CREATE TABLE myentity
(
  id bigint NOT NULL,
  jsonproperty jsonb,
  CONSTRAINT myentity_pkey PRIMARY KEY (id)
)

CREATE SCHEMA hollywood;
CREATE TABLE hollywood.films (title text, release date, awards text[]);