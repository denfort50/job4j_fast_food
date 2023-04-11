CREATE TABLE IF NOT EXISTS orders (
    id SERIAL PRIMARY KEY,
    created TIMESTAMP NOT NULL,
    customer_id INT REFERENCES customers(id),
    product_id INT REFERENCES products(id),
    status_id INT REFERENCES status(id)
)