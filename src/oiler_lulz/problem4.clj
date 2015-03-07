(ns oiler.problem4
  (:use oiler.templateFns))

(def palindrome? [n]        ;; yields true is n is a palindrome
  (= (seq (str n)) (reverse (str n))))

(defn n-digit-nos [n]       ;; list of all nos with n digits
  (range (int (Math/pow 10 (- n 1))) (int (Math/pow 10 n))))

(defn products-of-n-digit-numbers [n]
  (set (for [x (n-digit-nos n) y (n-digit-nos n)] (* x y))))

(defn oiler-problem4 []
  (apply max (filter palindrome? (products-of-n-digit-numbers 3))))


