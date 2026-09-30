package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qv2 implements l26 {
    public final /* synthetic */ int a;

    public /* synthetic */ qv2(int i) {
        this.a = i;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        pu4 pu4Var = pu4.a;
        List listI = null;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                return ((pv2) obj).p0((nv2) obj2);
            case 1:
                return ((pv2) obj).p0((nv2) obj2);
            case 2:
                g83 g83Var = (g83) obj2;
                ((pcc) obj).getClass();
                g83Var.getClass();
                e83 e83Var = g83Var.a;
                listI = e83Var != null ? t72.I(Boolean.valueOf(e83Var.a), Boolean.valueOf(e83Var.b)) : null;
                return listI == null ? pu4Var : listI;
            case 3:
                a93 a93Var = (a93) obj2;
                ((pcc) obj).getClass();
                a93Var.getClass();
                h83 h83Var = a93Var.a;
                if (h83Var != null) {
                    e83 e83Var2 = h83Var.a;
                    listI = t72.I(Integer.valueOf(e83Var2.a ? 1 : 0), Integer.valueOf(e83Var2.b ? 1 : 0), Integer.valueOf(h83Var.b), Integer.valueOf(h83Var.c));
                }
                return listI == null ? pu4Var : listI;
            case 4:
                mt8 mt8Var = (mt8) obj;
                Throwable cancellationException = (Throwable) obj2;
                mt8Var.getClass();
                za2 za2Var = mt8Var.b;
                if (cancellationException == null) {
                    cancellationException = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                za2Var.i0(cancellationException);
                return wefVar;
            case 5:
                nfc nfcVar = (nfc) obj;
                nfcVar.getClass();
                ((nz9) obj2).getClass();
                return new xof(af8.o(new pzd(9), lw2.a, new am(nfcVar, 3)));
            case 6:
                nfc nfcVar2 = (nfc) obj;
                nfcVar2.getClass();
                ((nz9) obj2).getClass();
                return new gd8(af8.o(new y25(11), lw2.a, new am(nfcVar2, 2)));
            case 7:
                nfc nfcVar3 = (nfc) obj;
                nfcVar3.getClass();
                ((nz9) obj2).getClass();
                return new zcb(af8.o(new yx4(21), lw2.a, new am(nfcVar3, 5)));
            case 8:
                nfc nfcVar4 = (nfc) obj;
                nfcVar4.getClass();
                ((nz9) obj2).getClass();
                return new p1c(af8.o(new yea(4), lw2.a, new am(nfcVar4, 4)));
            case 9:
                xf3 xf3Var = (xf3) obj2;
                Long lB = xf3Var.b();
                Long lValueOf = Long.valueOf(((n91) xf3Var.e.getValue()).e);
                z67 z67Var = xf3Var.a;
                return t72.I(lB, lValueOf, Integer.valueOf(z67Var.a), Integer.valueOf(z67Var.b), Integer.valueOf(xf3Var.a()));
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                cs3 cs3Var = (cs3) obj2;
                return t72.I(Integer.valueOf(((sz9) cs3Var.d.c).j()), Float.valueOf(mh3.n(((qz9) cs3Var.d.d).j(), -0.5f, 0.5f)), Integer.valueOf(cs3Var.l()));
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ((Integer) obj2).getClass();
                j74.C(k99.P(1), (l46) obj);
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                ((Integer) obj2).getClass();
                j74.x(k99.P(1), (l46) obj);
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                ((Integer) obj2).getClass();
                j74.Z(k99.P(1), (l46) obj);
                return wefVar;
            case 14:
                ((Integer) obj2).getClass();
                j74.F(k99.P(1), (l46) obj);
                return wefVar;
            case 15:
                ((Integer) obj2).getClass();
                j74.g(k99.P(1), (l46) obj);
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ((Integer) obj2).getClass();
                j74.M(k99.P(1), (l46) obj);
                return wefVar;
            case 17:
                ((Integer) obj2).getClass();
                j74.O(k99.P(1), (l46) obj);
                return wefVar;
            case 18:
                ((Integer) obj2).getClass();
                j74.J(k99.P(1), (l46) obj);
                return wefVar;
            case 19:
                ((Integer) obj2).getClass();
                j74.L(k99.P(1), (l46) obj);
                return wefVar;
            case 20:
                ((Integer) obj2).getClass();
                j74.m(k99.P(1), (l46) obj);
                return wefVar;
            case 21:
                ((Integer) obj2).getClass();
                j74.V(k99.P(1), (l46) obj);
                return wefVar;
            case 22:
                ((Integer) obj2).getClass();
                jgb.l(k99.P(1), (l46) obj);
                return wefVar;
            case 23:
                ((Integer) obj2).getClass();
                vd0.h(k99.P(1), (l46) obj);
                return wefVar;
            case 24:
                ((Integer) obj2).getClass();
                vd0.E(k99.P(1), (l46) obj);
                return wefVar;
            case 25:
                ((Integer) obj2).getClass();
                vd0.F(k99.P(1), (l46) obj);
                return wefVar;
            case 26:
                ((Integer) obj2).getClass();
                qk2.j(k99.P(1), (l46) obj);
                return wefVar;
            case 27:
                return Boolean.valueOf(pa7.t(obj, obj2));
            case 28:
                ((Integer) obj2).getClass();
                kj0.E(k99.P(1), (l46) obj);
                return wefVar;
            default:
                ((Integer) obj2).getClass();
                kj0.t(k99.P(1), (l46) obj);
                return wefVar;
        }
    }

    public /* synthetic */ qv2(int i, int i2) {
        this.a = i2;
    }
}
