(ns probs-from-4clj.core)



;; problem 1 (Elementary)
(def nothing-but-the-truth-solution true)
  ;; This is a clojure form. Enter a value which will make the form evaluate to true. Don't over think it! If you are confused, see the getting started page. Hint: true is equal to true.


;; problem 2 (Elementary)
(def simple-math-solution 4)
  ;; If you are not familiar with polish notation, simple arithmetic might seem confusing. Note: Enter only enough to fill in the blank (in this case, a single number) - do not retype the whole problem.



;; problem 3 (Elementary)
(def intro-to-strings-solution (.toUpperCase "hello world"))
  ;; Clojure strings are Java strings. This means that you can use any of the Java string methods on Clojure strings.



;; problem 4 (Elementary)
(defn intro-to-lists-solution [x y z] (list x y z))
  ;; Lists can be constructed with either a function or a quoted form.


;; problem 5 (Elementary)
(def lists-conj-solution '(1 2 3 4))
  ;; When operating on a list, the conj function will return a new list with one or more items "added" to the front.



;; problem 6 (Elementary)
(def intro-to-vectors-solution [:a :b :c])
  ;; Vectors can be constructed several ways. You can compare them with lists.



;; problem 7 (Elementary)
(def vectors-conj-solution [1 2 3 4])
  ;; When operating on a Vector, the conj function will return a new vector with one or more items "added" to the end.



;; problem 8 (Elementary)
(def intro-to-sets-solution #{:a :c :b :d})
  ;; Sets are collections of unique values.



;; problem 9 (Elementary)
(def sets-conj-solution 2)
  ;; When operating on a set, the conj function returns a new set with one or more keys "added".



;; problem 10 (Elementary)
(def intro-to-maps-solution 20)
  ;; Maps store key-value pairs. Both maps and keywords can be used as lookup functions. Commas can be used to make maps more readable, but they are not required.



;; problem 11 (Elementary)
(def maps-conj-solution [:b 2])
  ;; When operating on a map, the conj function returns a new map with one or more key-value pairs "added".

