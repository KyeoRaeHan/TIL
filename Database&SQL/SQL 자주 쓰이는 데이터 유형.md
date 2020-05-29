### SQL 자주 쓰이는 데이터 유형

------------------------------------------------------

**CHARACTER(s)**

- 고정 길이 문자열 정보(Oracle, SQL Server 모두 CHAR로 표현)
- S는 기본 길이 1바이트, 최대길이 orcale 2000바이트, SQL Server 8000바이트
- S만큼 최대 길이를 갖고 고정길이를 가지고 있으므로 할당된 변수 값의 길이가 S보다 작을 경우에는 그 차이 길이만큼 공간으로 채워진다.



**VARCHAR(s)**

- CHARACTER VARYING의 약자로 가변 길이 문자열 정보(oracle은 VARCHAR2로 표현, SQL Server는 VARCHAR로 표현)
- S는 기본 길이 1바이트, 최대길이 orcale 2000바이트, SQL Server 8000바이트
- s만큼의 최대 길이를 갖지만 가변 길이로 조정이 되기 때문에 할당된 변수값의 바이트만 적용된다. (Limit개념)



**NUMERIC**

- 정수, 실자 등 숫자 정보(oracle은 number로, SQL Server는 10가지 이상의 숫자 타입을 가지고 있음)

- Oracle은 처음에 전체 자리 수를 지정하고, 그 다음 소수 부분의 자리 수를 지정한다. 예를 들어, 정수 부분이 6자리이고 소수점 부분이 2자리인 경우에는 **NUMBER(8,2)**와 같이 된다.

  

**DATETIME**

날짜와 시각정보 (oracle은 DATE로 표현, SQL Server는 DATETIME로 표현)

Oracle 1초 단위, SQL Server는 3.33ms(millisecond) 단위 관리