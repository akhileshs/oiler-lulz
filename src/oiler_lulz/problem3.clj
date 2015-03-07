(ns oiler.problem3
  (:use oiler.templateFns))

(defn oiler-problem3 []
  (apply max (prime-factor 600851475143)))

