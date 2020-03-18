DELIMITER //
CREATE PROCEDURE findAllUsers()
BEGIN
  SELECT * FROM users;
END //
DELIMITER ;

DELIMITER //
CREATE PROCEDURE update_id(in id_user int(11),IN name_user varchar(50),IN email_user varchar(255),in country_user varchar(255) )
BEGIN
  UPDATE users SET name = name_user, email=email_user, country=country_user
WHERE id=id_user;
END //
DELIMITER ;

DELIMITER //
CREATE PROCEDURE delete_id(IN id_users INT(11))
BEGIN
  Delete FROM users WHERE id = id_users;
END //
DELIMITER ;
