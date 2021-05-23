## System requirements
Java 11
Gradle 7.0.2

## Run
gradle bootRun

## Flyway schema create and update
gradle -Dflyway.configFiles=src/main/resources/application.properties flywayMigrate

## Entity diagram
entity-diagram.png

## Sample survey sql
sample-survey-config.sql

## Curl request to invoke api's
### Get survey question and choices
curl --request GET \
  --url http://localhost:8080/api/survey/ \
  --header 'Content-Type: application/json'

### Post survey reply
curl --request POST \
  --url http://localhost:8080/api/survey/replies \
  --header 'Content-Type: application/json' \
  --data '{
	"repliedBy": "Rohit",
	"questionReplies": [
		{
			"question": {
				"id": 1
			},
			"choice": {
				"id": 4
			}
		},
		{
			"question": {
				"id": 2
			},
			"choice": {
				"id": 9
			}
		}
	]
}'
