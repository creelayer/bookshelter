create table public.book
(
    id  bigint not null primary key,
    created_at timestamp(6) not null,
    name       varchar(10),
    updated_at timestamp(6) not null
);


