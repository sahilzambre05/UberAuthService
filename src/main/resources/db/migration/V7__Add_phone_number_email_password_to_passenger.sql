ALTER TABLE passenger
    ADD COLUMN IF NOT EXISTS email varchar(255) DEFAULT '' NOT NULL,
    ADD COLUMN IF NOT EXISTS `password` varchar(255) DEFAULT '' NOT NULL;

UPDATE passenger SET name = '' WHERE name IS NULL;

ALTER TABLE passenger
    MODIFY name varchar(255) NOT NULL;
