-- app_user
CREATE UNIQUE INDEX uidx_user_email ON app_user(email_address);

-- keyword
CREATE UNIQUE INDEX uidx_keyword_name ON keyword(keyword_name);

-- keyword_instance
CREATE INDEX idx_keyword_instance_keyword_id ON keyword_instance(keyword_id);
CREATE INDEX idx_keyword_instance_record_id ON keyword_instance(recording_id);

-- activity
CREATE UNIQUE INDEX uidx_activity_name ON activity(activity_name);

-- activity_instance
CREATE INDEX idx_activity_instance_activity_id ON activity_instance(activity_id);
CREATE INDEX idx_activity_instance_record_id ON activity_instance(recording_id);

-- mood
CREATE INDEX idx_mood_is_positive ON mood(is_positive);
CREATE UNIQUE INDEX uidx_mood_name ON mood(mood_name);

-- mood_instance
CREATE INDEX idx_mood_instance_mood_id ON mood_instance(mood_id);
CREATE INDEX idx_mood_instance_record_id ON mood_instance(recording_id);

-- daily_recording
CREATE INDEX idx_daily_recording_user ON daily_recording(app_user_id);
CREATE INDEX idx_daily_recording_date ON daily_recording(recording_date);
