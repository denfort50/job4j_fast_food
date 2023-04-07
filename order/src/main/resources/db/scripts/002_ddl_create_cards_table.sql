CREATE TABLE IF NOT EXISTS cards (
    id SERIAL PRIMARY KEY,
    balance FLOAT NOT NULL,
    customer_id INT NOT NULL REFERENCES customers(id)
)