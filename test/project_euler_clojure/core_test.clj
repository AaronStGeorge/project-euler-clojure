(ns project-euler-clojure.core-test
  (:require [clojure.test :refer :all]
            [project-euler-clojure.core :refer :all]
            [project-euler-clojure.problem-001.problem-001 :refer :all]
            [project-euler-clojure.problem-002.problem-002 :refer :all]
            [project-euler-clojure.problem-003.problem-003 :refer :all]))

(deftest problem-001-test
  (testing "problem 1"
    (is (= (problem-001) 233168))))

(deftest problem-002-test
  (testing "problem 2"
    (is (= (problem-002) 4613732))))

(deftest problem-003-test
  (testing "problem 3"
    (is (= (problem-003) 6857))))
