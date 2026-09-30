package defpackage;

import ai.askquin.R;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class eba {
    public static final x16 a(ka9 ka9Var, l46 l46Var) {
        Context context = (Context) l46Var.k(uq.b);
        context.getClass();
        String string = context.getString(R.string.personality_share_title);
        string.getClass();
        String string2 = context.getString(R.string.personality_share_summary);
        string2.getClass();
        a26 a26VarP = y8c.p(new w6d("https://quin.love/quin-card-test-intro?os=android&entry=share_icon", string, string2, R.drawable.personality_preview, "https://quin.love/images/personality_share_thumbnail.png"), null, l46Var, 2);
        Object objR = l46Var.R();
        if (objR == sf2.a) {
            ca2.a.getClass();
            objR = ca2.c ? new zh1(a26VarP, 28) : new vw5(ka9Var, 20);
            l46Var.p0(objR);
        }
        return (x16) objR;
    }
}
