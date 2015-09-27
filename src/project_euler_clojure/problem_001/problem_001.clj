(ns project-euler-clojure.problem-001.problem-001
  (:gen-class))

(defn sum-mult-3-9-to-n
  [n]
  (reduce + (distinct (concat (range 5 n 5) (range 3 n 3)))))

(defn problem-001
  []
  (sum-mult-3-9-to-n  1000))
