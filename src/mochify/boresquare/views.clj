(ns mochify.boresquare.views "The views for boresquare"
  {:author "William Lee (birryree)"}
  (:require [net.cgrand.enlive-html :as html]
            [environ.core :as env]
            [clojure.string :refer [join]]))




(comment
  (html/deftemplate listkeys "public/fskeys.html"
    []
    [:head :title] (html/content "Foursquare Key Info")
    [:body :h1] (html/content "Foursquare Keys")
    [:ul [:li html/first-of-type]] (html/content (join " " ["Client ID" (env/env :foursquare-client-id)])
  ))
)
