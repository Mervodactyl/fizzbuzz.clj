(ns fizzbuzz.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn divisible-by-three? [number] (zero? (mod number 3)))

(defn divisible-by-five? [number] (zero? (mod number 5)))