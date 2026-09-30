package defpackage;

import java.time.DayOfWeek;
import java.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cwe implements l26 {
    public final /* synthetic */ int a;

    public /* synthetic */ cwe(int i) {
        this.a = i;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                fwe fweVar = (fwe) obj;
                nv2 nv2Var = (nv2) obj2;
                if (fweVar != null) {
                    return fweVar;
                }
                if (nv2Var instanceof fwe) {
                    return (fwe) nv2Var;
                }
                return null;
            case 1:
                kwe kweVar = (kwe) obj;
                nv2 nv2Var2 = (nv2) obj2;
                if (nv2Var2 instanceof fwe) {
                    fwe fweVar2 = (fwe) nv2Var2;
                    pv2 pv2Var = kweVar.a;
                    Object objC = fweVar2.c();
                    Object[] objArr = kweVar.b;
                    int i2 = kweVar.d;
                    objArr[i2] = objC;
                    fwe[] fweVarArr = kweVar.c;
                    kweVar.d = i2 + 1;
                    fweVarArr[i2] = fweVar2;
                }
                return kweVar;
            case 2:
                l46 l46Var = (l46) obj;
                ((Integer) obj2).getClass();
                l46Var.f0(490943643);
                rh5 rh5VarO = m93.o(0, 14);
                l46Var.r(false);
                return rh5VarO;
            case 3:
                ((Integer) obj2).getClass();
                ief.c(k99.P(1), (l46) obj);
                return wefVar;
            case 4:
                hj6.Y.d(obj);
                return wefVar;
            case 5:
                chf chfVar = (chf) obj2;
                ((pcc) obj).getClass();
                chfVar.getClass();
                return Boolean.valueOf(chfVar.a);
            case 6:
                ((Integer) obj).intValue();
                rzf rzfVar = (rzf) obj2;
                rzfVar.getClass();
                return rzfVar.getId();
            case 7:
                t2g t2gVar = (t2g) obj2;
                ((pcc) obj).getClass();
                t2gVar.getClass();
                LocalDate localDate = (LocalDate) t2gVar.c.getValue();
                LocalDate localDate2 = (LocalDate) t2gVar.d.getValue();
                LocalDate localDateA = ((v2g) s72.v0(((r2g) t2gVar.f.getValue()).a())).a();
                DayOfWeek dayOfWeek = (DayOfWeek) t2gVar.e.getValue();
                j18 j18Var = t2gVar.j;
                return t72.I(localDate, localDate2, localDateA, dayOfWeek, Integer.valueOf(j18Var.e.b.j()), Integer.valueOf(j18Var.e.c.j()));
            case 8:
                ((Integer) obj2).getClass();
                i3g.b(k99.P(1), (l46) obj);
                return wefVar;
            case 9:
                ((Integer) obj2).getClass();
                i3g.c(k99.P(7), (l46) obj);
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ((Integer) obj2).getClass();
                t4c.o(k99.P(1), (l46) obj);
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ((Integer) obj2).getClass();
                t4c.m(k99.P(1), (l46) obj);
                return wefVar;
            default:
                ((Integer) obj2).getClass();
                t4c.n(k99.P(1), (l46) obj);
                return wefVar;
        }
    }

    public /* synthetic */ cwe(int i, int i2) {
        this.a = i2;
    }
}
