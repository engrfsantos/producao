package br.com.rfsantos.tabelas;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2020-12-08T14:02:28.213-0300")
@StaticMetamodel(ProdDefeito.class)
public class ProdDefeito_ {
	public static volatile SingularAttribute<ProdDefeito, Long> td01ProdDefeitoId;
	public static volatile SingularAttribute<ProdDefeito, String> td01Analise;
	public static volatile SingularAttribute<ProdDefeito, Integer> td01DefeitoId;
	public static volatile SingularAttribute<ProdDefeito, Date> td01Dt;
	public static volatile SingularAttribute<ProdDefeito, Integer> td01ProducaoId;
	public static volatile SingularAttribute<ProdDefeito, String> td01Reparo;
	public static volatile SingularAttribute<ProdDefeito, String> td01Serie;
	public static volatile SingularAttribute<ProdDefeito, Integer> td01Status;
}
