package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k8f implements a26 {
    public final /* synthetic */ int a;

    public /* synthetic */ k8f(l8f l8fVar) {
        this.a = 0;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                do7 do7Var = (do7) obj;
                do7Var.getClass();
                io7 io7Var = do7Var.a;
                if (io7Var == null) {
                    return "*";
                }
                yn7 yn7Var = do7Var.b;
                l8f l8fVar = yn7Var instanceof l8f ? (l8f) yn7Var : null;
                String strD = l8fVar != null ? l8fVar.d(true) : String.valueOf(yn7Var);
                int iOrdinal = io7Var.ordinal();
                if (iOrdinal == 0) {
                    return strD;
                }
                if (iOrdinal == 1) {
                    return "in ".concat(strD);
                }
                if (iOrdinal == 2) {
                    return "out ".concat(strD);
                }
                ap.c();
                return null;
            case 1:
                my myVar = (my) obj;
                myVar.getClass();
                return rs0.p(myVar);
            case 2:
                ((Long) obj).getClass();
                return wefVar;
            case 3:
                ((Long) obj).getClass();
                return wefVar;
            case 4:
                ((Long) obj).getClass();
                return wefVar;
            case 5:
                ((Long) obj).getClass();
                return wefVar;
            case 6:
                ((Long) obj).getClass();
                return wefVar;
            case 7:
                ((Long) obj).getClass();
                return wefVar;
            case 8:
                ((d6d) obj).getClass();
                return "share-bitmap-preview-strip";
            case 9:
                ((hxc) obj).getClass();
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                h81 h81Var = (h81) obj;
                h81Var.getClass();
                rt rtVarH = urg.h();
                rtVarH.d(0.0f);
                return h81Var.b(new trd(25, rtVarH));
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ((hxc) obj).getClass();
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return new chf(((Boolean) obj).booleanValue());
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                oif oifVar = (oif) obj;
                oifVar.getClass();
                return oifVar.i;
            case 14:
                hg3 hg3Var = (hg3) obj;
                hg3Var.getClass();
                z7f.u(hg3Var, ':');
                hg3.k(hg3Var);
                return wefVar;
            case 15:
                hg3 hg3Var2 = (hg3) obj;
                hg3Var2.getClass();
                hg3.k(hg3Var2);
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                hg3 hg3Var3 = (hg3) obj;
                hg3Var3.getClass();
                hg3Var3.a("z");
                return wefVar;
            case 17:
                hg3 hg3Var4 = (hg3) obj;
                hg3Var4.getClass();
                z7f.V(hg3Var4, "Z", new k8f(20));
                return wefVar;
            case 18:
                hg3 hg3Var5 = (hg3) obj;
                hg3Var5.getClass();
                hg3Var5.a("z");
                return wefVar;
            case 19:
                hg3 hg3Var6 = (hg3) obj;
                hg3Var6.getClass();
                z7f.V(hg3Var6, "Z", new k8f(21));
                return wefVar;
            case 20:
                hg3 hg3Var7 = (hg3) obj;
                hg3Var7.getClass();
                hg3.j(hg3Var7);
                z7f.u(hg3Var7, ':');
                hg3.i(hg3Var7);
                z7f.V(hg3Var7, "", new k8f(14));
                return wefVar;
            case 21:
                hg3 hg3Var8 = (hg3) obj;
                hg3Var8.getClass();
                hg3.j(hg3Var8);
                z7f.V(hg3Var8, "", new k8f(22));
                return wefVar;
            case 22:
                hg3 hg3Var9 = (hg3) obj;
                hg3Var9.getClass();
                hg3.i(hg3Var9);
                z7f.V(hg3Var9, "", new k8f(15));
                return wefVar;
            case 23:
                return wefVar;
            case 24:
                return new xz(((Float) obj).floatValue());
            case 25:
                return new xz(((Integer) obj).intValue());
            case 26:
                return Integer.valueOf((int) ((xz) obj).a);
            case 27:
                return new xz(((yi4) obj).a);
            case 28:
                return new yi4(((xz) obj).a);
            default:
                aj4 aj4Var = (aj4) obj;
                return new yz(aj4.a(aj4Var.a), aj4.b(aj4Var.a));
        }
    }

    public /* synthetic */ k8f(int i) {
        this.a = i;
    }
}
