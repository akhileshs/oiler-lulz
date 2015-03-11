(ns oiler_lulz.problem7
  (:use oiler_lulz.template_fns))

(defn next-prime [n]
  "returns next prime after n"
  (loop [n (inc n)]
    (if (prime? n) n
      (recur (inc n)))))

(defn nth-prime [n]
  "returns nth prime"
  (loop [i n, prime 1]
    (if (zero? i) prime
      (recur (dec i) (next-prime prime)))))

(defn oiler-problem7 []
  (nth-prime 10001))

