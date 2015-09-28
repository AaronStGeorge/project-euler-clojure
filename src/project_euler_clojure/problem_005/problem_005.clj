(ns project-euler-clojure.problem-005.problem-005
  (:gen-class))

(defn evenly-divide?
  "Does n evenly divide all numbers between a (inclusive) and b (exclusive)"
  [a b n]
  (zero? (apply + (map (partial rem n) (range a b)))))

(defn gcd
  "greatest common divisor"
  [a b]
  (if (zero? b)
    a
    (recur b (mod a b))))

(defn lcm
  "least common multiple"
  [a b]
  (/ (* a b) (gcd a b)))

(defn problem-005
  []
  (reduce lcm (range 2 21)))
