(ns electioneer.views
  (:require (hiccup
             [core :refer :all]
             [element :refer :all]
             [page :refer :all]
             [def :refer :all])))

(defn index []
  (html5
   [:head
    (include-css "/style.css")]
   [:body
    [:div.banner "electioneer"]]))

(defn slate [name]
  (html5
   [:head]
   [:body
    [:div [:h1 name]]
    [:div [:p "Our new slate!"]]]))

