-- Each user must have one journal recording per day
ALTER TABLE daily_recording ADD CONSTRAINT unq_user_recording UNIQUE (app_user_id, recording_date);

-- Only one instance of any mood allowed per each daily recording
ALTER TABLE mood_instance ADD CONSTRAINT unq_recording_mood UNIQUE (recording_id, mood_id);

-- Only one instance of any activity allowed per each daily recording
ALTER TABLE activity_instance ADD CONSTRAINT unq_recording_activity UNIQUE (recording_id, activity_id);

-- Only one instance of any keyword allowed per each daily recording
ALTER TABLE keyword_instance ADD CONSTRAINT unq_recording_keyword UNIQUE (recording_id, keyword_id);
