(ns oiler.problem10
  (:use oiler.templateFns))

(defn primes-below-limit
  "get a list of all primes below a threshold limit, > 3."
  [limit]
  (loop
    [primes '(2)
     numbers (apply sorted-set (range 3 limit 2))]
    (let [factor (first numbers)]
      (if (and (seq numbers) (> limit (sqr factor)))
        (recur (cons factor primes) (apply disj (cons numbers (range factor limit (+ factor factor)))))
        (apply conj (cons numbers primes))))))

(defn oiler-problem10 []
  (reduce + (primes-below 2000000)))


