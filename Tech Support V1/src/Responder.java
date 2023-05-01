/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response.
 * 
 * @author     Michael Kolling and David J. Barnes
 * @version    0.1
 */

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;
public class Responder
{
    private HashMap<String,String> responseMap;
    private ArrayList<String> defaultResponses;
    private Random randomGenerator;
    public Responder()
    {
        responseMap = new HashMap<String,String>();
        fillResponseMap();
        defaultResponses = new ArrayList<String>();
        fillDefaultResponses();
        randomGenerator = new Random();
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        return "That sounds interesting. Tell me more...";
    }
}
