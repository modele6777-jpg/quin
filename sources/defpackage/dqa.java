package defpackage;

import android.content.Context;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dqa {
    public final String a;
    public final vrb b;
    public final a26 c;
    public final aw2 d;
    public final Object e = new Object();
    public volatile cqa f;

    public dqa(String str, vrb vrbVar, a26 a26Var, aw2 aw2Var) {
        this.a = str;
        this.b = vrbVar;
        this.c = a26Var;
        this.d = aw2Var;
    }

    public final Object a(wn7 wn7Var, Object obj) {
        cqa cqaVar;
        Context context = (Context) obj;
        wn7Var.getClass();
        cqa cqaVar2 = this.f;
        if (cqaVar2 != null) {
            return cqaVar2;
        }
        synchronized (this.e) {
            try {
                if (this.f == null) {
                    Context applicationContext = context.getApplicationContext();
                    nw2 eu4Var = this.b;
                    a26 a26Var = this.c;
                    applicationContext.getClass();
                    List list = (List) a26Var.d(applicationContext);
                    aw2 aw2Var = this.d;
                    ek9 ek9Var = new ek9(21, applicationContext, this);
                    list.getClass();
                    sd5 sd5Var = new sd5(hj6.W0, new hl4(16), new hla(1, ek9Var));
                    if (eu4Var == null) {
                        eu4Var = new eu4(15);
                    }
                    this.f = new cqa(new cqa(new od3(sd5Var, t72.H(new lb3(list, null)), eu4Var, aw2Var)));
                }
                cqaVar = this.f;
                cqaVar.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return cqaVar;
    }
}
