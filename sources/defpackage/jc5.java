package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jc5 extends gbe implements l26 {
    final /* synthetic */ Context $context;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ kc5 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc5(kc5 kc5Var, Context context, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = kc5Var;
        this.$context = context;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new jc5(this.this$0, this.$context, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Intent intent;
        Intent intent2;
        int i = this.label;
        bw2 bw2Var = bw2.a;
        try {
            if (i == 0) {
                jzb.q(obj);
                this.this$0.b.setValue(Boolean.TRUE);
                ic5 ic5Var = new ic5(2, null);
                this.label = 1;
                obj = lw2.b(ic5Var, this);
                if (obj == bw2Var) {
                }
                return bw2Var;
            }
            if (i == 1) {
                jzb.q(obj);
            } else {
                if (i != 2) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                intent2 = (Intent) this.L$1;
                jzb.q(obj);
            }
            intent = intent2;
            Context context = this.$context;
            context.startActivity(Intent.createChooser(intent, context.getString(R.string.help_email_lbl)).addFlags(268435456));
            jcc.k(1, new Integer(R.string.chat_mind_help_choose_your_email_app));
            this.this$0.b.setValue(Boolean.FALSE);
            return wef.a;
            File file = (File) obj;
            intent = new Intent("android.intent.action.SEND");
            Context context2 = this.$context;
            intent.setType("application/zip");
            intent.putExtra("android.intent.extra.EMAIL", new String[]{context2.getString(R.string.help_email)});
            intent.putExtra("android.intent.extra.SUBJECT", "Bug report for Quin Android");
            hf8.Q.getClass();
            intent.putExtra("android.intent.extra.TEXT", "\n\n\n\n\n" + ((String) ef8.b.getValue()));
            if (file != null) {
                intent.addFlags(1);
                intent.putExtra("android.intent.extra.STREAM", xo1.B(file));
                if (Build.VERSION.SDK_INT >= 29) {
                    hc5 hc5Var = new hc5(file, null);
                    this.L$0 = null;
                    this.L$1 = intent;
                    this.L$2 = null;
                    this.label = 2;
                    if (lw2.b(hc5Var, this) != bw2Var) {
                        intent2 = intent;
                        intent = intent2;
                    }
                    return bw2Var;
                }
            }
            Context context3 = this.$context;
            context3.startActivity(Intent.createChooser(intent, context3.getString(R.string.help_email_lbl)).addFlags(268435456));
            jcc.k(1, new Integer(R.string.chat_mind_help_choose_your_email_app));
            this.this$0.b.setValue(Boolean.FALSE);
            return wef.a;
        } catch (Throwable th) {
            this.this$0.b.setValue(Boolean.FALSE);
            throw th;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((jc5) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
