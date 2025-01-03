# OnlineAIMakers
분산형 스터디 플랫폼 


AI에서 그룹 매칭 알고리즘을 구현 후 데이터를 제공할 것인지?

AI 팀이 관심사, 기술 수준, 목표를 기반으로 매칭 알고리즘을 설계하고 구현

AI가 매칭 결과를 제공하는 방식으로 하되, 백엔드 팀과 협업하여 데이터 저장 및 조회 기능을 API로 연결

구체적으로:

입력 데이터: 사용자 등록 시 입력한 관심 주제, 경험 수준, 목표 등.

출력 데이터: 매칭된 스터디 그룹의 정보(그룹 ID, 팀원 리스트, 목표 등).

추천 기준:
유사한 관심 주제
보완적 수준의 팀원 구성
활동 가능 시간대
---
활동 관리

퀴즈 같은 활동이 무엇인지 구체화할 필요가 있음

활동은 교육적인 요소와 참여도를 높이는 방식으로 설계

구체적인 활동 아이디어:

퀴즈: 매주 학습한 내용 기반의 OX 퀴즈, 다지선다형 문제.
예: "파이썬에서 리스트와 튜플의 차이는 무엇인가?"

과제: 프로젝트 기반으로 팀별 간단한 기능 구현.
예: AI 알고리즘의 동작 이해를 돕는 간단한 코드 작성.

발표: 팀별 주제를 선정해 매주 발표 (AI 논문 리뷰, 기술 발표 등).
토큰 보상: 각 활동에 대해 점수를 책정해 누적 토큰을 지급.
---
공모전

공모전 데이터를 가져오는 것뿐만 아니라, 팀이 공모전에 효과적으로 참여할 수 있도록 추천 시스템을 구축

AI 팀은 키워드 기반으로 적합한 공모전을 추천하는 알고리즘을 설계

입력: 사용자 관심 키워드(예: AI, 블록체인, 소셜 이슈).

출력: 키워드와 일치하는 공모전 리스트.

백엔드 팀은 공모전 데이터를 수집해 저장/조회 API를 제공.

프론트엔드 팀은 공모전 참여 페이지(팀 등록, 일정 관리 등)를 구현.
