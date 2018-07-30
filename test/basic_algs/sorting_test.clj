(ns basic-algs.sorting-test
  (:require [clojure.test :refer :all]
            [basic-algs.sorting :refer :all]))

(def usv [43 29 2 48 5 14 86 51 87 12 14])

(deftest qsort-test
  (testing "Empty vector"
    (is (= [] (qsort []))))
  (testing "Single element vector"
    (is (= [42] (qsort [42]))))
  (testing "Unsorted vector should be sorted"
    (is (= '(2 5 12 14 14 29 43 48 51 86 87) (qsort usv)))))
