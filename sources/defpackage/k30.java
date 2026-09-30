package defpackage;

import ai.askquin.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k30 implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k40 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ k30(k40 k40Var, boolean z, int i) {
        this.a = i;
        this.b = k40Var;
        this.c = z;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i;
        int i2;
        String strI;
        int i3 = this.a;
        wef wefVar = wef.a;
        boolean z = this.c;
        k40 k40Var = this.b;
        switch (i3) {
            case 0:
                j09 j09Var = (j09) obj;
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                j09Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= l46Var.g(j09Var) ? 4 : 2;
                }
                if (l46Var.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                    m93.i(k40Var, z, j09Var, l46Var, (iIntValue << 6) & 896);
                } else {
                    l46Var.Z();
                }
                return wefVar;
            default:
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((c31) obj).getClass();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    l46Var2.Z();
                    return wefVar;
                }
                l46Var2.f0(330291263);
                ArrayList arrayList = k40Var.b;
                ArrayList arrayList2 = new ArrayList(t72.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                int i4 = 0;
                while (true) {
                    String strM = null;
                    if (!it.hasNext()) {
                        l46Var2.r(false);
                        l46Var2.f0(330298477);
                        ArrayList arrayList3 = k40Var.a;
                        ArrayList arrayList4 = new ArrayList(t72.u(arrayList3, 10));
                        int i5 = 0;
                        for (Object obj4 : arrayList3) {
                            int i6 = i5 + 1;
                            if (i5 < 0) {
                                t72.Z();
                                throw null;
                            }
                            qhe qheVar = (qhe) obj4;
                            g19 g19Var = (g19) s72.y0(i5, g19.b);
                            if (g19Var == null) {
                                l46Var2.f0(562773398);
                                l46Var2.r(false);
                                strI = null;
                            } else {
                                l46Var2.f0(-1644414005);
                                switch (g19Var.ordinal()) {
                                    case 0:
                                        i = -1033660509;
                                        i2 = R.string.month_january;
                                        break;
                                    case 1:
                                        i = -1033657500;
                                        i2 = R.string.month_february;
                                        break;
                                    case 2:
                                        i = -1033654559;
                                        i2 = R.string.month_march;
                                        break;
                                    case 3:
                                        i = -1033651711;
                                        i2 = R.string.month_april;
                                        break;
                                    case 4:
                                        i = -1033648929;
                                        i2 = R.string.month_may;
                                        break;
                                    case 5:
                                        i = -1033646176;
                                        i2 = R.string.month_june;
                                        break;
                                    case 6:
                                        i = -1033643392;
                                        i2 = R.string.month_july;
                                        break;
                                    case 7:
                                        i = -1033640542;
                                        i2 = R.string.month_august;
                                        break;
                                    case 8:
                                        i = -1033637531;
                                        i2 = R.string.month_september;
                                        break;
                                    case 9:
                                        i = -1033634493;
                                        i2 = R.string.month_october;
                                        break;
                                    case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                        i = -1033631484;
                                        i2 = R.string.month_november;
                                        break;
                                    case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                        i = -1033628412;
                                        i2 = R.string.month_december;
                                        break;
                                    default:
                                        ap.c();
                                        return null;
                                }
                                strI = tec.i(l46Var2, i, i2, l46Var2, false);
                                l46Var2.r(false);
                            }
                            arrayList4.add(new j95(qheVar, strI));
                            i5 = i6;
                        }
                        l46Var2.r(false);
                        o8c.d(arrayList2, arrayList4, null, l46Var2, 0);
                        return wefVar;
                    }
                    Object next = it.next();
                    int i7 = i4 + 1;
                    if (i4 < 0) {
                        t72.Z();
                        throw null;
                    }
                    qhe qheVar2 = (qhe) next;
                    kg4 kg4Var = (kg4) s72.y0(i4, kg4.c);
                    if (kg4Var == null) {
                        l46Var2.f0(834322036);
                    } else {
                        l46Var2.f0(-1081465043);
                        strM = tm7.m(kg4Var, z, l46Var2, 1);
                    }
                    l46Var2.r(false);
                    arrayList2.add(new j95(qheVar2, strM));
                    i4 = i7;
                }
                break;
        }
    }
}
