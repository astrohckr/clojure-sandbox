(ns probs-from-4clj.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))


;; problem 22 (Easy)
;; restrictions: count
(defn count-a-sequence-solution
  [collection] ;; update args as needed
  ;; Write a function which returns the total number of elements in a sequence.
  (reduce + (map (fn [x] 1) collection)))
