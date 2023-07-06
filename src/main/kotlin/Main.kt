fun main() {
var library=Library()
            library.addingBooks(Book("Born a crime","Trevor Noah", 1990,"978-0446310789"))
            library.addingBooks(Book("To Kill a Mockingbird", "Harper Lee", 1990, "978-0446310789"))
            library.addingBooks(Book("1984", "George Orwell", 1990, "978-0451524935"))
            library.removeBooks("978-0446310789")
            library.listingBooks()




}
//Project: Simple Library Management System
//The goal of this project is to create a Simple Library
//Management System that allows users to manage a collection of books
//by adding, removing, and listing them. You will be working with Kotlin concepts
//like variables, data types, arrays, array methods, strings,
//string methods, functions, and classes

 class Book(val title:String,val author:String,val yearPublished:Int,val ISBN:String)

class Library{
    val book= mutableListOf<Book>()

fun addingBooks(book:Book){
    book.add(book)
//
}
fun removeBooks(ISBN: String){
    book.removeIf{ it.ISBN ==ISBN}

}
fun listingBooks(){
    for(x in book) {
        println("${book.title} by ${book.author} ${book.yearPublished})")

    }
}

}
