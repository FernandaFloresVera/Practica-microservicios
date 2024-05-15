from src.Productos.Domain.Ports.ProductosPort import ProductosPort as Port


class DeleteProductosUseCase:
    def __init__(self, repository: Port):
        self.__repository = repository

    def run(self, id):
        return self.__repository.delete_productos(id)

