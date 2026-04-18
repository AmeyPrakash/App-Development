# 📱 Java App Dev Playground

## 🚧 What is this?

This repo is where I’m learning **app development using Java + Eclipse + MySQL**.

It is not structured perfectly.
It is not clean all the time.
It *will* be a little random.

Think of it as:

> experiments + practice + mistakes + small wins

---

## 🛠️ Tech Stack

* Java
* Eclipse IDE
* MySQL
* JDBC
* Git

---

## 📂 Structure (kinda… not really)

```id="qk28zm"
/src
  ├── random/        → anything I tried that worked (or didn’t)
  ├── db/            → MySQL + JDBC experiments
  ├── oop/           → OOP concepts (sometimes clean, sometimes not)
  ├── dsa/           → practice problems
  ├── mini/          → small apps (very WIP)

/notes
  ├── errors.md      → things that broke and why
  ├── learnings.md   → random notes

/sql
  ├── queries.sql    → queries I tested
```

---

## 🧪 What you’ll find here

* Half-working code
* Fixed bugs (after struggle)
* JDBC connections that finally worked
* SQL queries (some good, some questionable)
* Random experiments while learning

---

## 🚀 Setup (if you really want to run this)

1. Install Java (JDK 17+)
2. Install Eclipse
3. Install MySQL

Create DB:

```sql id="z4f8pl"
CREATE DATABASE app_dev;
```

Update credentials somewhere in code:

```id="k91dsa"
url = jdbc:mysql://localhost:3306/app_dev
user = root
password = your_password
```

Add MySQL Connector/J in Eclipse and run files.

---

## 🧠 Why this repo exists

* Learn by doing (and breaking things)
* Understand Java + DB integration
* Get comfortable with real errors instead of tutorials
* Build small apps step by step

---

## ⚠️ Disclaimer

* Code may be messy
* Naming may be inconsistent
* Structure may change randomly
* Some things might just… exist

---

## 📈 Goal

Turn this chaos into:

* Clean projects
* Solid understanding
* Real app-building skills

---

## 🧾 Final Note

If something looks confusing here, it probably confused me too at some point.
