(ns project-euler-clojure.problem-007.problem-007
  (:gen-class))

;; With significant help from Christophe Grand at
;; http://clj-me.cgrand.net/2009/07/30/everybody-loves-the-sieve-of-eratosthenes/

(defn enqueue-next-odd-factor
  "enqueue next odd factor not already enqueued"
  [sieve n factor]
  (let [m (+ n factor factor)]
    (if (sieve m)
      (recur sieve m factor)
      (assoc sieve m factor))))

(defn lazy-primes
  ([] (cons 2 (lazy-seq (lazy-primes {} 3))))
  ([sieve candidate]
   (if-let [factor (sieve candidate)]
     (recur (-> sieve
                (dissoc candidate)
                (enqueue-next-odd-factor candidate factor))
            (+ candidate 2))
     (cons candidate (lazy-seq (lazy-primes
                                (enqueue-next-odd-factor sieve candidate candidate)
                                (+ candidate 2)))))))

(defn problem-007
  []
  (last (take 10001 (lazy-primes))))
