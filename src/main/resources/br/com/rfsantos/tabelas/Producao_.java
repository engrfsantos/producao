package br.com.rfsantos.tabelas;

import java.sql.Time;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2020-12-08T14:02:28.240-0300")
@StaticMetamodel(Producao.class)
public class Producao_ {
	public static volatile SingularAttribute<Producao, Long> td01ProducaoId;
	public static volatile SingularAttribute<Producao, String> td01CodProduto;
	public static volatile SingularAttribute<Producao, String> td01Descricao;
	public static volatile SingularAttribute<Producao, Date> td01Dt;
	public static volatile SingularAttribute<Producao, Time> td01Hr;
	public static volatile SingularAttribute<Producao, String> td01Id;
	public static volatile SingularAttribute<Producao, String> td01Leitura;
	public static volatile SingularAttribute<Producao, String> td01Local;
	public static volatile SingularAttribute<Producao, String> td01Re;
	public static volatile SingularAttribute<Producao, String> td01Serie;
	public static volatile SingularAttribute<Producao, Integer> td01Status;
}
