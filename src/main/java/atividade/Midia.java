package atividade;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Midia {
    private long id;
    private String titulo;
    private int anoLancamento;
    private String classificacaoIndicativa;
    private LocalDate dataAquisicao;
    private String observacoes;

    public abstract String getInformacoes();
}

    // public long getId() {
    //     return this.id;
    // }

    // public void setId(long id) {
    //     this.id = id;
    // }

    // public String getTitulo() {
    //     return this.titulo;
    // }

    // public void setTitulo(String titulo) {
    //     this.titulo = titulo;
    // }

    // public int getAnoLancamento() {
    //     return this.anoLancamento;
    // }

    // public void setAnoLancamento(int anoLancamento) {
    //     this.anoLancamento = anoLancamento;
    // }

    // public String getClassificacaoIndicativa() {
    //     return this.classificacaoIndicativa;
    // }

    // public void setClassificacaoIndicativa(String classificacaoIndicativa) {
    //     this.classificacaoIndicativa = classificacaoIndicativa;
    // }

    // public LocalDate getDataAquisicao() {
    //     return this.dataAquisicao;
    // }

    // public void setDataAquisicao(LocalDate dataAquisicao) {
    //     this.dataAquisicao = dataAquisicao;
    // }

    // public String getObservacoes() {
    //     return this.observacoes;
    // }

    // public void setObservacoes(String observacoes) {
    //     this.observacoes = observacoes;
    // }
      

