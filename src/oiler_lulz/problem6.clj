(ns oiler_lulz.problem6
  (:use oiler_lulz.template_fns))

(defn sum-of-squares [ns]         ;; return sum of squares of nos in collection
  (reduce + (map sqr (ns))))

(defn square-of-sums [ns]         ;; return square of sum of nos in collection
  (sqr (reduce + ns)))

(defn oiler-problem6 []
  (- (square-of-sums (range 101)) (sum-of-squares (range 101))))

