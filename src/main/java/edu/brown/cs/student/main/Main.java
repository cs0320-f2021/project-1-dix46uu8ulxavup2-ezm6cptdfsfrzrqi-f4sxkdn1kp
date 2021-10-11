package edu.brown.cs.student.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;

import com.google.common.collect.ImmutableMap;

import freemarker.template.Configuration;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import spark.ExceptionHandler;
import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.Spark;
import spark.TemplateViewRoute;
import spark.template.freemarker.FreeMarkerEngine;

/**
 * The Main class of our project. This is where execution begins.
 */
public final class Main {

  // use port 4567 by default when running server
  private static final int DEFAULT_PORT = 4567;

  /**
   * The initial method called when execution begins.
   *
   * @param args An array of command line arguments
   */
  public static void main(String[] args) {
    new Main(args).readStar();
  }

  private String[] args;

  private Main(String[] args) {
    this.args = args;
  }

  private void readStar(String path) {
    // set up parsing of command line flags
    OptionParser parser = new OptionParser();

    // "./run --gui" will start a web server
    parser.accepts("gui");

    // use "--port <n>" to specify what port on which the server runs
    parser.accepts("port").withRequiredArg().ofType(Integer.class)
        .defaultsTo(DEFAULT_PORT);

    OptionSet options = parser.parse(args);
    if (options.has("gui")) {
      runSparkServer((int) options.valueOf("port"));
    }

    // TODO: Add your REPL here!
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      String input;
      while ((input = br.readLine()) != null) {
        try {
          input = input.trim();
          String[] arguments = input.split(" ");
          // System.out.println(arguments[0]);

          // TODO: complete your REPL by adding commands for addition "add" and subtraction
          //  "subtract"

          if (arguments.length == 3) {
            MathBot mb1 = new MathBot();
            double num1 = Double.parseDouble(arguments[1]);
            double num2 = Double.parseDouble(arguments[2]);

            //add
            if (arguments[0].equals("add")) {
              System.out.println(mb1.add(num1, num2));
            }

            //subtract
            if (arguments[0].equals("subtract")) {
              System.out.println(mb1.subtract(num1, num2));
            }
          }
        } catch (Exception e) {
          // e.printStackTrace();
          System.out.println("ERROR: We couldn't process your input");
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("ERROR: Invalid input for REPL");
    }
  }

  private static FreeMarkerEngine createEngine() {
    Configuration config = new Configuration(Configuration.VERSION_2_3_0);

    // this is the directory where FreeMarker templates are placed
    File templates = new File("src/main/resources/spark/template/freemarker");
    try {
      config.setDirectoryForTemplateLoading(templates);
    } catch (IOException ioe) {
      System.out.printf("ERROR: Unable use %s for template loading.%n",
          templates);
      System.exit(1);
    }
    return new FreeMarkerEngine(config);
  }

  private void runSparkServer(int port) {
    // set port to run the server on
    Spark.port(port);

    // specify location of static resources (HTML, CSS, JS, images, etc.)
    Spark.externalStaticFileLocation("src/main/resources/static");

    // when there's a server error, use ExceptionPrinter to display error on GUI
    Spark.exception(Exception.class, new ExceptionPrinter());

    // initialize FreeMarker template engine (converts .ftl templates to HTML)
    FreeMarkerEngine freeMarker = createEngine();

    // setup Spark Routes
    Spark.get("/", new MainHandler(), freeMarker);
  }

  /**
   * Display an error page when an exception occurs in the server.
   */
  private static class ExceptionPrinter implements ExceptionHandler<Exception> {
    @Override
    public void handle(Exception e, Request req, Response res) {
      // status 500 generally means there was an internal server error
      res.status(500);

      // write stack trace to GUI
      StringWriter stacktrace = new StringWriter();
      try (PrintWriter pw = new PrintWriter(stacktrace)) {
        pw.println("<pre>");
        e.printStackTrace(pw);
        pw.println("</pre>");
      }
      res.body(stacktrace.toString());
    }
  }

  /**
   * A handler to serve the site's main page.
   *
   * @return ModelAndView to render.
   * (main.ftl).
   */
  private static class MainHandler implements TemplateViewRoute {
    @Override
    public ModelAndView handle(Request req, Response res) {
      // this is a map of variables that are used in the FreeMarker template
      Map<String, Object> variables = ImmutableMap.of("title",
          "Go go GUI");

      return new ModelAndView(variables, "main.ftl");
    }
  }
}


/*
*             //k nearest neighbor

            //getting naive neighbors k from star csv
            // 1 if input is "naive_neighbors <k> <x> <y> <z>" or "naive_neighbors <k> <"name">"
            if (arguments[0].equals("naive_neighbors") && (Integer.parseInt(arguments[1]) >= 0)) {

              // if k = 0 then just return empty or just end the REPL
              // if k != 0 then store k number and target star info and new List without target
              if (Integer.parseInt(arguments[1]) == 0) {
                System.out.println("");
              } else {
                int k = Integer.parseInt(arguments[1]);

                // 2 search through to get StarID of k number of stars nearest to target star
                //   if there are multiple same distanced stars, then randomly pick one out of them

              }
            }
            *
            *
            * else if (arguments.length == 2) {
            if (arguments[0].equals("stars")) {

              //reading star CSV
              // 1  Get an entry of data from the CSV

              // valid input header line at the top is 'StarID','ProperName','X','Y','Z'
              // we assume there are no duplicate star names and that no star name contains a comma

              // invalid input creates error message:
              // "file does not conform with format: StarID, Name, X, Y, Z coordinates"


              // 2  Split the data into individual fields
              // (i.e. retrieving each column from something like "Colton,20,Computer Science,2021")

              // 3  Storing that parsed out data in some kind of data structure (like a List)

              if (arguments[1].endsWith(".csv")) {
                BufferedReader starReader = new BufferedReader(new java.io.FileReader(arguments[1]));
                String nextLine = starReader.readLine();
                System.out.println("TODO");
              }
            }
          }
          *
          *
          *
          *
          * else if (arguments.length == 5) {
            if (arguments[0].equals("naive_neighbors") && (Integer.parseInt(arguments[1]) >= 0)) {
              if (Integer.parseInt(arguments[1]) == 0) {
                System.out.println("");
              } else {
                int k = Integer.parseInt(arguments[1]);
                double x = Double.parseDouble(arguments[2]);
                double y = Double.parseDouble(arguments[3]);
                double z = Double.parseDouble(arguments[4]);

              }
            }
            //   if k != 0 then store k number and target star info and new List without target

            // 2 search through to get StarID of k number of stars nearest to target star
            //   if there are multiple same distanced stars, then randomly pick one out of them

            // 3 if else, throw error: "Incorrect input. Correct format is:
            // 'naive_neighbors <k> <x> <y> <z>' or 'naive_neighbors <k> <"name">'"

          }
*
* */