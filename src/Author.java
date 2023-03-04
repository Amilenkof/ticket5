public class Author {
    String name;
    String surName;

    @Override
    public String toString() {
        return "Автор : " +" имя " + name +" ,фамилия "+ surName;
    }

    public Author(String name,String surName) {
        this.name = name;
        this.surName = surName;

    }
}
