CREATE TABLE `criminal_cases`(
    `id` int auto_increment primary key ,
    `name` varchar (255),
    `case_happen_time` long,
    `case_detail_id` int ,
    `procuratorate_id` int
)