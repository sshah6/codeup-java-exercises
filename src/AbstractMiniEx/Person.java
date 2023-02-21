package AbstractMiniEx;
//================================= INTERFACE MINI EXERCISE
//        Consider the library scenerio from the previous mini-exercise.
//        Consider the following abstract class: Person
//        Person could be extended in these sub-types
//        Librarian
            //accessibility: //both media and person can be accessible to others
//        Archivist
            //StoringData:  //Both media and person can remember your thoughts
            //CategorizingData: // they both have the ability to Categorize data
//        Patron
            //SharingInfo: //Both can share information
            //Updating: //Both can help get the latest info
//        Researcher
            //Knowledge: //Both can have the same level of updated info
            //
//        etc.
//        Between Media and Person, what are some common interfaces that may exist? In other words, what are some things that can be done with or done to both Media and Person? Yet another way of considering the relationship between these two ideas: in what ways can you interact with
//        both a Person and form of Media in a library the same way?
//        For each shared aspect/way to interface with/interact with, create an interface. Define methods (no implementation) that one could expect
//        to do when interfacing with both a Person and a form of Media.
//        BONUS: consider the abstract class LibraryFurniture. What are additional interfaces or previously created interfaces that may be implemented by a LibraryFurniture class?
public interface Person {
    void accessiblity();        //Both Media and person are available to people
    void storingData();         //Both are able to store data (remember data)
    void categorizingData();        //Both are able to categorize data(info)
    void SharingInfo();         //Both are able to share the info (news)
    void upDating();        //Both helps you know about the latest info
}

//By LibraryFurniture: interface
//Accessiblity: //accessible to people
// void accessibilty();

