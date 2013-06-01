(ns electioneer.views
  (:require (hiccup
             [core :refer :all]
             [element :refer :all]
             [page :refer :all]
             [def :refer :all])))

(defhtml banner []
  [:div.bannerBar.fixed_elem
   [:div#bannerLogo "electioneer"]
   [:div {:style "float: left"} "Search..."]])


(defn index []
  (html5
   [:head
    (include-css "/style.css")]
   [:body
    (banner)]))

(defn slate [name]
  (html5
   [:head]
   [:body
    [:div [:h1 name]]
    [:div [:p "Our new slate!"]]]))
