CREATE TABLE IF NOT EXISTS customers (
    id SERIAL PRIMARY KEY,
    login VARCHAR NOT NULL,
    password VARCHAR NOT NULL,
    address VARCHAR NOT NULL,
    phone_number VARCHAR NOT NULL
)