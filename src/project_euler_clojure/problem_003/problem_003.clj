(ns project-euler-clojure.problem-003.problem-003
  (:gen-class))

(defn prime-factorization
  "simplest prime factorization algorithm"
  ([n] (prime-factorization n 2 []))
  ([n factor factors]
   (cond
     (= 1 n) factors
     (> (* factor factor) n) (conj factors n)
     (zero? (rem n factor)) (recur (/ n factor) factor (conj factors factor))
     :else  (recur n (inc factor) factors))))

(defn problem-003
  []
  (last (prime-factorization 600851475143)))
