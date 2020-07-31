USE `testdb`;

DELETE FROM `customer_table`;

INSERT INTO `customer_table`
    (`cus_Name`, `cus_Address`, `cus_Telno`)
VALUES
    ('Alex', 'California', 00000),
    ('Dana', 'Florida', 11111),
    ('Jamie', 'Iowa', 22222),
    ('Morgan', 'Kansas', 33333),
    ('Robin', 'Idaho', 44444),
    ('Terry', 'Alaska', 55555),
    ('Chris', 'Texas', 66666),
    ('Pat', 'Vermont', 77777),
    ('Tracey', 'Wisconsin', 88888),
    ('Ronnie', 'Utah', 99999);