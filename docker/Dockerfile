FROM mongo:latest 

COPY US_Accidents_Dec19.csv /US_Accidents_Dec19.csv

EXPOSE 27017

CMD mongoimport --host mongodb -d acc -c acc --type=csv --headerline --file /US_Accidents_Dec19.csv