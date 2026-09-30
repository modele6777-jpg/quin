package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import android.content.Context;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xve {
    public final xof a;
    public final gpf b;
    public final t7 c;
    public final vve d;

    public xve(xof xofVar, gpf gpfVar, t7 t7Var) {
        this.a = xofVar;
        this.b = gpfVar;
        this.c = t7Var;
        this.d = new vve(xofVar.b);
    }

    public static void a(mfc mfcVar) {
        hs3 hs3Var = xqa.p0;
        String strName = mfcVar.name();
        ynb.V(lw2.a, null, null, new qve(hs3Var.a, strName, null), 3);
        int iOrdinal = mfcVar.ordinal();
        if (iOrdinal == 0) {
            li4.a.k(0);
            li4.c(0);
        } else if (iOrdinal != 1) {
            ap.c();
        } else {
            li4.a.k(2);
            li4.c(2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:48:0x0122 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ec, code lost:
    
        if (r2.j(r13, r0) == r9) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.zn2 r12, defpackage.mfc r13, android.content.Context r14) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xve.b(zn2, mfc, android.content.Context):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(zn2 zn2Var, mfc mfcVar, Context context) {
        wve wveVar;
        if (zn2Var instanceof wve) {
            wveVar = (wve) zn2Var;
            int i = wveVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                wveVar.label = i - Integer.MIN_VALUE;
            } else {
                wveVar = new wve(this, zn2Var);
            }
        } else {
            wveVar = new wve(this, zn2Var);
        }
        Object objB = wveVar.result;
        int i2 = wveVar.label;
        if (i2 == 0) {
            jzb.q(objB);
            wj5 wj5Var = this.a.b;
            wveVar.L$0 = context;
            wveVar.L$1 = mfcVar;
            wveVar.label = 1;
            objB = tm7.B(wj5Var, wveVar);
            bw2 bw2Var = bw2.a;
            if (objB == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mfcVar = (mfc) wveVar.L$1;
            context = (Context) wveVar.L$0;
            jzb.q(objB);
        }
        TarotSkinIdentify tarotSkinIdentifyN = r8c.n(((yof) objB).g.name(), mfcVar);
        List list = g6g.a;
        g6g.h(context, tarotSkinIdentifyN);
        return wef.a;
    }
}
