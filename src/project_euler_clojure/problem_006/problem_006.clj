(ns project-euler-clojure.problem-006.problem-006
  (:gen-class))

(defn sum-square-difference
  "Difference between the sum of the squares of the first n natural numbers and
  the square of the sum of the first n natural numbers"
  [n]
  (- (int (Math/pow (int (/  (* n (inc n)) 2)) 2))
     (reduce + (map #(int (Math/pow % 2)) (range 1 (inc n))))))

(defn problem-006
  []
  (sum-square-difference 100))
