(ns basic-algs.sorting)

;; recursive quick sort
(defn qsort [items]
  (cond
    (empty? items) []
    (= 1 (count items)) items
    :default
    (let [pivot (first items)
          tparts (transient {:ltp [] :gtp []})
          sep-fn (fn [res item] (let [k (if (< item pivot) :ltp :gtp)] (assoc! res k (conj (k res) item))))
          parts (persistent! (reduce sep-fn tparts (rest items)))]
        (vec (flatten [(qsort (:ltp parts)) pivot (qsort (:gtp parts))])))))

(qsort [10 8 15 5 76 43 15 77 99 76 41])
