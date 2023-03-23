package oop._3;

public class Student {
    private String nome = null;
    private String cognome;
    private Integer etá;
    private String colorePreferito;
    private Integer numeroCivico;
    private Integer maglietteSpedizioneDate = 0;//campo
    private Character votoProvaItinere;
    private Boolean repetuto;
    private Integer totaleVincitori;


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

    public Character getVotoProvaItinere() {


        return votoProvaItinere;
    }

    public void setVotoProvaItinere(Character votoProvaItinere) {
        if (votoProvaItinere.equals('A') || votoProvaItinere.equals('B')) {
            System.out.println("Ottimo lavoro");

        }
        this.votoProvaItinere = votoProvaItinere;
    }

    public Boolean getRepetuto() {
        return repetuto;
    }

    public void setRepetuto(Boolean repetuto) {
        if (repetuto.equals(false)) {
            System.out.println("Primo tentativo");
        }
        this.repetuto = repetuto;
    }

    public Integer getMaglietteSpedizioneDate() {
        return maglietteSpedizioneDate;
    }

    public void setMaglietteSpedizioneDate(Integer maglietteSpedizioneDate) {
        this.maglietteSpedizioneDate = maglietteSpedizioneDate;
    }

    public Integer getTotaleVincitori() {
        return totaleVincitori;
    }

    public void setTotaleVincitori(Integer totaleVincitori) {
        ;
        this.totaleVincitori = totaleVincitori;
    }

    Integer maglietteSpedizione() {
        maglietteSpedizioneDate++;
        return maglietteSpedizioneDate;
    }

    int esito() {
        int idoneo=0;
        int sum=0;
        if ((votoProvaItinere.equals('A') || votoProvaItinere.equals('B')) && repetuto.equals(false)) {
            idoneo++;

        }
        sum+=idoneo;

        return sum;


    }

}