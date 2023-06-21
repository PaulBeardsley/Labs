import sqlite3 as s

con = s.connect('store.db')
cur = con.cursor()

sql = 'INSERT INTO USER (name, age) values(?, ?)'
data = [
    ('Alice', 21),
    ('Bob', 22),
    ('Chris', 23),
    ('Daphne', 40),
    ('Edith', 12),
    ('Fiona', 22)
]

cur.executemany(sql, data)

con.commit()
con.close()