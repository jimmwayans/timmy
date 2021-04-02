<?
        // Time Zone
        date_default_timezone_set("America/New_York");

        // Set to false to stop all PHP errors/warnings from showing.
        $bigtree["config"]["debug"] = true;

        // Routing setup
        $bigtree["config"]["routing"] = "basic";

        // Database info.
        $bigtree["config"]["db"]["host"] = "localhost";
        $bigtree["config"]["db"]["name"] = "wingnut";
        $bigtree["config"]["db"]["user"] = "root";
        $bigtree["config"]["db"]["password"] = "zaq1xsw2cde3";
        $bigtree["config"]["sql_interface"] = "mysqli"; // Change to "mysql" to use legacy MySQL interface in PHP.

        // Separate write database info (for load balanced setups)
        $bigtree["config"]["db_write"]["host"] = "";
        $bigtree["config"]["db_write"]["name"] = "";
        $bigtree["config"]["db_write"]["user"] = "";
        $bigtree["config"]["db_write"]["password"] = "";

        // "domain" should be http:///www.website.com
        $bigtree["config"]["domain"] = "http://10.11.1.71";
        // "www_root" should be http://www.website.com/location/of/the/site/
        $bigtree["config"]["www_root"] = "http://10.11.1.71/site/index.php/";
        // "static_root" can either be the same as "www_root" or another domain that points to the same place -i t is used to server static files to increase page load time due to max connections per domain in most browsers.
        $bigtree["config"]["static_root"] = "http://10.11.1.71/site/";
        // "admin_root" should be the location you want to access BigTree's admin from, i.e. http://www.website.com/admin/
        $bigtree["config"]["admin_root"] = "http://10.11.1.71/site/index.php/admin/";

        // Current Environment
        $bigtree["config"]["environment"] = ""; // "dev" or "live"; empty to hide
        $bigtree["config"]["environment_live_url"] = ""; // Site URL

        // Default Image Quality Presets
        $bigtree["config"]["image_quality"] = 90;
        $bigtree["config"]["retina_image_quality"] = 25;

        // The amount of work for the password hashing.  Higher is more secure but more costly on your CPU.
        $bigtree["config"]["password_depth"] = 8;
        // If you have HTTPS enabled, set to true to force admin logins through HTTPS
        $bigtree["config"]["force_secure_login"] = false;
        // Encryption key for encrypted settings
        $bigtree["config"]["settings_key"] = "5436a49fb1bdf8.33454427";

        // Custom Output Filter Function
        $bigtree["config"]["output_filter"] = false;

        // Enable Simple Caching
        $bigtree["config"]["cache"] = false;
        // Use X-Sendfile headers to deliver cached files (more memory efficient, but your web server must support X-Sendfile headers) -- https://tn123.org/mod_xsendfile/
        $bigtree["config"]["xsendfile"] = false;

        // ReCAPTCHA Keys
        $bigtree["config"]["recaptcha"]["private"] = "6LcjTrwSAAAAADnHAf1dApaNCX1ODNuEBP1YdMdJ";
        $bigtree["config"]["recaptcha"]["public"] = "6LcjTrwSAAAAAKvNG6n0YtCROEWGllOu-dS5M5oj";

        // Base classes for BigTree.  If you want to extend / overwrite core features of the CMS, change these to your new class names
        // Set BIGTREE_CUSTOM_BASE_CLASS_PATH to the directory path (relative to /site/) of the file that will extend BigTreeCMS
        // Set BIGTREE_CUSTOM_ADMIN_CLASS_PATH to the directory path (relative to /site/) of the file that will extend BigTreeAdmin
        define("BIGTREE_CUSTOM_BASE_CLASS",false);
        define("BIGTREE_CUSTOM_ADMIN_CLASS",false);
        define("BIGTREE_CUSTOM_BASE_CLASS_PATH",false);
        define("BIGTREE_CUSTOM_ADMIN_CLASS_PATH",false);

        // ------------------------------
        // BigTree Resource Configuration
        // ------------------------------

        // Array containing all JS files to minify; key = name of compiled file
        // example: $bigtree["config"]["js"]["site"] compiles all JS files into "site.js"
        $bigtree["config"]["js"]["files"]["site"] = array(
                "jquery-1.7.1.min.js",
                "jquery.ba-dotimeout.min.js",
                "jquery.breakpoints.js",
                "main.js"
        );

        // Array containing variables to be replaced in compiled JS files
        // example: "variable_name" => "Variable Value" will replace all instances of $variable_name with 'Variable Value'
        $bigtree["config"]["js"]["vars"] = array(
                // "variable_name" => "Variable Value"
        );

        // Flag for JS minification
        $bigtree["config"]["js"]["minify"] = false;


        // Array containing all CSS files to minify; key = name of compiled file
        // example: $bigtree["config"]["css"]["site"] compiles all CSS files into "site.css"
        $bigtree["config"]["css"]["files"]["site"] = array(
                "gridlock.css",
                "master.css"
        );

        // Array containing variables to be replaced in compiled CSS files
        // example: "variable_name" => "Variable Value" will replace all instances of $variable_name with 'Variable Value'
        $bigtree["config"]["css"]["vars"] = array(
                // "variable_name" => "Variable Value"
        );

        // Flag for BigTree CSS3 parsing - automatic vendor prefixing for standard CSS3
        $bigtree["config"]["css"]["prefix"] = true;

        // Flag for CSS minification
        $bigtree["config"]["css"]["minify"] = false;

        // Additional CSS Files For the Admin to Load
        $bigtree["config"]["admin_css"] = array(
                // "whatever.css"
        );

        // Additional JavaScript Files For the Admin to Load
        $bigtree["config"]["admin_js"] = array(
                // "whatever.js"
        );

        // --------------------------
        // Placeholder Image Defaults
        // --------------------------

        // Add your own key to the "placeholder" array to create more placeholder image templates.
        $bigtree["config"]["placeholder"]["default"] = array(
                "background_color" => "CCCCCC",
                "text_color" => "666666",
                "image" => false,
                "text" => false
        );
