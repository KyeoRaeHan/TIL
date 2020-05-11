*** 합성곱 계층(Convolutional Layer, Conv Layer)**

\- MLNN(Multi-Layer Neural Network )의 문제를 해결하고자 만들어진 것이 합성곱 계층

\- 필기체나 MNIST 데이터 같은 **이미지 데이터는 일반적으로 채널, 세로, 가로 이렇게 3차원(height, width, channels) 크기의 3D 텐서으로 구성된 데이터**

\- Affine 계층에서는 이 3차원 데이터를 1차원 데이터(784=28*28)로 바꿔 입력했지만 합성곱에서는 3차원 데이터(1, 28, 28)를 입력하고 3차원의 데이터로 출력하므로 형상을 유지

\- CNN에서는 이러한 입출력 데이터를 특징맵(Feautre Map)

 

**(1)** **합성곱 계층 – 연산**



![img](https://k.kakaocdn.net/dn/xE7eU/btqzlFg1m6M/Ga4otAkpiy5gpS1HzbKks0/img.png)



(**2)** **합성곱 계층 - 패딩(Padding)**



![img](https://k.kakaocdn.net/dn/J7Vsd/btqzk8YgXvm/Ib2tAkMT8cqVkCdwb5m6CK/img.png)



 **패딩(Padding)은 합성곱 연산을 수행하기 전, 입력데이터 주변을 특정값으로 채워 늘리는 것**을 말한다

- 패딩(Padding)은 주로 출력데이터의 공간적(Spatial)크기를 조절하기 위해 사용.

- 패딩을 할 때, 채울 값은 hyperparameter로 어떤 값을 채울지 결정할 수 있다. 주로 zero-padding사용한다.

- 패딩을 사용하는 이유는 패딩을 사용하지 않을 경우, 데이터의 Spatial 크기는 Conv Layer를 지날 때 마다 작아지게 되므로, 가장자리의 정보들이 사라지는 문제가 발생하기 때문에 패딩을 사용한다.

  

**(3)** **합성곱** **계층** **-** **스트라이드 ****(Stride)**

 



![img](https://k.kakaocdn.net/dn/bp7XD3/btqzj9Yo3EX/m3XFSUwTtIh1Re3wnibWXK/img.png)



\- 스트라이드(Stride)는 입력데이터에 필터를 적용할 때 이동할 간격을 조절하는 것, 즉 필터가 이동할 간격을 말한다

\- 스트라이드(Stride) 또한 출력 데이터의 크기를 조절하기 위해 사용한다

\- 스트라이드(Stride)는 보통 1과 같이 작은 값이 더 잘 작동하며, Stride가 1일 경우 입력 데이터의 spatial 크기는 pooling 계층에서만 조절하게 할 수 있다.

 

(5) 풀링계층(Pooling Layer)

풀링계층은 합성곱 계층의 패딩과 스트라이드처럼 데이터의 공간적 크기를 축소하는데 사용

주로 합성곱 계층(Conv Layer)에서 출력데이터의 크기를 입력데이터의 크기 그대로 유지하고, 풀링계층(Pool 에서만 크기를 조절)

 

 con2d
 



![img](https://k.kakaocdn.net/dn/KQRV7/btqzlEPVkWK/cW7iZ1OMhSo4KwFavhokgk/img.png)
