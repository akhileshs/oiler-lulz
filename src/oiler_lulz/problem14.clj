(ns oiler_lulz.problem14
  (:use oiler_lulz.template_fns))

(defn collatz [n]
  (cons n
        (lazy-seq
                  (if (> n 1)
                    (if (even? n)
                      (collatz (/ n 2))
                      (collatz (+ (* 3 n) 1)))))))

(defn greatest-count [a b]
  (let [ac (count a)
        bc (count b)]
    (if (> ac bc)
      a 
      b)))

(let [limit 1000000]
  (first (reduce #(greatest-count %1 %2) (map #(collatz %) (range limit 1 -1)))))

