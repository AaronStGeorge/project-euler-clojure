(ns project-euler-clojure.problem-002.problem-002
  (:gen-class))

(defn fib-seq
  ([] (fib-seq 1 2))
  ([n m] (cons n (lazy-seq (fib-seq m (+ n m))))))

(defn problem-002
  []
  (reduce + (filter even? (take-while #(< % 4e6) (fib-seq)))))
