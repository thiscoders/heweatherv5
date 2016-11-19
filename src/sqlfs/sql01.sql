--创建中国城市列表
create table china_cities(
  id varchar(30) primary key,
  cityEn varchar(30),
  cityZh varchar(30),
  countryCode varchar(30),
  countryEn varchar(30),
  countryZh varchar(30),
  provinceEn varchar(30),
  provinceZh varchar(30),
  leaderEn varchar(30),
  leaderZh varchar(30),
  lat varchar(30),
  lon varchar(30)
);