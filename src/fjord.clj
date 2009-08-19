; A example of modular construction of Ring apps.

(ns fjord
  (:require (ring backtrace file-info file dump reload jetty)
            (hello-world))
  (:import (java.io File)))

(def app (ring.backtrace/wrap
          (ring.file-info/wrap
           (ring.file/wrap (File. "public")
                           (ring.reload/wrap '(hello-world)
                                             hello-world/reloader)))))

(defn serve [] (ring.jetty/run {:port 8080} app))
