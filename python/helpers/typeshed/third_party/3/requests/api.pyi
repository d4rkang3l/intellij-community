# Stubs for requests.api (Python 3)

from typing import Optional, Union, Any, Iterable, Mapping, Tuple

from .models import Response

ParamsMappingValueType = Union[str, bytes, int, float, Iterable[Union[str, bytes, int, float]]]

def request(method: str, url: str, **kwargs) -> Response: ...
def get(url: Union[str, bytes],
        params: Optional[
            Union[
                Mapping[Union[str, bytes, int, float], ParamsMappingValueType],
                Union[str, bytes],
                Tuple[Union[str, bytes, int, float], ParamsMappingValueType],
                Mapping[str, ParamsMappingValueType],
                Mapping[bytes, ParamsMappingValueType],
                Mapping[int, ParamsMappingValueType],
                Mapping[float, ParamsMappingValueType]]]=None,
        **kwargs) -> Response: ...
def options(url: str, **kwargs) -> Response: ...
def head(url: str, **kwargs) -> Response: ...
def post(url: str, data=..., json=..., **kwargs) -> Response: ...
def put(url: str, data=..., **kwargs) -> Response: ...
def patch(url: str, data=..., **kwargs) -> Response: ...
def delete(url: str, **kwargs) -> Response: ...
