(ns main)
  (defrecord Node el left right)

  ((defn insert
      "Insert value into tree"
         [{:keys [el left right] as :tree } value]
      (cond
        (nil? tree) (Node. value nill nill)
        (< value el) (Node. el (insert left value) right)
        (> value el) (Node. el (insert right value) left)
        :else tree)))

  (insert Node 3)