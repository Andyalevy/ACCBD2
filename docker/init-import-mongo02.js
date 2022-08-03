db = db.getSiblingDB('accidents')
db.accidents.updateMany({}, [{$set: {location: { "type": "Point", "coordinates": ["$Start_Lng", "$Start_Lat"]}}}]);
db.accidents.createIndex({location:"2dsphere"});
