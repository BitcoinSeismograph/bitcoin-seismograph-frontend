(ns gui.archive)

(defn default-now []
  (or (js/localStorage.getItem "selected") (str "2018-07-16T12:00:00.000Z")))
