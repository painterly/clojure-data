(ns clojure-data.core)

(use 'incanter.core
     'incanter.io)



(defn -main []
  (print
    (map
      (fn [row] (println row))
      (take
        10
        (read-dataset "data/Energy_Usage_2010.csv" :header true)))))
