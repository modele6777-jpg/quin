package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qv extends gbe implements a26 {
    final /* synthetic */ ume $dataProvider;
    int label;
    final /* synthetic */ rv this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qv(rv rvVar, ume umeVar, xn2 xn2Var) {
        super(1, xn2Var);
        this.this$0 = rvVar;
        this.$dataProvider = umeVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new qv(this.this$0, this.$dataProvider, (xn2) obj).r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        ov ovVar;
        int i = this.label;
        wef wefVar = wef.a;
        int i2 = 1;
        try {
            if (i == 0) {
                jzb.q(obj);
                pv pvVar = new pv();
                rv rvVar = this.this$0;
                ume umeVar = this.$dataProvider;
                rvVar.getClass();
                ov ovVar2 = new ov(pvVar, new mv(rvVar, umeVar, 0), new mv(rvVar, umeVar, 1), rvVar.a);
                a26 a26Var = rvVar.b;
                if (a26Var != null && (ovVar = (ov) a26Var.d(ovVar2)) != null) {
                    ovVar2 = ovVar;
                }
                Looper looperMyLooper = Looper.myLooper();
                Handler handler = this.this$0.a.getHandler();
                Looper looper = handler != null ? handler.getLooper() : null;
                rv rvVar2 = this.this$0;
                if (looperMyLooper != looper) {
                    c0 c0Var = rvVar2.i;
                    if (c0Var == null) {
                        c0Var = new c0(rvVar2, ovVar2, pvVar, i2);
                        rvVar2.i = c0Var;
                    }
                    rvVar2.a.post(c0Var);
                } else {
                    ActionMode actionModeStartActionMode = rvVar2.a.startActionMode(new vj5(ovVar2), 1);
                    if (actionModeStartActionMode == null) {
                        return wefVar;
                    }
                    rvVar2.h = actionModeStartActionMode;
                }
                this.label = 1;
                Object objM = pvVar.a.m(this);
                bw2 bw2Var = bw2.a;
                if (objM != bw2Var) {
                    objM = wefVar;
                }
                if (objM == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
            }
            this.this$0.e.a();
            Looper looperMyLooper2 = Looper.myLooper();
            Handler handler2 = this.this$0.a.getHandler();
            Looper looper2 = handler2 != null ? handler2.getLooper() : null;
            rv rvVar3 = this.this$0;
            if (looperMyLooper2 != looper2) {
                Runnable j1Var = rvVar3.j;
                if (j1Var == null) {
                    j1Var = new j1(5, rvVar3);
                    rvVar3.j = j1Var;
                }
                rvVar3.a.post(j1Var);
            } else {
                ActionMode actionMode = rvVar3.h;
                if (actionMode != null) {
                    actionMode.finish();
                }
            }
            rv rvVar4 = this.this$0;
            c0 c0Var2 = rvVar4.i;
            if (c0Var2 != null) {
                rvVar4.a.removeCallbacks(c0Var2);
            }
            this.this$0.h = null;
            return wefVar;
        } catch (Throwable th) {
            this.this$0.e.a();
            Looper looperMyLooper3 = Looper.myLooper();
            Handler handler3 = this.this$0.a.getHandler();
            Looper looper3 = handler3 != null ? handler3.getLooper() : null;
            rv rvVar5 = this.this$0;
            if (looperMyLooper3 != looper3) {
                Runnable j1Var2 = rvVar5.j;
                if (j1Var2 == null) {
                    j1Var2 = new j1(5, rvVar5);
                    rvVar5.j = j1Var2;
                }
                rvVar5.a.post(j1Var2);
            } else {
                ActionMode actionMode2 = rvVar5.h;
                if (actionMode2 != null) {
                    actionMode2.finish();
                }
            }
            rv rvVar6 = this.this$0;
            c0 c0Var3 = rvVar6.i;
            if (c0Var3 != null) {
                rvVar6.a.removeCallbacks(c0Var3);
            }
            this.this$0.h = null;
            throw th;
        }
    }
}
