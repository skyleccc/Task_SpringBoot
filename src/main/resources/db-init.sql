-- Create database if it doesn't exist
CREATE DATABASE IF NOT EXISTS task_db;

-- Use the database
USE task_db;

-- Create users table (if not auto-created by Hibernate)
-- This is just for reference, Hibernate will create it automatically with ddl-auto=update
-- CREATE TABLE IF NOT EXISTS users (
--     id BIGINT AUTO_INCREMENT PRIMARY KEY,
--     username VARCHAR(255) UNIQUE NOT NULL,
--     password VARCHAR(255) NOT NULL,
--     email VARCHAR(255) UNIQUE NOT NULL,
--     user_role VARCHAR(50) NOT NULL
-- );
