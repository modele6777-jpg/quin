package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nog implements i26 {
    public static final /* synthetic */ nog b = new nog(0);
    public static final /* synthetic */ nog c = new nog(1);
    public static final /* synthetic */ nog d = new nog(2);
    public static final /* synthetic */ nog e = new nog(3);
    public final /* synthetic */ int a;

    public /* synthetic */ nog(int i) {
        this.a = i;
    }

    @Override // defpackage.i26
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                Context context = (Context) obj;
                String strB = oog.b;
                if (strB == null) {
                    synchronized (oog.class) {
                        try {
                            strB = oog.b;
                            if (strB == null) {
                                strB = a8h.b(context, "com.google.android.gms.measurement");
                                oog.b = strB;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return strB;
            case 1:
                fnb fnbVar = jch.h;
                return "";
            case 2:
                k9h k9hVar = (k9h) obj;
                hdh hdhVarX = idh.x();
                if (k9hVar == null) {
                    return (idh) hdhVarX.e();
                }
                for (m9h m9hVar : k9hVar.v()) {
                    jdh jdhVarX = kdh.x();
                    String strR = m9hVar.r();
                    jdhVarX.c();
                    ((kdh) jdhVarX.b).y(strR);
                    int iF = m9hVar.F();
                    int i = iF - 1;
                    if (iF == 0) {
                        throw null;
                    }
                    if (i == 0) {
                        long jS = m9hVar.s();
                        jdhVarX.c();
                        ((kdh) jdhVarX.b).z(jS);
                    } else if (i == 1) {
                        boolean zT = m9hVar.t();
                        jdhVarX.c();
                        ((kdh) jdhVarX.b).A(zT);
                    } else if (i == 2) {
                        double dU = m9hVar.u();
                        jdhVarX.c();
                        ((kdh) jdhVarX.b).B(dU);
                    } else if (i == 3) {
                        String strV = m9hVar.v();
                        jdhVarX.c();
                        ((kdh) jdhVarX.b).C(strV);
                    } else {
                        if (i != 4) {
                            qc0.p("No known flag type");
                            return null;
                        }
                        xlg xlgVarW = m9hVar.w();
                        jdhVarX.c();
                        ((kdh) jdhVarX.b).D(xlgVarW);
                    }
                    kdh kdhVar = (kdh) jdhVarX.e();
                    hdhVarX.c();
                    ((idh) hdhVarX.b).D(kdhVar);
                }
                String strU = k9hVar.u();
                hdhVarX.c();
                ((idh) hdhVarX.b).B(strU);
                String strR2 = k9hVar.r();
                hdhVarX.c();
                ((idh) hdhVarX.b).z(strR2);
                long jW = k9hVar.w();
                hdhVarX.c();
                ((idh) hdhVarX.b).C(jW);
                if (k9hVar.s()) {
                    xlg xlgVarT = k9hVar.t();
                    hdhVarX.c();
                    ((idh) hdhVarX.b).A(xlgVarT);
                }
                return (idh) hdhVarX.e();
            default:
                o9h o9hVar = (o9h) obj;
                if (o9hVar.a() != 29514) {
                    throw o9hVar;
                }
                pah pahVarU = qah.u();
                iah iahVarE = jah.E();
                long jCurrentTimeMillis = System.currentTimeMillis();
                iahVarE.c();
                ((jah) iahVarE.b).G(jCurrentTimeMillis);
                pahVarU.c();
                ((qah) pahVarU.b).v((jah) iahVarE.e());
                return (qah) pahVarU.e();
        }
    }
}
