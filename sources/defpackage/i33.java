package defpackage;

import ai.askquin.R;
import android.content.Context;
import java.io.Serializable;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class i33 extends ewf {
    public final d43 b;

    public i33(d43 d43Var) {
        this.b = d43Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable f(String str, zn2 zn2Var) {
        h33 h33Var;
        if (zn2Var instanceof h33) {
            h33Var = (h33) zn2Var;
            int i = h33Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                h33Var.label = i - Integer.MIN_VALUE;
            } else {
                h33Var = new h33(this, zn2Var);
            }
        } else {
            h33Var = new h33(this, zn2Var);
        }
        Object objP0 = h33Var.result;
        int i2 = h33Var.label;
        if (i2 == 0) {
            jzb.q(objP0);
            ma8 ma8VarA = ka8.a(ma8.Companion, str);
            h33Var.L$0 = null;
            h33Var.label = 1;
            int i3 = d43.c;
            js3 js3Var = ga4.a;
            objP0 = ynb.p0(hr3.c, new a43(this.b, ma8VarA, false, null), h33Var);
            bw2 bw2Var = bw2.a;
            if (objP0 == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(objP0);
        }
        r33 r33Var = (r33) objP0;
        TarotCardChoice tarotCardChoiceN = r33Var != null ? o5c.n(r33Var) : null;
        if (tarotCardChoiceN != null) {
            return tarotCardChoiceN;
        }
        Context context = cn1.P0;
        throw new IllegalStateException(context != null ? context.getString(R.string.network_common_error) : null);
    }
}
