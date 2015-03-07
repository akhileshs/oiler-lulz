(ns oiler.templateFns)

(defn divisible-by? [n xs]        ;; yields true if every xs divides n
  (every? #(= 0 (rem n %)) xs))

(defn prime-factor [n]            
  ;; yields list of all prime factors of n
  ;; Uncle Bob's just too smart for me!
  (loop [factors [], n n, candidate 2]
    (cond
          (= n 1) factors
          (divisible-by? n [candidate]) (recur (conj factors candidate) (quot n candidate) candidate)
          (> candidate (Math/sqrt n)) (conj factors n)
          :else (recur factors n (inc candidate)))))

(defn prime? [n]                  ;; yields true if n is prime
  (= 1 (count (prime-factor n))))

(def sqr #(* % %))

