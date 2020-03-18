ALTER TABLE products ADD INDEX idx_product_code(product_code);
EXPLAIN SELECT * FROM products WHERE product_code = 1;
ALTER TABLE products ADD INDEX idx_product(product_name, product_price);
EXPLAIN SELECT * FROM products WHERE product_code = 1;

CREATE VIEW product_views AS
SELECT product_code, product_name, product_price,product_status FROM  products;

CREATE OR REPLACE VIEW product_views AS
SELECT product_code, product_name, product_price FROM products;

DROP VIEW product_views;

DELIMITER //
CREATE PROCEDURE findAllProducts()
BEGIN
  SELECT * FROM products;
END //
DELIMITER ;
call findAllProducts();

DELIMITER //
CREATE PROCEDURE addProduct()
BEGIN
  INSERT INTO `quan_ly_thu_vien`.`products` (`id`, `product_code`, `product_name`, `product_price`, `product_amount`, `product_description`, `product_status`) VALUES ('5', '5', 'Huy', '20000', '2334234', 'afsdfsd', 'fsdfsd');
END //
DELIMITER ;
call addProduct();
call findAllProducts();

DELIMITER //
CREATE PROCEDURE delete_id(IN id_product INT(11))
BEGIN
  Delete FROM products WHERE id = id_product;
END //
DELIMITER ;
call delete_id(5);
call findAllProducts();

DELIMITER //
CREATE PROCEDURE update_id(IN id_product INT(11))
BEGIN
  UPDATE products SET id = 5
WHERE id=id_product;
END //
DELIMITER ;
call update_id(1);
call findAllProducts();



