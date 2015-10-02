(ns project-euler-clojure.core-test
  (:require [clojure.test :refer :all]
            [project-euler-clojure.core :refer :all]
            [project-euler-clojure.problem-001.problem-001 :refer :all]
            [project-euler-clojure.problem-002.problem-002 :refer :all]
            [project-euler-clojure.problem-003.problem-003 :refer :all]
            [project-euler-clojure.problem-004.problem-004 :refer :all]
            [project-euler-clojure.problem-005.problem-005 :refer :all]
            [project-euler-clojure.problem-006.problem-006 :refer :all]
            [project-euler-clojure.problem-007.problem-007 :refer :all]))

(deftest problem-001-test
  (testing "problem 1"
    (is (= (problem-001) 233168))))

(deftest problem-002-test
  (testing "problem 2"
    (is (= (problem-002) 4613732))))

(deftest problem-003-test
  (testing "problem 3"
    (is (= (problem-003) 6857))))

(deftest problem-004-test
  (testing "problem 4"
    (is (= (problem-004) 906609))))

(deftest problem-005-test
  (testing "problem 5"
    (is (= (problem-005) 232792560))))

(deftest problem-006-test
  (testing "problem 6"
    (is (= (problem-006) 25164150))))

(deftest problem-007-test
  (testing "problem 7"
    (is (= (problem-007) 104743))))
