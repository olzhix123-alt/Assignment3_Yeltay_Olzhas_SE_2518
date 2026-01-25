
CREATE TABLE menu_items (
                            id SERIAL PRIMARY KEY,
                            name VARCHAR(100) NOT NULL,
                            price DECIMAL(10, 2) NOT NULL,
                            type VARCHAR(50) NOT NULL 
);


CREATE TABLE orders (
                        id SERIAL PRIMARY KEY,
                        item_id INT REFERENCES menu_items(id), 
                        order_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


INSERT INTO menu_items (name, price, type) VALUES ('Pizza Margherita', 2500, 'Food');
INSERT INTO menu_items (name, price, type) VALUES ('Coca Cola', 500, 'Drink');
