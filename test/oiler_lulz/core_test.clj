(ns oiler-lulz.core-test
  (:require [clojure.test :refer :all])
  (:use oiler_lulz.template_fns))

(deftest divisible-by-test
  (testing "divisible by n"
    (is (divisible-by? 6 [2 3]))
    (is (divisible-by? 20 [4 5]))
    (is (not (divisible-by? 15 [2 3 4])))))

(deftest prime-factor-test
  (testing "prime factor list generation"
    (is (= '(5 7) (prime-factor 35)))
    (is (= '(5 7 11) (prime-factor 385)))))

(deftest prime-test
  (testing "testing for primality"
    (is (not (prime? 1)))
    (is (prime? 2))
    (is (prime? 3))
    (is (prime? 5))
    (is (not (prime? 6)))))

(deftest sqr-test
  (testing "number squared"
    (is (= 16 (sqr 4)))
    (is (= 25 (sqr 5)))))

