(ns basic-algs.bsearch-test
  (:require [clojure.test :refer :all]
            [basic-algs.bsearch :refer :all]))

(def svec [2 5 7 14 33 57 68 75 91])

(deftest bsearch-test
  (testing "Search in empty vector"
    (is (= :empty (bsearch-rec [] nil))))
  (testing "Item can not be found"
    (is (= :not-found (bsearch-rec svec 42))))
  (testing "Item is found"
    (is (= 75 (bsearch-rec svec 75)))))
