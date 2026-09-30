package defpackage;

import java.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wj6 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LocalDate b;
    public final /* synthetic */ a26 c;

    public /* synthetic */ wj6(int i, a26 a26Var, LocalDate localDate) {
        this.a = i;
        this.b = localDate;
        this.c = a26Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        a26 a26Var = this.c;
        LocalDate localDate = this.b;
        LocalDate localDate2 = (LocalDate) obj;
        switch (i) {
            case 0:
                localDate2.getClass();
                if (!pa7.t(localDate, localDate2)) {
                    a26Var.d(localDate2);
                }
                break;
            default:
                localDate2.getClass();
                if (!pa7.t(localDate, localDate2)) {
                    a26Var.d(localDate2);
                }
                break;
        }
        return wefVar;
    }
}
