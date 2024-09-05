(defproject pr_tests "1"
  :description "Just a project to test github actions for a PR"
  :url "https://github.com/RobsonFilho/PR_Tests"
  :license {:name "Proprietary"}
  :dependencies [[org.clojure/clojure "1.11.3"]
                 [com.datomic/peer "1.0.7187" ]]
  :repl-options  {:init-ns user}
  :min-lein-version "2.4.2"
  :resource-paths ["resources"] )