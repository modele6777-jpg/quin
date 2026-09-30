package defpackage;

import ai.askquin.ui.onboard.model.UserIntentionType;
import android.content.Context;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fhf implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fhf(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                mhf mhfVar = (mhf) obj;
                ((x16) obj2).invoke();
                s0e s0eVar = mhfVar.S0;
                if (!mhfVar.Y0 && !((jhf) s0eVar.getValue()).c && !((jhf) s0eVar.getValue()).d) {
                    mhfVar.Y0 = true;
                    mhf.Q(mhfVar, "popup_view", null, null, 6);
                }
                return wefVar;
            case 1:
                mhf mhfVar2 = (mhf) obj;
                Context context = (Context) obj2;
                context.getClass();
                jhf jhfVar = (jhf) mhfVar2.S0.getValue();
                bwa bwaVar = jhfVar.b;
                if (bwaVar != null && !jhfVar.c && !jhfVar.d && !mhfVar2.q() && !jhfVar.f && jhfVar.a.contains(bwaVar)) {
                    y41.N(mhfVar2.P0, context, new i2e(26, mhfVar2, bwaVar), 2);
                }
                return wefVar;
            case 2:
                qmf qmfVar = (qmf) obj2;
                vb2 vb2Var = (vb2) obj;
                vb2Var.getClass();
                awe aweVarW = af1.W(if8.c, vb2Var);
                if (aweVarW != null) {
                    aweVarW.a(vb2Var);
                } else {
                    qmfVar.d().g("no one login available");
                }
                return wefVar;
            case 3:
                a26 a26Var = (a26) obj2;
                Set set = (Set) ((xzf) obj).d.getValue();
                a26Var.d(set.size() == 1 ? hfc.r((rzf) s72.u0(set)) : UserIntentionType.MultiSelector);
                return wefVar;
            case 4:
                x16 x16Var = (x16) obj2;
                vz9 vz9Var = ((c3g) obj).c;
                if (!((Boolean) vz9Var.getValue()).booleanValue()) {
                    vz9Var.setValue(Boolean.TRUE);
                    x16Var.invoke();
                }
                return wefVar;
            case 5:
                e89 e89Var = (e89) obj;
                e89Var.setValue(Integer.valueOf((((Number) e89Var.getValue()).intValue() + 1) % ((mx4) obj2).c()));
                return wefVar;
            default:
                ma8 ma8VarA = (ma8) obj;
                Long lB = ((xf3) ((wf3) obj2)).b();
                if (lB != null) {
                    long jLongValue = lB.longValue();
                    th5 th5Var = cye.b;
                    th5Var.getClass();
                    w57 w57Var = w57.a;
                    ma8VarA = gcc.E(mh3.x(jLongValue), th5Var).a();
                }
                return xdg.b(ma8VarA);
        }
    }

    public /* synthetic */ fhf(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
