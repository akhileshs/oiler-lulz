(ns oiler_lulz.problem3
  (:use oiler_lulz.template_fns))

(defn oiler-problem3 []
  (apply max (prime-factor 600851475143)))

