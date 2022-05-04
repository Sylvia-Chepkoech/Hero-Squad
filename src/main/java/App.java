import static spark.Spark.*;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import java.util.ArrayList;
import models.Heros;
import models.Squad;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");
        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        get("/heros/new",(request, response) ->{
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "hero-form.hbs");
        }, new HandlebarsTemplateEngine());

        post("/heros", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            String name = request.queryParams("heroName");
            int age=Integer.parseInt(request.queryParams("heroAge"));
            String power=request.queryParams("heroPower");
            String weakness=request.queryParams("heroWeakness");
            Heros heros = new Heros(name, age, power,weakness);
            model.put("heros", heros);
            return new ModelAndView(model, "complete.hbs");
        }, new HandlebarsTemplateEngine());

        get("/heros", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            ArrayList<Heros> heros = Heros.getAllInstances();
            model.put("heros", heros);
            return new ModelAndView(model, "heros.hbs");
        }, new HandlebarsTemplateEngine());

        get("/squads/new", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            ArrayList<Heros> heros=Heros.getAllInstances();
            ArrayList<Heros> herosList=new ArrayList<>();
            for (int i=0;i<heros.size();i++){
                if(heros.get(i).isSquadMember()){
                    herosList.add(heros.get(i));
                }
            }

            model.put("heros",Heros.getAllInstances());
            return new ModelAndView(model,"squadForm.hbs");
        }, new HandlebarsTemplateEngine());

        post("/squad", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            String name = request.queryParams("squadName");
            String cause=request.queryParams("squadCause");
            int maxSize=Integer.parseInt(request.queryParams("squadSize"));
            ArrayList<Heros> heros=new ArrayList<>();
            if(request.queryParamsValues("squadHeros")!=null){
                String[] selectedHeros= request.queryParamsValues("squadHeros");
                for(int i=1;i<=selectedHeros.length;i++){
                    Heros addHero=Heros.findById(i);
                    if(heros.size()<maxSize){
                        addHero.updateHeroStatus(true);
                        heros.add(addHero);
                    }
                }
            }
            Squad newSquad= new Squad(name,cause,maxSize,heros);
            model.put("heros",Heros.getAllInstances());
            model.put("squad", newSquad.getHeros());

            return new ModelAndView(model, "squad-form.hbs");
        }, new HandlebarsTemplateEngine());

        get("/squad", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("squads", Squad.getSquadsInstances());
            return new ModelAndView(model, "squad.hbs");
        }, new HandlebarsTemplateEngine());

        get("/squad/:id",(request, response) -> {
            Map<String, Object> model = new HashMap<>();
            int idOfSquadToFind=Integer.parseInt(request.params(":id"));
            Squad foundSquad=Squad.findById(idOfSquadToFind);
            model.put("squad",foundSquad);
            ArrayList<Squad> squads=Squad.getSquadsInstances();
            model.put("squad",squads);
            return new ModelAndView(model,"squad.hbs");
        },new HandlebarsTemplateEngine());

    }
}
