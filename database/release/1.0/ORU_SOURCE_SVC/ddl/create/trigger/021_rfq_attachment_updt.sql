DELIMITER //
CREATE TRIGGER rfq_attachment_updt BEFORE UPDATE
ON rfq_attachment FOR EACH ROW
BEGIN
	SET NEW.update_timestamp = CURRENT_TIMESTAMP();
END //
DELIMITER ;
