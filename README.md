## Trabajo de promoción Base de Datos 2 - 2022

accident --> nombre de la colección y de la tabla.

## docker-compose up
    En Compose, se usa un archivo YML para configurar los servicios de la 
    aplicación.
    Se utilizan 2 bases de datos, postgres y mongoDB. Además, en el puerto
    8080 se levanta un servidor.

## el proyecto
    Ubicado en la carpeta mongodemo, ejecutar mvn spring-boot:run con las 
    bases de datos ya inicializadas.

## apis
    Las api son utilizadas para enviar y recibir información.
    
    --- beetween Dates ---
    /api/accidents/betweenDates

    Esta api devuelve todos los accidentes ocurridos entre 2 fechas dadas. Se
    envían una fecha de inicio y una fecha de fin y se obtienen los accidentes
    correspondientes a ese rango de fechas.
    
    --- most Common Conditions ---
    /api/accidents/mostCommonConditions    

    Permite obtener la condición más común al momento de que ocurre un accidente,
    y para esto se pueden pasar distintos parametros, tales como la hora en la 
    que ocurrió, el clima, entre otros.
    
    --- accidents near ---
    /api/accidents/accidentsNear    

    Permite, dado un punto geográfico y un radio, devolver los accidentes ocurridos
    allí. Se envian la latitud y longitud como datos para poder realizar dicha consulta.
    
    --- average distance ---
    /api/accidents/averageDistance
    
    Se obtiene una distancia promedio entre el punto de inicio y el punto de fin
    del accidente.
    
    --- five Most Dangerous Points ---
    /api/accidents/fiveMostDangerousPoints    

    Esta api es la que obtiene el nombre de las 5 calles con más accidentes.
    
    --- average Distance From Every Accident To The Nearest Ten ---
    /api/accidents/averageDistanceFromEveryAccidentToTheNearestTen
    
    Api que nos permite devolver la distancia promedio que existe entre cada 
    accidente y los 10 más cercanos.
    
    --- streets With More Accidents ---
    /api/accidents/fiveStreetsWithMoreAccidents

    Devuelve las 5 calles en donde hubo más accidentes.
    
    
    

