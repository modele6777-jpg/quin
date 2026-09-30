package defpackage;

import java.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s2g implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t2g b;

    public /* synthetic */ s2g(t2g t2gVar, int i) {
        this.a = i;
        this.b = t2gVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        t2g t2gVar = this.b;
        Integer num = (Integer) obj;
        switch (i) {
            case 0:
                num.getClass();
                return ((v2g) s72.v0(((r2g) t2gVar.h.get(num)).a())).a();
            default:
                int iIntValue = num.intValue();
                LocalDate localDate = (LocalDate) t2gVar.a.getValue();
                LocalDate localDate2 = (LocalDate) t2gVar.c.getValue();
                LocalDate localDate3 = (LocalDate) t2gVar.d.getValue();
                localDate.getClass();
                localDate2.getClass();
                localDate3.getClass();
                LocalDate localDatePlusWeeks = localDate.plusWeeks(iIntValue);
                localDatePlusWeeks.getClass();
                return new u2g(localDatePlusWeeks, localDate2, localDate3).d;
        }
    }
}
