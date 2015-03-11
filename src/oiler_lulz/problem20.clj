(ns oiler_lulz.problem20
  (:use oiler_lulz.template_fns))

(defn factorial [n] (reduce * (range 2 (inc n))))

(defn sum-digits [s] (reduce + (map #(Integer/parseInt (str %)) s)))

(defn oiler-problem20 [] (sum-digits (str (factorial 100))))

