package defpackage;

import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class pkg extends m4 {
    public final Set c;
    public final fhh d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pkg(String str) {
        super(7, str);
        Level level = Level.ALL;
        this.c = qkg.g;
        this.d = qkg.v;
    }

    @Override // defpackage.m4
    public final boolean x0(Level level) {
        return true;
    }

    @Override // defpackage.m4
    public final void y0(yfh yfhVar) {
        String strA = (String) yfhVar.d().r(vgh.a);
        if (strA == null) {
            strA = (String) this.b;
        }
        if (strA == null) {
            jgh jghVar = yfhVar.d;
            if (jghVar == null) {
                qc0.p("cannot request log site information prior to postProcess()");
                return;
            }
            strA = jghVar.a();
            int iIndexOf = strA.indexOf(36, strA.lastIndexOf(46));
            if (iIndexOf >= 0) {
                strA = strA.substring(0, iIndexOf);
            }
        }
        qkg.B0(yfhVar, arb.n(strA), Level.ALL, this.c, this.d);
    }
}
