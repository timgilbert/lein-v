(defproject com.roomkey/lein-v "3.0.0"
  :description "A Leiningen plugin to reflect on the version of a project"
  :url "https://github.com/g1nn13/lein-v"
  :dependencies [[org.clojure/clojure "1.4.0"]]
  :profiles {:dev {:dependencies [[midje "1.4.0"]]}}
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :eval-in-leiningen true)
