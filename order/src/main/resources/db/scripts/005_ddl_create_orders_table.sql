CREATE TABLE IF NOT EXISTS orders (
    id SERIAL PRIMARY KEY,
    created TIMESTAMP NOT NULL,
    customer_id INT NOT NULL REFERENCES customers(id),
    product_id INT NOT NULL REFERENCES products(id),
    status_id INT NOT NULL REFERENCES status(id)
)