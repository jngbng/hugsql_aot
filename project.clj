(defproject hugsql_aot "0.1.0-SNAPSHOT"
  :description "Hugsql uberjar test."
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [org.postgresql/postgresql "42.3.2"]
                 [com.layerware/hugsql-core "0.5.3"]
                 [com.layerware/hugsql-adapter-next-jdbc "0.5.3"]]
  :main ^:skip-aot hugsql-aot.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :omit-source true
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
