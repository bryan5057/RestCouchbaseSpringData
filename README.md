# RestCouchbaseSpringData

Uses the default bucket named "default" to store Travelers.  You also have to create and publish this view in Couchbase:

Name:  _design/traveler/_view/all

Code:

  function (doc, meta) {
     if (doc._class == "com.travelport.RestCouchbaseSpring.Data.Traveler") {
        emit(meta.id, null);
     }
  }
  
  
Here's a sample 'create' JSON body for this Couchbase demo:
  
{
  "id" : "1",	
  "firstName" : "Bilbo", 
  "lastName"  : "Baggins"
}