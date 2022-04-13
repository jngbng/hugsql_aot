(ns hugsql-aot.db
  (:require [hugsql.core :as hugsql]))

(hugsql/def-db-fns "hugsql_aot/db.sql")

