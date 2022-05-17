import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.*;

public class App {
    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }

    public static void main(String[] args) {

        port(getHerokuAssignedPort());
        staticFileLocation("/public");
        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<>(); // new model is made to store information
            return new ModelAndView(model, "index.hbs"); // assemble individual pieces and render
        }, new HandlebarsTemplateEngine()); //

        get("/hero",(request, response) -> {
            List<Object> list=new ArrayList<>();
            Map<String, Object> model = new HashMap<>(); // new model is made to store information
            list.add("heroName");
            list.add("heroAge");
            list.add("heroAbility");
            list.add("heroWeakness");
            map.put("heroList",list);
            return new ModelAndView(model, "hero.hbs"); // assemble individual pieces and render
        }, new HandlebarsTemplateEngine()); //

        get("/squad",(request, response) -> {
            List<Object> list=new ArrayList<>();
            Map<String, Object> model = new HashMap<>(); // new model is made to store information
            list.add("squadName");
            list.add("maxSize");
            list.add("squadCause");
            map.put("squadList",list);
            return new ModelAndView(model, "squad.hbs"); // assemble individual pieces and render
        }, new HandlebarsTemplateEngine()); //
        }
    }
