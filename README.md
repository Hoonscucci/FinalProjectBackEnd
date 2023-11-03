# Team Project

[팀 프로젝트 보러가기](https://github.com/SilverWithA/Final_project)

## League Of Legend 전적 검색 사이트 15.GG

게임 데이터를 이용한 전적 검색 + BackEnd 개발(Spring Boot)

## 프로젝트 소개

월간 최대 트래픽이 3700만이 넘는 사이트가 있을만큼 전적검색 사이트는 게이머들에게 친숙하고 꼭 필요한 존재가 되었다.
기존 사이트들의 단점인 클릭수를 최대한 줄여 빠르고 쉽게 원하는 데이터에 접할 수 있는 전적 검색 사이트 입니다.

## 개발 기간

2023.08.23 ~ 2023.10.24

## Back End

* 로그인 기능 구현
* 위젯 설정 기능
* 요청에 따른 데이터 서빙
* 배포

## Skills

<div>
<img src ="https://img.shields.io/badge/Java-007396?style=flat&logo=Java&logoColor=white" />
	<img src ="https://img.shields.io/badge/Springboot-6DB33F?style=flat&logo=spring&logoColor=white" />
 	<img src ="https://img.shields.io/badge/Amazon_AWS-232F3E?style=flat&logo=amazon-aws&logoColor=white" />
 	<img src ="https://img.shields.io/badge/Postman-FF6C37?style=flat&logo=postman&logoColor=white" />
  	<img src ="https://img.shields.io/badge/MySQL-00000F?style=flat&logo=mysql&logoColor=white" />

  </div>

## 서비스 구현

#### 1. 로그인 기능 구현
* 타 사이트는 로그인에 대한 메리트가 커뮤니티 이용 밖에 없다
* 비로그인 상태로 이용 하는 고객이 많다
* 회원가입의 장벽을 낮추기 위하여 ID, PW로 간단하게 로그인 가능하도록 구현
* 추후 개인정보가 추가 될수도 있다는 점을 고려하여 JWT로 구현

#### 2. 위젯 설정
* 빠른 데이터 접근을 위하여 홈화면에 위젯 기능 구현
* 회원가입시 위젯 컬럼들이 false로 설정되어 있고 위젯 클릭시 즉시 DB에 저장
* 재 로그인시 마지막으로 사용한 위젯이 홈 화면에 노출되도록 설계

#### 3. 요청에 따른 데이터 서빙
* client의 요청에 따라 알맞는 데이터를 서빙
* 정확한 데이터 서빙을 위하여 JPA를 사용 Query 어노테이션으로 DB조회하여 데이터 서빙

#### 4. 배포
* AWS EC2 인스턴스로 백엔드 서버, 프론트 서버 오픈, RDS 사용하여 MYSQL DB 생성
* AP 서버는 동적 코드 및 DB연동 등 보안이 필요하여 file zilla 사용 SFTP 방식으로 EC2 인스턴스에 전달
* WEB 서버는 유지보수가 간단한 GIT CLONE 방식으로 EC2 인스턴스에 전달

## 프로젝트 회고
* 기본적으로 백엔드에 대한 지식이 부족해서 개념과 기반을 잡고 가는데 많은 시간이 소요되어 아쉬웠다.
* 위젯 기능 설계시 사용자가 초기 설정한 모든 기본값들을 저장해서 보였다면 더 빠른 검색이 가능하지 않을까? 라는 생각이 프로젝트 후반부에 들었다.
* 이 경험들을 바탕으로 개인 프로젝트를 몇가지 더 진행해보고 백엔드 설계에 대한 공부를 조금 더 해야 된다는 생각이 들었다.
