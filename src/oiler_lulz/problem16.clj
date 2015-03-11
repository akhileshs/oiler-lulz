(ns oiler_lulz.problem16
  (:use oiler_lulz.template_fns))

(defn apply-f-to-digits [x n]
  (apply x (map #(- (int %) 48) (seq (str n)))))

(defn powers-of-2 []
  (iterate (partial * 2) 1))

(let [limit 1000]  
  (apply-f-to-digits + (last (take (+ 1 limit) (powers-of-2)))))

