-- survey_question table
CREATE TABLE survey_question
(
    id           int8 NOT NULL GENERATED ALWAYS AS IDENTITY,
    date_created timestamp NULL,
    date_updated timestamp NULL,
    "version"    int4 NOT NULL,
    question     varchar(255) NULL,
    CONSTRAINT survey_question_pkey PRIMARY KEY (id)
);

-- survey_choice table
CREATE TABLE survey_choice
(
    id           int8 NOT NULL GENERATED ALWAYS AS IDENTITY,
    date_created timestamp NULL,
    date_updated timestamp NULL,
    "version"    int4 NOT NULL,
    "label"      varchar(255) NULL,
    survey_question_id    int8 NOT NULL,
    CONSTRAINT survey_choice_pkey PRIMARY KEY (id),
    CONSTRAINT fk_survey_question FOREIGN KEY (survey_question_id) REFERENCES survey_question (id)
);

-- survey_reply table
CREATE TABLE survey_reply
(
    id           int8 NOT NULL GENERATED ALWAYS AS IDENTITY,
    date_created timestamp NULL,
    date_updated timestamp NULL,
    "version"    int4 NOT NULL,
    replied_by   varchar(255) NULL,
    CONSTRAINT survey_reply_pkey PRIMARY KEY (id)
);

-- survey_reply_detail table
CREATE TABLE survey_reply_detail
(
    id               int8 NOT NULL GENERATED ALWAYS AS IDENTITY,
    date_created     timestamp NULL,
    date_updated     timestamp NULL,
    "version"        int4 NOT NULL,
    survey_question_id        int8 NOT NULL,
    survey_choice_id int8 NOT NULL,
    survey_reply_id  int8 NOT NULL,
    CONSTRAINT survey_reply_detail_pkey PRIMARY KEY (id),
    CONSTRAINT fk_survey_question FOREIGN KEY (survey_question_id) REFERENCES survey_question (id),
    CONSTRAINT fk_survey_choice FOREIGN KEY (survey_choice_id) REFERENCES survey_choice (id),
    CONSTRAINT fk_survey_reply FOREIGN KEY (survey_reply_id) REFERENCES survey_reply (id)
);