(ns oiler_lulz.problem2
  (:use oiler_lulz.template_fns))

(defn fib-range [max]
  (cond
    (= max 0) (quote (0))
    (= max 1) (quote (0 1))
    :else
      (loop [r '(0 1), n 1, p-2 0, p-1 1]
        (if (< n max)
          (let [f (+ p-2 p-1)]
            (recur (concat r (list f)) (+ n 1) p-1 f))
          r))))

(defn oiler-problem2 []
  (reduce + (for [f (fib-range 50) :while (< f 4000000) :when (even? f)] f)))
