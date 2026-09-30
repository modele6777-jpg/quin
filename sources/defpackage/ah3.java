package defpackage;

import java.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ah3 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a26 b;
    public final /* synthetic */ LocalDate c;

    public /* synthetic */ ah3(int i, a26 a26Var, LocalDate localDate) {
        this.a = i;
        this.b = a26Var;
        this.c = localDate;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        LocalDate localDate = this.c;
        a26 a26Var = this.b;
        switch (i) {
            case 0:
                a26Var.d(localDate);
                break;
            case 1:
                a26Var.d(localDate);
                break;
            case 2:
                String string = localDate.toString();
                string.getClass();
                a26Var.d(string);
                break;
            case 3:
                a26Var.d(localDate);
                break;
            default:
                a26Var.d(localDate);
                break;
        }
        return wefVar;
    }
}
