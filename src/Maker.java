public abstract class Maker {
    Telephone telephone;
    public  Maker(Telephone telephone){
        this.telephone=telephone;
    }
    void show(){
        type();
         telephone.setPhone();
    }
    abstract void type();

}
