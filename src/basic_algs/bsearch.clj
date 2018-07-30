(ns basic-algs.bsearch)

;; recursive binary search
(defn bsearch-rec [arr elem]
  (cond
    (empty? arr) :empty
    (= 1 (count arr)) (if (= elem (first arr)) elem :not-found)
    :default  ;; size is more than 1
    (let [mid-idx (int (/ (count arr) 2))
          mid-elem (nth arr mid-idx)]
      (cond
        (> elem mid-elem) (bsearch-rec (subvec arr mid-idx) elem)
        (< elem mid-elem) (bsearch-rec (subvec arr 0 mid-idx) elem)
        (= elem mid-elem) elem))))
