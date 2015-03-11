(ns oiler_lulz.problem1
  (:use oiler_lulz.template_fns))

(defn oiler-problem1 []
  (reduce + (filter #(divisible-by? % [3 5]) (range 1 1000))))
