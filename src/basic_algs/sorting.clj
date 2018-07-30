(ns basic-algs.sorting)

;; recursive quick sort
(defn qsort [items]
  (cond
    (empty? items) []
    (= 1 (count items)) items
    :default
    (let [pivot (first items)
          lesser-items (filter #(< % pivot) (rest items))
          gtoe-items (filter #(>= % pivot) (rest items))]
       (vec (flatten [(qsort lesser-items) pivot (qsort gtoe-items)])))))

(qsort [10 8 15 5 76 43 15 77 99 76 41])
