(ns probs-from-4clj.core-test
  (:require [clojure.test :refer :all]
            [probs-from-4clj.core :refer :all]))




;; problem 22
(deftest can-count-a-sequence
  (is (= (count-a-sequence-solution '(1 2 3 3 1)) 5))
  (is (= (count-a-sequence-solution "Hello World") 11))
  (is (= (count-a-sequence-solution [[1 2] [3 4] [5 6]]) 3))
  (is (= (count-a-sequence-solution '(13)) 1))
  (is (= (count-a-sequence-solution '(:a :b :c)) 3)))
