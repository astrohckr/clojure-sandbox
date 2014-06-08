(ns probs-from-4clj.core-test
  (:require [clojure.test :refer :all]
            [probs-from-4clj.core :refer :all]))



;; problem 1
(deftest can-nothing-but-the-truth
  (is (= nothing-but-the-truth-solution true)))


;; problem 2
(deftest can-simple-math
  (is (= (- 10 (* 2 3)) simple-math-solution)))


;; problem 3
(deftest can-intro-to-strings
  (is (= intro-to-strings-solution (.toUpperCase "hello world"))))
