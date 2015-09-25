(ns project-euler-clojure.core-test
  (:require [clojure.test :refer :all]
            [project-euler-clojure.core :refer :all]
            [project-euler-clojure.problem-001.problem-001 :refer :all]))

(deftest problem-001-test
  (testing "problem 1"
    (is (= (problem-001) 233168))))
