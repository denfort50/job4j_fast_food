CREATE TABLE IF NOT EXISTS dishes (
    id SERIAL PRIMARY KEY,
    name VARCHAR NOT NULL,
    price FLOAT NOT NULL,
    order_id INT NOT NULL REFERENCES orders(id)
)