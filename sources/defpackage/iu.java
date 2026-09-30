package defpackage;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class iu implements aw2, hga {
    public final View a;
    public final gte b;
    public final aw2 c;
    public final AtomicReference d = new AtomicReference(null);

    public iu(View view, gte gteVar, aw2 aw2Var) {
        this.a = view;
        this.b = gteVar;
        this.c = aw2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void a(bga bgaVar, zn2 zn2Var) {
        gu guVar;
        if (zn2Var instanceof gu) {
            guVar = (gu) zn2Var;
            int i = guVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                guVar.label = i - Integer.MIN_VALUE;
            } else {
                guVar = new gu(this, zn2Var);
            }
        } else {
            guVar = new gu(this, zn2Var);
        }
        Object obj = guVar.result;
        int i2 = guVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            l0 l0Var = new l0(7, bgaVar, this);
            hu huVar = new hu(this, null);
            guVar.label = 1;
            if (jgb.O(new x0d(l0Var, this.d, huVar, null), guVar) == bw2.a) {
                return;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            jzb.q(obj);
        }
        oo3.f();
    }

    @Override // defpackage.aw2
    public final pv2 getCoroutineContext() {
        return this.c.getCoroutineContext();
    }
}
