from src.Productos.Application.UseCase.Productos.GetProductosUseCase import GetUseCase as UseCase, Port


class GetProductosController:
    def __init__(self, repository: Port):
        self.__use_case = UseCase(repository)

    def run(self):
        return self.__use_case.run()
