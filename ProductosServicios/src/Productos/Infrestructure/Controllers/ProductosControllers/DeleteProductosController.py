from src.Productos.Application.UseCase.Productos.DeleteProductosUseCase import DeleteProductosUseCase as UseCase, Port


class DeleteProductosController:
    def __init__(self, repository: Port):
        self.__use_case = UseCase(repository)

    def run(self, id):
        return self.__use_case.run(id)
