package cebulaDeal;

public class PersonControler {
    private PersonModel model;
    private PersonView view;

    public PersonControler(PersonModel model, PersonView view) {
        this.model = model;
        this.view = view;
    }

    public void setName(String name){
        this.model.setPersonName(name);
    }

    public String getName(){
        return this.model.getPersonName();
    }

    public void uptadeView(){
        this.view.printDetails(this.model);
    }
}

