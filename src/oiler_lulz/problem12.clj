(ns oiler_lulz.problem12
  (:use oilet_lulz.template_fns))

(defn triangle [end]
  (reduce + (take end (iterate inc 1))))

(defn factor? [n d]
  (if (zero? d)
    false
    (zero? (mod n d))))

(defn factors [num]
  (filter #(factor? num %) (range 1 (+ 1 num))))

(let [limit 500]
  ;; thread last awesomeness
  (->> (iterate inc 1)
       (map #(triangle %))
       (map #(factors %))
       (filter #(> (count %) limit))
       (first)
       (last)))


