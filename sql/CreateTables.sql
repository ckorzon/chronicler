-- Delete tables if they already exist
DROP TABLE keyword_instance;
DROP TABLE activity_instance;
DROP TABLE mood_instance;
DROP TABLE keyword;
DROP TABLE activity;
DROP TABLE mood;
DROP TABLE daily_recording;
DROP TABLE app_user;

-- Create tables
CREATE TABLE app_user (
    app_user_id SERIAL NOT NULL,
    first_name VARCHAR(64) NOT NULL,
    last_name VARCHAR(64) NOT NULL,
    email_address VARCHAR(64) NOT NULL,
    signup_date DATE NOT NULL,
    PRIMARY KEY (app_user_id)
);

CREATE TABLE daily_recording (
    recording_id BIGSERIAL NOT NULL,
    app_user_id INT4 NOT NULL,
    recording_date DATE NOT NULL,
    journal_entry VARCHAR(1000),
    created_at TIMESTAMP NOT NULL,
    updated_at TIMESTAMP NOT NULL,
    PRIMARY KEY (recording_id),
    FOREIGN KEY (app_user_id) REFERENCES app_user
);

CREATE TABLE mood (
    mood_id SERIAL NOT NULL,
    mood_name VARCHAR(32) NOT NULL,
    is_positive BOOLEAN NOT NULL,
    PRIMARY KEY (mood_id)
);

CREATE TABLE mood_instance (
    mood_inst_id BIGSERIAL NOT NULL,
    mood_id INT4 NOT NULL,
    recording_id INT8 NOT NULL,
    PRIMARY KEY (mood_inst_id),
    FOREIGN KEY (mood_id) REFERENCES mood,
    FOREIGN KEY (recording_id) REFERENCES daily_recording
);

CREATE TABLE activity (
    activity_id SERIAL NOT NULL,
    activity_name VARCHAR(32) NOT NULL,
    PRIMARY KEY (activity_id)
);

CREATE TABLE activity_instance (
    activity_inst_id BIGSERIAL NOT NULL,
    activity_id INT4 NOT NULL,
    recording_id INT8 NOT NULL,
    duration DECIMAL(2),
    PRIMARY KEY (activity_inst_id),
    FOREIGN KEY (activity_id) REFERENCES activity,
    FOREIGN KEY (recording_id) REFERENCES daily_recording
);

CREATE TABLE keyword (
    keyword_id SERIAL NOT NULL,
    keyword_name VARCHAR(64) NOT NULL,
    PRIMARY KEY (keyword_id)
);

CREATE TABLE keyword_instance (
    keyword_inst_id BIGSERIAL NOT NULL,
    keyword_id INT4 NOT NULL,
    recording_id INT8 NOT NULL,
    PRIMARY KEY (keyword_inst_id),
    FOREIGN KEY (keyword_id) REFERENCES keyword,
    FOREIGN KEY (recording_id) REFERENCES daily_recording
);

