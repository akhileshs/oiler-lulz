(ns oiler.problem1
  (:use oiler.templateFns))

(defn oiler-problem1 []
  (reduce + (filter #(divisible-by? % [3 5]) (range 1 1000))))
