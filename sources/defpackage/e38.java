package defpackage;

import ai.askquin.ui.sync.LegacyImportWorker;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class e38 extends gbe implements l26 {
    Object L$0;
    int label;
    final /* synthetic */ LegacyImportWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e38(LegacyImportWorker legacyImportWorker, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = legacyImportWorker;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new e38(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            LegacyImportWorker legacyImportWorker = this.this$0;
            int i2 = LegacyImportWorker.y;
            ((s7) legacyImportWorker.w.getValue()).getClass();
            String strA = s7.a();
            boolean zQ = v4e.Q(strA);
            LegacyImportWorker legacyImportWorker2 = this.this$0;
            if (zQ) {
                legacyImportWorker2.d().e("LegacyImportWorker skipped: no signed-in account");
                return new t88();
            }
            legacyImportWorker2.d().e("LegacyImportWorker started (safety net) for ".concat(strA));
            q28 q28Var = q28.a;
            nb4 nb4Var = (nb4) this.this$0.g.getValue();
            yt6 yt6Var = (yt6) this.this$0.v.getValue();
            m62 m62Var = (m62) this.this$0.x.getValue();
            this.L$0 = null;
            this.label = 1;
            obj = q28Var.a(nb4Var, yt6Var, strA, m62Var, q28.d, this);
            bw2 bw2Var = bw2.a;
            if (obj == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        int iOrdinal = ((b38) obj).ordinal();
        if (iOrdinal == 0) {
            return new t88();
        }
        if (iOrdinal == 1) {
            return new t88();
        }
        if (iOrdinal == 2) {
            return new s88();
        }
        ap.c();
        return null;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((e38) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
