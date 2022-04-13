(ns hugsql-aot.core
  (:require [hugsql-aot.db :as db]
            [hugsql.core :as hugsql]
            [hugsql.adapter.next-jdbc :as next-adapter])
  (:gen-class))

(hugsql/set-adapter! (next-adapter/hugsql-adapter-next-jdbc))

(def db
  {:dbtype "postgres"
   :dbname "postgres"})

(defn -main
  "I don't do a whole lot ... yet."
  [& _args]
  (prn (db/select-one db {})))
