from src.Productos.Application.UseCase.Productos.CreateProductosUseCase import CreateProductosUseCase as UseCase, Port


class CreateProductosController:
    def __init__(self, repository:Port):
        self.__use_case = UseCase(repository)

    def run(self, request):
        return self.__use_case.run(request.get_json())
