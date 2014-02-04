(ns mochify.boresquare.routes
  (:require [compojure.handler :as handler]
            [compojure.route :as route]
            [compojure.response :as response]
            [compojure.core :refer [defroutes GET POST]]
            [mochify.boresquare.views :as views]))

(defroutes app-routes
  (GET "/" [] (views/index))
  (GET "/listkeys" [] (views/listkeys)
  (GET "/user" [] "hello there")
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))
