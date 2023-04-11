CREATE TABLE IF NOT EXISTS notifications (
    id SERIAL PRIMARY KEY,
    message VARCHAR NOT NULL,
    created TIMESTAMP NOT NULL,
    status_id INT REFERENCES status(id)
)