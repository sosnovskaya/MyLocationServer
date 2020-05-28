-- Table: public.users

-- DROP TABLE public.users;

CREATE TABLE public.users
(
    id integer NOT NULL DEFAULT nextval('users_id_seq'::regclass),
    email character varying(245) COLLATE pg_catalog."default" NOT NULL,
    name character varying(245) COLLATE pg_catalog."default" NOT NULL,
    password character varying(245) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT users_pkey PRIMARY KEY (id)
)
    WITH (
        OIDS = FALSE
    )
    TABLESPACE pg_default;

ALTER TABLE public.users
    OWNER to postgres;

INSERT INTO public.users(
    id, email, name, password)
VALUES (1, 'ricunsos@gmail.com', 'Rita', 'qwer123');