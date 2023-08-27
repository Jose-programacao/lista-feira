package com.pedrofenixbidu.listafeira.modelo;

import java.io.Serializable;
import org.hibernate.validator.constraints.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import scala.math.BigDecimal;

@Entity
@Table(name = "Produto-Feira")
public class ListaFeiraModelo implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private UUID idProduto;
    private  String nomeEstabelecimento;
    private String localEstabelecimento;
    private String descricaoProduto;
    private BigDecimal valorProduto;
    private int quantidadeProduto;
    private BigDecimal valorTotalProduto;
    
    
    
    public ListaFeiraModelo(UUID idProduto, String nomeEstabelecimento, String localEstabelecimento,
            String descricaoProduto, BigDecimal valorProduto, int quantidadeProduto, BigDecimal valorTotalProduto) {
        this.idProduto = idProduto;
        this.nomeEstabelecimento = nomeEstabelecimento;
        this.localEstabelecimento = localEstabelecimento;
        this.descricaoProduto = descricaoProduto;
        this.valorProduto = valorProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.valorTotalProduto = valorTotalProduto;
    }

    
    public UUID getIdProduto() {
        return idProduto;
    }
    public void setIdProduto(UUID idProduto) {
        this.idProduto = idProduto;
    }
    public String getNomeEstabelecimento() {
        return nomeEstabelecimento;
    }
    public void setNomeEstabelecimento(String nomeEstabelecimento) {
        this.nomeEstabelecimento = nomeEstabelecimento;
    }
    public String getLocalEstabelecimento() {
        return localEstabelecimento;
    }
    public void setLocalEstabelecimento(String localEstabelecimento) {
        this.localEstabelecimento = localEstabelecimento;
    }
    public String getDescricaoProduto() {
        return descricaoProduto;
    }
    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }
    public BigDecimal getValorProduto() {
        return valorProduto;
    }
    public void setValorProduto(BigDecimal valorProduto) {
        this.valorProduto = valorProduto;
    }
    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }
    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }
    public BigDecimal getValorTotalProduto() {
        return valorTotalProduto;
    }
    public void setValorTotalProduto(BigDecimal valorTotalProduto) {
        this.valorTotalProduto = valorTotalProduto;
    }

    
    
}
