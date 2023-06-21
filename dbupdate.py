import sqlite3 as s

con = s.connect('store.db')
cur = con.cursor()

sql = 'INSERT INTO USER (id, name, age) values(?, ?, ?)'
data = [(7, 'Ruth', 25)]

cur.execute(sql, data)

con.commit()
con.close()