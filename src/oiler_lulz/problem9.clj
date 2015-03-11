(ns oiler.problem9
  (:use oiler.templateFns))

(defn pythagorean-triplet? [triplet]
  "true if a^2 + b^2 = c^2"
  (let [[a b c] triplet] (= (+ (sqr a) (sqr b)) (sqr c))))

(defn pythagorean-triplets [n]
  "return all possible pythagorean triplets of natural numbers where a + b + c = n."
  (for [a (range 1 n), b (range (inc a) (-n a))
        :let [c (- n (+ a b))]
        :when (and (> c b) (pythagorean-triplet? [a b c]))]
    [a b c]))

(defn oiler-problem9 []
  (apply * (first (pythagorean-triplets 1000))))

