package ListaPoo.Questao4;

public class Ferramenta extends ItemDeLoja {

    private String categoria;
    private Integer serial;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getSerial() {
        return serial;
    }

    public void setSerial(Integer serial) {
        this.serial = serial;
    }

    @Override
    public int getIdentificador() {
        return this.serial;
    }
    public void separar(){
        System.out.println("outros");
    }

    public void separar(String categoria){
        System.out.println(this.categoria);
    }
}
