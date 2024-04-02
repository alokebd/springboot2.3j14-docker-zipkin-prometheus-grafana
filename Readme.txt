docker build --pull --rm -f "Dockerfile" -t techait-eureka-naming-server:latest "."

docker build --pull --rm -f "Dockerfile" -t techait-spring-cloud-api-gateway-service:latest "."

docker build --pull --rm -f "Dockerfile" -t techait-product-enquiry-service:latest "."

docker build --pull --rm -f "Dockerfile" -t techait-product-stock-service:latest "."

docker-compose up



http://localhost:8800/product-stock/productName/ball/productAvailability/yes

http://localhost:8700/product-enquiry/name/bat/availability/yes/unit/3

http://localhost:8900/product-enquiry/name/bat/availability/yes/unit/3
