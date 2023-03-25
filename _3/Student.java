package oop._3;

public class Student {
    private String nome = null;
    private String cognome;
    private Integer etá;
    private String colorePreferito;
    private Integer numeroCivico;
    private Character votoProvaItinere;
    private Boolean repetuto;



    Student(String nome, String cognome, Integer etá, String colorePreferito, Integer numeroCivico) {
        this.nome = nome;
        this.cognome = cognome;
        this.etá = etá;
        this.colorePreferito = colorePreferito;
        this.numeroCivico = numeroCivico;
    }

    Student() {

    }

    public Student(String cognome, Character votoProvaItinere, Boolean repetuto) {
        this.cognome = cognome;
        this.votoProvaItinere = votoProvaItinere;
        this.repetuto = repetuto;
    }

    public String getNome() {

        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getColorePreferito() {
        return colorePreferito;
    }

    public Integer getEtá() {
        return etá;
    }

    public Integer getNumeroCivico() {
        return numeroCivico;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setColorePreferito(String colorePreferito) {
        this.colorePreferito = colorePreferito;
    }

    public void setNumeroCivico(Integer numeroCivico) {
        this.numeroCivico = numeroCivico;
    }

    public void setEtá(Integer etá) {
        this.etá = etá;

    }


    boolean idoneo() {
       return  ((votoProvaItinere.equals('A') || votoProvaItinere.equals('B')) && repetuto.equals(false));
    }


}