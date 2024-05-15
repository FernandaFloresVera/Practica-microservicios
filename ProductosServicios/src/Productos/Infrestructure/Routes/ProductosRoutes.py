from flask import Blueprint, request
from src.Productos.Infrestructure.Controllers.ProductosControllers.GetProductosController import GetProductosController
from src.Productos.Infrestructure.Controllers.ProductosControllers.DeleteProductosController import DeleteProductosController
from src.Productos.Infrestructure.Controllers.ProductosControllers.CreateProductosController import CreateProductosController
from src.Productos.Infrestructure.Repositories.MySQLRepositories.MySQLProductosRepository import MySQLProductosRepository

product_routes = Blueprint('product_routes', __name__)

repo = MySQLProductosRepository()
get_controller = GetProductosController(repo)
delete_controller = DeleteProductosController(repo)
create_controller = CreateProductosController(repo)

@product_routes.route("/", methods=["GET"])
def get():
    return get_controller.run()

@product_routes.route("/", methods=["POST"])
def create():
    return create_controller.run(request)

@product_routes.route("/<string:id>", methods=["DELETE"])
def delete(id):
    return delete_controller.run(id)
