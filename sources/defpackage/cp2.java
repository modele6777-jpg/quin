package defpackage;

import ai.askquin.R;
import ai.askquin.ui.onboard.OnboardingActivity;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cp2 implements xj5 {
    public final /* synthetic */ m7 a;
    public final /* synthetic */ Context b;

    public cp2(m7 m7Var, Context context) {
        this.a = m7Var;
        this.b = context;
    }

    @Override // defpackage.xj5
    public final /* bridge */ /* synthetic */ Object a(Object obj, xn2 xn2Var) {
        return b(((Boolean) obj).booleanValue(), xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(boolean z, xn2 xn2Var) {
        bp2 bp2Var;
        if (xn2Var instanceof bp2) {
            bp2Var = (bp2) xn2Var;
            int i = bp2Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bp2Var.label = i - Integer.MIN_VALUE;
            } else {
                bp2Var = new bp2(this, xn2Var);
            }
        } else {
            bp2Var = new bp2(this, xn2Var);
        }
        Object obj = bp2Var.result;
        int i2 = bp2Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            jcc.k(1, new Integer(R.string.chat_mind_signin_error_invalidated_login));
            bp2Var.Z$0 = z;
            bp2Var.label = 1;
            Object objA = ((sn3) this.a).a(bp2Var);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        Context context = this.b;
        context.getClass();
        Intent intent = new Intent(context, (Class<?>) OnboardingActivity.class);
        intent.setFlags(268468224);
        intent.putExtra("KEY_START_DESTINATION", "sign_in");
        context.startActivity(intent);
        return wef.a;
    }
}
