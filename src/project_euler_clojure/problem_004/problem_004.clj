(ns project-euler-clojure.problem-004.problem-004
  (:require [clojure.string :as string])
  (:gen-class))

(defn palindrome?
  [s]
  (let [s (str s)]
    (= s (string/reverse s))))

(defn problem-004
  []
  (apply max
         (filter palindrome?
                 (for [x (range 100 1000)
                       y (range 100 1000)]
                   (* x y)))))
