/* 
 * Material didático destinado ao curso de 
 * Programação Orientada a Objetos
 * do Bacharelado em Ciência da Computação do IFNMG 
 * - Câmpus Montes Claros.
 *
 * O uso deste material é livre e regido pela licença 
 * Creative Commons como Atribuição-NãoComercial
 * -CompartilhaIgual 4.0 Internacional:
 * http://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package io.github.guisso.viacepwstests;

/**
 * Classe Address
 *
 * <p>
 * Formato da resposta JSON gerada pelo web service ViaCEP
 * </p>
 * <pre>
 * {
 * "cep": "39404-058",
 * "logradouro": "Rua Dois",
 * "complemento": "",
 * "bairro": "Village do Lago I",
 * "localidade": "Montes Claros",
 * "uf": "MG",
 * "ibge": "3143302",
 * "gia": "",
 * "ddd": "38",
 * "siafi": "4865"
 * }
 * </pre>
 *
 * @author Luis Guisso &lt;luis dot guisso at ifnmg dot edu dot br&gt;
 * @version 0.1, 15/06/2022
 */
public class Address {

    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
    //</editor-fold>

    @Override
    public String toString() {
        return "Address{"
                + "cep=" + cep
                + ", logradouro=" + logradouro
                + ", complemento=" + complemento
                + ", bairro=" + bairro
                + ", localidade=" + localidade
                + ", uf=" + uf
                + '}';
    }

}
