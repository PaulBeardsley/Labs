import sqlite3 as s

con = s.connect('store.db')
cur = con.cursor()

sql = 'INSERT INTO USER (id, name, age) values(?, ?, ?)'
data = [
    (1, 'Alice', 21),
    (2, 'Bob', 22),
    (3, 'Chris', 23),
    (4, 'Daphne', 40),
    (5, 'Edith', 12),
    (6, 'Fiona', 22)
]

cur.executemany(sql, data)

con.commit()
con.close()