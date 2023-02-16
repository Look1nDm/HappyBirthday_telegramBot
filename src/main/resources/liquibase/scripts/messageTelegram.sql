--liquibase formatted sql


-- changeSet lukinD:1
CREATE TABLE notification_task(
id INTEGER,
chat_id INTEGER,
dayOfYear INTEGER,
datetime date,
message TEXT
);