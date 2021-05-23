INSERT INTO public.survey_question
(id, date_created, date_updated, "version", question)
VALUES(1, now(), now(), 1, 'How have patient satisfaction ratings changed at your organization in the past year?');
INSERT INTO public.survey_question
(id, date_created, date_updated, "version", question)
VALUES(2, now(), now(), 1, 'How important is patient satisfaction within your organization?');


insert  into public.survey_choice (id, date_created, date_updated, "version", "label", survey_question_id) VALUES(1, now(), now(), 1, 'Improved considerably', 1);
insert  into public.survey_choice (id, date_created, date_updated, "version", "label", survey_question_id) VALUES(2, now(), now(), 1, 'Improved somewhat', 1);
insert  into public.survey_choice (id, date_created, date_updated, "version", "label", survey_question_id) VALUES(3, now(), now(), 1, 'Has remained about the same', 1);
insert  into public.survey_choice (id, date_created, date_updated, "version", "label", survey_question_id) VALUES(4, now(), now(), 1, 'Has declined somewhat', 1);
insert  into public.survey_choice (id, date_created, date_updated, "version", "label", survey_question_id) VALUES(5, now(), now(), 1, 'Has declined considerably', 1);
insert  into public.survey_choice (id, date_created, date_updated, "version", "label", survey_question_id) VALUES(6, now(), now(), 1, 'Do not know', 1);

insert  into public.survey_choice (id, date_created, date_updated, "version", "label", survey_question_id) VALUES(7, now(), now(), 1, 'It is a high priority', 2);
insert  into public.survey_choice (id, date_created, date_updated, "version", "label", survey_question_id) VALUES(8, now(), now(), 1, 'It is a medium priority', 2);
insert  into public.survey_choice (id, date_created, date_updated, "version", "label", survey_question_id) VALUES(9, now(), now(), 1, 'It is a low priority', 2);
insert  into public.survey_choice (id, date_created, date_updated, "version", "label", survey_question_id) VALUES(10, now(), now(), 1, 'Do not know', 2);

