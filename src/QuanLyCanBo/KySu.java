package QuanLyCanBo;

public class KySu extends CanBo{
    private String NganhDaotao;

    public KySu() {
    }

    public KySu(String nganhDaotao) {
        NganhDaotao = nganhDaotao;
    }

    public KySu(String name, int age, String sex, String address, String nganhDaotao) {
        super(name, age, sex, address);
        NganhDaotao = nganhDaotao;
    }
    public String getNganhDaotao() {
        return NganhDaotao;
    }
    public void setNganhDaotao(String nganhDaotao) {
        NganhDaotao = nganhDaotao;
    }
    @Override
    public String toString() {
        return "KySu{" + super.toString() +
                "NganhDaotao='" + NganhDaotao + '\'' +
                '}';
    }
}
