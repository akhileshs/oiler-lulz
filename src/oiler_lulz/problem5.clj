(ns oiler_lulz.problem5
  (:use oiler_lulz.template_fns))

(defn f-div-by [ns ds]        ;; find first no in ns divisible by all(ds)
  (if (seq ns)
    (let [n (first ns)]
      (if (divisible-by? n ds) n
        (recur (rest ns) ds)))
    nil))

(defn oiler-problem5 []
  (f-div-by (range 20 Double/POSITIVE_INFINITY 20) (range 2 21)))

