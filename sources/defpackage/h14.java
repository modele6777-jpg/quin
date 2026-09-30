package defpackage;

import ai.askquin.ui.popup.dailyfortune.DailyFortuneGuideTrigger;
import ai.askquin.ui.popup.dailyfortune.v;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h14 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aw2 b;
    public final /* synthetic */ v c;
    public final /* synthetic */ mma d;
    public final /* synthetic */ ka9 e;

    public /* synthetic */ h14(aw2 aw2Var, v vVar, mma mmaVar, ka9 ka9Var, int i) {
        this.a = i;
        this.b = aw2Var;
        this.c = vVar;
        this.d = mmaVar;
        this.e = ka9Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        aw2 aw2Var = this.b;
        switch (i) {
            case 0:
                ynb.V(aw2Var, null, null, new l24(this.c, DailyFortuneGuideTrigger.FirstReadingCompleted, this.d, this.e, null), 3);
                break;
            case 1:
                ynb.V(aw2Var, null, null, new l24(this.c, DailyFortuneGuideTrigger.PaywallInterceptClose, this.d, this.e, null), 3);
                break;
            case 2:
                ynb.V(aw2Var, null, null, new j24(this.c, this.d, this.e, null), 3);
                break;
            case 3:
                ka9 ka9Var = this.e;
                ynb.V(aw2Var, null, null, new k24(this.c, this.d, ka9Var, new a40(ka9Var, 19), null), 3);
                break;
            case 4:
                ka9 ka9Var2 = this.e;
                ynb.V(aw2Var, null, null, new k24(this.c, this.d, ka9Var2, new a40(ka9Var2, 20), null), 3);
                break;
            default:
                ka9 ka9Var3 = this.e;
                ynb.V(aw2Var, null, null, new k24(this.c, this.d, ka9Var3, new a40(ka9Var3, 18), null), 3);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ h14(ka9 ka9Var, aw2 aw2Var, v vVar, mma mmaVar, int i) {
        this.a = i;
        this.e = ka9Var;
        this.b = aw2Var;
        this.c = vVar;
        this.d = mmaVar;
    }
}
