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


;; problem 4
(deftest can-intro-to-lists
  (is (= (intro-to-lists-solution :a :b :c) '(:a :b :c))))


;; problem 5
(deftest can-lists-conj
  (is (= lists-conj-solution (conj '(2 3 4) 1)))
  (is (= lists-conj-solution (conj '(3 4) 2 1))))


;; problem 6
(deftest can-intro-to-vectors
  (is (= intro-to-vectors-solution (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))))


;; problem 7
(deftest can-vectors-conj
  (is (= vectors-conj-solution (conj [1 2 3] 4)))
  (is (= vectors-conj-solution (conj [1 2] 3 4))))
