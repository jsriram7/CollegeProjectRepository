package org.modelinc.model;

import java.net.UnknownHostException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONObject;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.util.JSON;

@Path("/Model")
public class Model {

  @POST
  @Path("/createModel")
  @Consumes(MediaType.APPLICATION_JSON)
  public Response insertModelCollectionIntoDatabase(String jsonString) {
    DBObject dbObject = (DBObject) JSON.parse(jsonString);
    try {
      //MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
      MongoClient mongoClient = new MongoClient();
      DB db = mongoClient.getDB("sskdb");
      
      DBCollection collection = db.getCollection("BaseCollectionV1");
      collection.insert(dbObject);
      String output=jsonString;
      return Response.status(200).entity(output).build();
    } catch (UnknownHostException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
      String output=jsonString;
      return Response.status(400).entity(output).build();
    }
    
    
  }
  
  @GET
  @Path("/getmodel")
  public Response getMsg() {
      MongoClient mongoClient;
      String finalOutput="" + "\n";
      JSONObject jsonObject =null;
      try {
          mongoClient = new MongoClient();
          DB db = mongoClient.getDB( "sskdb" );
          DBObject dbObject=null;
          DBCollection coll = db.getCollection("BaseCollectionV1");
          DBCursor cursor = coll.find();
        while(cursor.hasNext()) {
                     
            finalOutput=finalOutput+JSON.serialize(cursor.next());
          }
          } catch (UnknownHostException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
      }
            return Response.status(200).entity(finalOutput).build();

  }
}
