## pandas function

pd.read_excel(): 엑셀 파일을 읽어 dataframe으로 만든다.

df.head(): dataframe 상단 일부 데이터 미리보기

df.tail(): datafrmae 하단 일부 데이터 미리보기

df.loc[]: 인덱스 기준으로 행 데이터 읽기(index는 행번호, 문자열 등으로 이루어져 있다)

df.loc[[]]: 해당 열(row) dataframe형태로 꺼내기

df.iloc[]: 행 번호를 기준으로 행 데이터 읽기

df.corr(): 상관분석 

df.info(): 데이터 프레임에 대한 정보를 소개

df.shape(): 데이터 프레임의 크기를 확인한다

df.mean(): 변수별 평균값을 구한다.

df.std(): 변수별 표준편차값을 구한다.

df.isnull(): 결측값 여부를 확인한다.

df.describe(): 변수별 기초 통계(빈도, 평균, 최소/최댓값, 백분위수) 등을 확인한다.

Series.unique(): 변수의 고유값을 확인한다.

Series.value_counts(): 변수내 고유값들의 빈도 순위를 확인한다.

Series.dtype(): 변수의 data type을 확인한다.

df.plot(): 변수를 선 그래프로 시각화한다.

df.plot.hist(): 막대 그래프를 시각화한다.

df.plot.box(): Box 그래프를 시각화한다.

df.plot.kde(): 밀도 그래프를 시각화한다.
