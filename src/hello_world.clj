(ns hello-world)

(defn app
  [req]
  {:status  200
   :headers {"Content-Type" "text/html"}
   :body    (str "<h3>Hello, Seth!</h3>")})

(defn reloader [req] (app req))