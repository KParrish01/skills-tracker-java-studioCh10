package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("skills") // now all below URL routes will begin with "/hello"
public class SkillsController {

    // Studio 10.6.
//    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "formPost")   // from test with forward slashes "/" before action = '/hello' and at end of input lines
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "choose")  //<<<<<That's also the chosen one, for the exercise...
    public String chooseProgrammingLanguage(@RequestParam String language, @RequestParam String language2, @RequestParam String language3, @RequestParam String coder) {

//        if (language.equals("Java")){
            String html =  "<h1>" + coder + ":</h1>" +
                    "<h4>Your language priorities:</h4>" +
                    "<h5>  1. " + language + "</h5>" +
                    "<h5>  2. " + language2 + "</h5>" +
                    "<h5>  3. " + language3 + "</h5>" +
                    "<a href= 'http://localhost:8080/skills/form'>Go back to input form.</a>";
//        }
//        if (language.equals("JavaScript")){
//            return "</br><h3>  Bonjour JavaScript" + language + " " + coder + "!</h3>";
//        }
//        if (language.equals("Basic")){
//            return "</br><h3>  Ahoj Basic" + language + " " + coder + "!</h3>";
//        } else {
//            return "</br><h3>  OOOUUUUUPS!!!</h3>";
//        }
        return html;
    }

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "form")
//    @GetMapping(value="form")
//    @PostMapping("form")
    public static String createForm() {
        String html = "<html" +
                "<head>" +
//                "<style>" +
//                "body {background-color: powderblue}" +
//                "select {color: fuchsia}" +
//                "/style" +
                "</head>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>List of Programming Languages to choose from:</h2>" +
                    "<ol>" +
                        "<li>Java</li>" +
                        "<li>JavaScript</li>" +
                        "<li>Basic</li>" +
                    "</ol>" +
                "" +
                     "<form action='/skills/choose' method = 'post' >" +  // tells it to submit request to /skills/choose
                        "<label>Your name:<label/><input type = 'text' name = 'coder'/>" +
                                "</br>" +
//                              "<input type = 'text' name = 'language' />" +
                                "<h3>Choose Language Preference:</h3>" +
                                "</br>" +
                                    "<label>1st choice:<label/><select name = 'language'>" +
                                        "<option value='Java'>Java</option>" +
                                        "<option value='JavaScript'>JavaScript</option>" +
                                        "<option value='Basic'>Basic</option>" +
                                    "<select/>" +
                                "</br>" +
                                    "<label>2nd choice:<label/><select name = 'language2'>" +
                                        "<option value='Java'>Java</option>" +
                                        "<option value='JavaScript'>JavaScript</option>" +
                                        "<option value='Basic'>Basic</option>" +
                                    "<select/>" +
                                "</br>" +
                                    "<label>3rd choice:<label/><select name = 'language3'>" +
                                        "<option value='Java'>Java</option>" +
                                        "<option value='JavaScript'>JavaScript</option>" +
                                        "<option value='Basic'>Basic</option>" +
                                    "<select/>" +
                                "</br>" +
                        "<input type='submit' value='Submit' />" +
                    "</form>" +
                "</body>" +
                "</html>";
        return html;
    }

    // Bonus 1. Make above into table: Can do using tags <table>, <tr>, <th>, <td> (see for example https://www.w3schools.com/html/html_tables.asp
}
